package com.cmc.cas.controller;


import com.cmc.cas.service.ICaCommonUserService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 认证中心统一用户 前端控制器
 * </p>
 *
 * @author cmc
 * @since 2021-04-18
 */
@RestController
@RequestMapping("/ca-common-user")
public class CaCommonUserController {

    @Resource
    ICaCommonUserService caCommonUserService;
}

