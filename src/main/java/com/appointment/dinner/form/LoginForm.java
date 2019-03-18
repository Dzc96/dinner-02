package com.appointment.dinner.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 登陆参数
 *
 * @Author Tony
 * @Time 2019/1/24
 */
@Data
public class LoginForm {

    /**
     * 手机号码
     * */
    @NotBlank(message = "手机号不能为空")
    private String phone;

    /**
     * 登陆密码
     * */
    @NotBlank(message = "密码不能为空")
    private String password;

}
