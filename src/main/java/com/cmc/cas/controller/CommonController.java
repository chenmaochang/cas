package com.cmc.cas.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ca")
public class CommonController {
    @PostMapping("login")
    public JSONObject login(){
        StpUtil.setLoginId(123);
        return new JSONObject();
    }
    @PostMapping("register")
    public JSONObject register(){
        StpUtil.setLoginId(123);
        return new JSONObject();
    }

    @PostMapping("test")
    public JSONObject test(){
        return new JSONObject();
    }
}
