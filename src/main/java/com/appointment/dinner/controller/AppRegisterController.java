package com.appointment.dinner.controller;

import com.appointment.dinner.form.RegisterForm;
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
@Api("APP注册接口")
public class AppRegisterController {

    @Autowired
    private JwtUtils jwtUtils;

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    @ApiOperation("注册")
    public R<String> register(@Valid @RequestBody RegisterForm registerForm) {
        int userId = userService.register(registerForm);
        //注册成功生成token
        String token = jwtUtils.generateToken(userId);
        return new R<>(token);
    }

}
