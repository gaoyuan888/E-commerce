package com.taotao.rest.jedis;

import java.io.IOException;
import java.util.HashSet;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;


public class JedisTest {
	@Test
	public void testJedisSingle() {
		// 创建一个jedis对象
		Jedis jedis = new Jedis("192.168.226.135", 6379);
		// 调用jets方法
		jedis.set("key1", "jedis test");
		String value = jedis.get("key1");
		System.out.println(value);
		jedis.close();
	}

	// 使用连接池
//	@Test
//	public void testJedisPool() {
//		String host = "192.168.226.135";
//		int port = 6379;
//		JedisPool pool = new JedisPool(host, port);
//
//		Jedis jedis = pool.getResource();
//		// 调用jedis方法
//		String value = jedis.get("key1");
//		System.out.println(value);
//		jedis.close();
//		pool.close();
//	}

	@Test
	public void JedisCluster() {
		try {
			HashSet<HostAndPort> nodes = new HashSet<>();
			nodes.add(new HostAndPort("192.168.226.135", 7001));
			nodes.add(new HostAndPort("192.168.226.135", 7002));
			nodes.add(new HostAndPort("192.168.226.135", 7003));
			nodes.add(new HostAndPort("192.168.226.135", 7004));
			nodes.add(new HostAndPort("192.168.226.135", 7005));
			nodes.add(new HostAndPort("192.168.226.135", 7006));
			JedisCluster cluster = new JedisCluster(nodes);
			cluster.set("key1", "1000");
			String string = cluster.get("key1");
			System.out.println(string);
			cluster.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 
	@Test
	public void testSptingJedis(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		JedisPool pool = (JedisPool) applicationContext.getBean("redisClient");
		Jedis jedis = pool.getResource();
		String string = jedis.get("key1");
		System.out.println(string);
		jedis.close();
		pool.close();
	} 
	
	@Test
	public void springJedisCluster(){
		try {
			ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
			JedisCluster jedisCluster = (JedisCluster) applicationContext.getBean("redisClient");
			String string = jedisCluster.get("key1");
			System.out.println(string);
			jedisCluster.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}
}
