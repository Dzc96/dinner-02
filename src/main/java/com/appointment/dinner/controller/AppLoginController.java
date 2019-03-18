package com.appointment.dinner.controller;

import com.appointment.dinner.form.LoginForm;
import com.appointment.dinner.message.R;
import com.appointment.dinner.service.UserService;
import com.appointment.dinner.util.JwtUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author Tony
 * @Time 2019/1/24
 */
@RestController
@RequestMapping("/app")
@Api("APP登录接口")
public class AppLoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtils jwtUtils;

    @PostMapping("/login")
    @ApiOperation("登陆")
    public R<String> login(@Valid @RequestBody LoginForm loginForm){
        Integer userId = userService.login(loginForm);
        //登陆成功生成token
        String token = jwtUtils.generateToken(userId);
        return new R<>(token);

    }



}
