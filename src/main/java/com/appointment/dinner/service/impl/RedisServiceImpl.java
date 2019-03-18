package com.appointment.dinner.service.impl;

import com.appointment.dinner.service.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Filename : RedisServiceImpl.java
 * Description : 对redis进行操作的service
 */
@Service
@Slf4j
public class RedisServiceImpl implements RedisService {


	@Autowired
	private RedisTemplate<String, String> custiomRedisTemplate;


	/**
	 * 判断是否存在该键
	 */
	@Override
	public Boolean isExsitKey(String key) {
		return custiomRedisTemplate.hasKey(key);
	}

	/**
	 * 以map集合的形式添加键值对
	 */
	@Override
	public void putAllForHash(String hashKey, Map<String, String> data) {
		custiomRedisTemplate.opsForHash().putAll(hashKey, data);
	}

	/**
	 * 往hash缓存集合添加键值对
	 */
	@Override
	public void putForHash(String hashKey, String key, String value) {
		custiomRedisTemplate.opsForHash().put(hashKey, key, value);
	}

	/**
	 * 通过键获取值，没有则返回null
	 */
	@Override
	public Object getOneForHash(String hashKey, String key) {
		return custiomRedisTemplate.opsForHash().get(hashKey, key);
	}

	/**
	 * 使变量中的键以long值的大小进行自增长
	 */
	@Override
	public Long incrementForHash(String hashKey, String key, long delta) {
		return custiomRedisTemplate.opsForHash().increment(hashKey, key, delta);
	}

	/**
	 * 设置缓存过期时间
	 */
	@Override
	public Boolean expire(String key, long timeout, TimeUnit unit) {
		return custiomRedisTemplate.expire(key, timeout, unit);
	}

	/**
	 * 通过键获取值，没有则返回null。
	 */
	@Override
	public String getForValue(String key) {
		return custiomRedisTemplate.opsForValue().get(key);
	}

	/**
	 * 添加键值对,无过期时间
	 */
	@Override
	public void setValue(String key, String value) {
		custiomRedisTemplate.opsForValue().set(key,value);
	}

	/**
	 * 添加键值对并设置过期时间
	 */
	@Override
	public void setForValue(String key, String value, long timeout, TimeUnit unit) {
		custiomRedisTemplate.opsForValue().set(key, value, timeout, unit);
	}

	/**
	 * 通过key删除缓存
	 */
	@Override
	public Boolean delete(String key) {
		return custiomRedisTemplate.delete(key);
	}


}
