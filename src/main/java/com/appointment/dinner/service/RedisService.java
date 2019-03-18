package com.appointment.dinner.service;


import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Description : 对redis进行操作
 */
public interface RedisService {

    /**
     * 判断是否存在该键
     */
    Boolean isExsitKey(String key);

    /**
     * 以map集合的形式添加键值对
     */
    void putAllForHash(String hashKey, Map<String, String> data);

    /**
     * 往hash缓存集合添加键值对
     */
    void putForHash(String hashKey, String key, String value);

    /**
     * 通过键获取值，没有则返回null
     */
    Object getOneForHash(String hashKey, String key);

    /**
     * 使变量中的键以long值的大小进行自增长
     */
    Long incrementForHash(String hashKey, String key, long delta);


    /**
     * 设置缓存过期时间
     */
    Boolean expire(String key, long timeout, TimeUnit unit);

    /**
     * 通过键获取值，没有则返回null
     */
    String getForValue(String key);


    /**
     * 添加键值对，无过期时间
     * */
    void setValue(String key,String value);

    /**
     * 添加键值对并设置过期时间
     */
    void setForValue(String key, String value, long timeout, TimeUnit unit);

    /**
     * 通过key删除缓存
     */
    Boolean delete(String key);
}
