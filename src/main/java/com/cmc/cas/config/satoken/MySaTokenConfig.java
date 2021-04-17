package com.cmc.cas.config.satoken;

import cn.dev33.satoken.interceptor.SaRouteInterceptor;
import cn.dev33.satoken.router.SaRouterUtil;
import cn.dev33.satoken.stp.StpUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Collections;

@Configuration
public class MySaTokenConfig implements WebMvcConfigurer {
    // 注册sa-token的拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册路由拦截器，自定义验证规则
        registry.addInterceptor(new SaRouteInterceptor((request, response, handler) -> {
            // 登录验证 -- 拦截所有路由，排除多个路径 用于开放登录,注册
            SaRouterUtil.match(Collections.singletonList("/**"), Arrays.asList("/ca/login", "/ca/register"), StpUtil::checkLogin);

            // 角色认证 -- 拦截以 admin 开头的路由，必须具备[admin]角色或者[super-admin]角色才可以通过认证
            SaRouterUtil.match("/admin/**", () -> StpUtil.checkRoleOr("admin", "super-admin"));

            // 权限认证 -- 不同模块, 校验不同权限
            SaRouterUtil.match("/user/**", () -> StpUtil.checkPermission("user"));
            SaRouterUtil.match("/admin/**", () -> StpUtil.checkPermission("admin"));
            SaRouterUtil.match("/goods/**", () -> StpUtil.checkPermission("goods"));
            SaRouterUtil.match("/orders/**", () -> StpUtil.checkPermission("orders"));
            SaRouterUtil.match("/notice/**", () -> StpUtil.checkPermission("notice"));
            SaRouterUtil.match("/comment/**", () -> StpUtil.checkPermission("comment"));

            // 匹配 restful 风格路由
            SaRouterUtil.match("/article/get/{id}", () -> StpUtil.checkPermission("article"));

            String method = ((HttpServletRequest) request.getSource()).getMethod();
            // 检查请求方式
            SaRouterUtil.match("/notice/**", () -> {
                if (method.equals(HttpMethod.GET.toString())) {
                    StpUtil.checkPermission("notice");
                }
            });


        })).addPathPatterns("/**");
    }
}