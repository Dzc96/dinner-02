package com.appointment.dinner.constants;

/**
 * @Author Tony
 * @Time 2019/1/17
 */
public enum RedisEnum {

    MSG_CDE("MSG_CDE");

    private String key;

    RedisEnum(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
