package com.appointment.dinner.mapper;

import com.appointment.dinner.model.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
    User selectByPhone(String phone);
}