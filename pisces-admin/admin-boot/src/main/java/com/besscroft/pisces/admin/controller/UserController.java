package com.besscroft.pisces.admin.controller;

import com.besscroft.pisces.admin.domain.param.LoginParam;
import com.besscroft.pisces.admin.service.UserService;
import com.besscroft.pisces.result.AjaxResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Description 用户接口
 * @Author Bess Croft
 * @Date 2022/2/4 19:18
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public AjaxResult login(@Validated @RequestBody LoginParam loginParam) {
        log.info("登录请求:{}", loginParam);
        AjaxResult accessToken = userService.login(loginParam.getUsername(), loginParam.getPassword());
        log.info("登录请求成功:{}", accessToken);
        return accessToken;
    }

    /**
     * 获取认证后用户信息
     * @return
     */
    @GetMapping("/info")
    public AjaxResult getInfo() {
        Map<String, Object> userInfo = userService.getUserInfo();
        return AjaxResult.success(userInfo);
    }

}
