package com.appointment.dinner.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * 注册参数
 *
 * @Author Tony
 * @Time 2019/1/24
 */
@Data
public class RegisterForm {

    /**
     * 手机号码
     * */
    @NotBlank(message = "手机号不能为空")
    private String phone;

    /**
     * 登陆密码
     * */
    @NotBlank(message = "密码不能为空")
    @Pattern(regexp = "[0-9A-Za-z]{8,20}",message = "密码必须是8-20位数字或者英文")
    private String password;

    /**
     * 确认密码
     * */
    @NotBlank(message = "密码不能为空")
    private String confirmPassWord;

}
