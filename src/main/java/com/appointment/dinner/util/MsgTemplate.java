package com.appointment.dinner.util;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author Tony
 * @Time 2019/1/16
 */
@Data
@AllArgsConstructor
public class MsgTemplate implements Serializable{

    private String code;

}
