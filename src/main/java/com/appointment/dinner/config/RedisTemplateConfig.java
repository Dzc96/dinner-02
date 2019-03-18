package com.appointment.dinner.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import javax.annotation.Resource;

/**
* Description : 配置RedisTemplate，解决乱码问题
*/
@Configuration
public class RedisTemplateConfig {
	private static RedisSerializer<String> stringSerializer = new StringRedisSerializer();

	@Resource
	private RedisTemplate<String, String> redisTemplate;
	
    @Bean
    public RedisTemplate<String, String> custiomRedisTemplate() {
    	/*解决上传到Redis乱码问题*/
		redisTemplate.setKeySerializer(stringSerializer);
		redisTemplate.setValueSerializer(stringSerializer);
		redisTemplate.setHashKeySerializer(stringSerializer);
		redisTemplate.setHashValueSerializer(stringSerializer);
		return redisTemplate;
    }
}
