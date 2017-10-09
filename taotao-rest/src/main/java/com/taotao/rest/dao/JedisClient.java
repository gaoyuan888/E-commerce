package com.taotao.rest.dao;

public interface JedisClient {
	String get(String key);
	String set(String key,String value);
	Long hset(String hkey,String key,String value);
	String hget(String hkey,String key);//hash存储
	long incr(String key);//自增长
	long expire(String key ,int second);//设置过期时间
	long ttl(String key);//查看是否过期，-1代表永久，-2代表过期，已经销毁；其他正整数代表已经设置成功
	long del(String key);
	long hdel(String hkey,String key);
}