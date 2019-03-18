package com.appointment.dinner.controller;

import com.appointment.dinner.message.R;
import com.appointment.dinner.service.SendMsgService;
import com.appointment.dinner.util.MsgTemplate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Tony
 * @Time 2019/1/24
 */
@RestController
@RequestMapping("/app")
@Api("短信验证码API")
public class AppSendMsgController {

    @Autowired
    private SendMsgService sendMsgService;


    @GetMapping("/sendMsgCode")
    @ApiOperation("发送短信验证码")
    public R<MsgTemplate> sendMsgCode(@RequestParam("phone") String phone){
        return new R<>(sendMsgService.sendMsgCde(phone));
    }


    @GetMapping("/verifyMsgCode")
    @ApiOperation("校验短信验证码")
    public R<Boolean> verifyMsgCode(@RequestParam("phone")String phone,@RequestParam("code")String code){
        return new R<>(sendMsgService.verifyMsgCode(phone,code));
    }


}
