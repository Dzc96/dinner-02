package com.appointment.dinner.service;

import com.appointment.dinner.util.MsgTemplate;

/**
 * @Author Tony
 * @Time 2019/1/17
 */
public interface SendMsgService {


     MsgTemplate sendMsgCde(String phone);

     boolean verifyMsgCode(String phone, String code);
}
