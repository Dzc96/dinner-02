package com.appointment.dinner.service.impl;

import com.appointment.dinner.exception.LogicalVerificationException;
import com.appointment.dinner.form.LoginForm;
import com.appointment.dinner.form.RegisterForm;
import com.appointment.dinner.mapper.UserMapper;
import com.appointment.dinner.model.User;
import com.appointment.dinner.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @Author Tony
 * @Time 2019/1/24
 */
@Service
public class UserServiceImpl implements UserService {

    @Value("${sysImg}")
    private String sysImg;

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer login(LoginForm loginForm) {
        User user = userMapper.selectByPhone(loginForm.getPhone());
        if(user==null){
            throw new LogicalVerificationException("用户不存在");
        }
        if(!user.getPassword().equals(DigestUtils.sha256Hex(loginForm.getPassword()))){
            throw new LogicalVerificationException("密码错误");
        }
        return user.getUserId();
    }

    @Override
    public int register(RegisterForm registerForm) {
        User user = userMapper.selectByPhone(registerForm.getPhone());
        if(user!=null){
            throw new LogicalVerificationException("用户已存在");
        }
        if(!registerForm.getPassword().equals(registerForm.getConfirmPassWord())){
            throw new LogicalVerificationException("两次输入的密码不正确");
        }
        User newUser = new User();
        newUser.setPhone(registerForm.getPhone());
        newUser.setPassword(DigestUtils.sha256Hex(registerForm.getPassword()));
        //todo:这里要提前初始化匿名头像(存url)跟匿名名称
        newUser.setSysName(UUID.randomUUID().toString().substring(0,6));
        newUser.setSysImg(sysImg);
        userMapper.insertSelective(newUser);
        return newUser.getUserId();
    }
}
