package com.appointment.dinner.controller;

import com.appointment.dinner.annotation.Login;
import com.appointment.dinner.annotation.LoginUser;
import com.appointment.dinner.message.R;
import com.appointment.dinner.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Tony
 * @Time 2019/1/24
 */
@RestController
@RequestMapping("/app")
@Api("APP测试接口")
public class AppTestController {


    @Login
    @GetMapping("/userInfo")
    @ApiOperation("获取用户信息")
    public R<User> userInfo(@LoginUser User user){
        return new R<>(user);
    }

    @Login
    @GetMapping("/userId")
    @ApiOperation("获取用户ID")
    public R<Integer> userInfo(@RequestAttribute("userId") Integer userId){
        return new R<>(userId);
    }

    @GetMapping("/notToken")
    @ApiOperation("忽略Token验证测试")
    public R<String> notToken(){
        return new R<>( "无需token也能访问");
    }
}
