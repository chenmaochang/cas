package com.cmc.cas.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("ca")
@Slf4j
public class CommonController {
    @Resource
    RedissonClient redissonClient;

    @PostMapping("login")
    public JSONObject login() {
        StpUtil.setLoginId(123);
        RLock lock = redissonClient.getLock("lock");
        try {
            boolean lockResult = lock.tryLock();
            log.info(" login lockResult={}",lockResult);
            TimeUnit.SECONDS.sleep(5);
            lock.unlockAsync();
        } catch (InterruptedException e) {
            log.error("{} fail", lock);
            e.printStackTrace();
        }
        return new JSONObject();
    }

    @PostMapping("register")
    public JSONObject register() {
        RLock lock = redissonClient.getLock("lock");
        try {
            boolean lockResult = lock.tryLock();
            log.info(" register lockResult={}",lockResult);
            TimeUnit.SECONDS.sleep(5);
            lock.unlockAsync();
        } catch (InterruptedException e) {
            log.error("{} fail", lock);
            e.printStackTrace();
        }
        return new JSONObject();
    }

    @PostMapping("test")
    public JSONObject test() {
        return new JSONObject();
    }
}
