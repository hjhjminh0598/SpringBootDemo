//package com.example.demo.Test;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//import java.util.Queue;
//import java.util.Set;
//
//import javax.transaction.Transaction;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.stereotype.Component;
//
//import redis.clients.jedis.Jedis;
//
//@Component
//public class RedisExample {
//
//	private Jedis jedis = new Jedis();
//
//	public void testJedisClient() {
//
////		String[] a = {"1", "2", "3"};
////
////		jedis.hset("m1", "1", "one");
////		jedis.hset("m1", "2", "two");
////		jedis.hset("m1", "3", "three");
//
////		Map<String, String> m1 = jedis.hgetAll("m1");
////		Map<String, String> m2 = jedis.hgetAll("m2");
////		System.out.println(m1.toString());
////		System.out.println(m2.toString());
////
////		System.out.println("List: " + jedis.hmget("m1", a)); //List<String>
////		System.out.println("List: " + jedis.hmget("m1", "1","2","3"));
////		System.out.println("Delete : " + jedis.hdel("m1", "1"));
////		System.out.println("Boolean exist 1: " + jedis.hexists("m1", "1"));
////		System.out.println("Keys Set: " + jedis.hkeys("m1"));
////		System.out.println("Length m1: " + jedis.hlen("m1"));
////		System.out.println("Length value 3: " + jedis.hstrlen("m1", "3"));
//
////		jedis.sadd("set1", "1");
////		jedis.sadd("set1", "2");
////		Set<String> set1 = jedis.smembers("set1");
////		System.out.println("Set1: " + set1);
////		System.out.println("Exist 1: " + jedis.sismember("set1", "1"));
////		System.out.println("Pop element: " + jedis.spop("set1"));
//
////		jedis.lpush("l", "1");
////		jedis.lpush("l", "2", "3");
////		System.out.println("Element at index 0: " + jedis.lindex("l", 0));
////		jedis.lset("l", 0, "Updated");
////		jedis.rpush("l", "10", "20");
////		List<String> l = jedis.lrange("l", 0, jedis.llen("l"));
////		System.out.println("List l: " + l);
////		System.out.println("Right pop: " + jedis.rpop("l"));
////		System.out.println("Left pop: " + jedis.lpop("l"));
//
//		Map<String, Double> scores = new HashMap<String, Double>();
//		scores.put("1", 3000.0);
//		scores.put("2", 1500.0);
//		scores.put("3", 8000.0);
//
//		scores.keySet().forEach(player -> {
//			jedis.zadd("ranking", scores);
//		});
//		System.out.println(jedis.zrevrange("ranking", 0, 2)); //return 1 decrease SortedSet 
//		System.out.println(jedis.zrange("ranking", 0, 2));// return 1 increase SortedSet
//		System.out.println(jedis.zrevrank("ranking", "3"));
//		System.out.println(jedis.zrank("ranking", "3"));
//		System.out.println(jedis.zscore("ranking", "3"));
//		
//		System.out.println(jedis.flushAll());
//
//	}
//
//	public static void main(String[] args) throws Exception {
//		new RedisExample().testJedisClient();
//	}
//}
