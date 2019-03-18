package com.appointment.dinner.service;

import com.appointment.dinner.form.LoginForm;
import com.appointment.dinner.form.RegisterForm;
import com.appointment.dinner.model.User;

/**
 * @Author Tony
 * @Time 2019/1/24
 */
public interface UserService {
    User getUserById(Integer id);

    Integer login(LoginForm loginForm);

    int register(RegisterForm registerForm);
}
