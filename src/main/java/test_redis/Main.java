package test_redis;

import com.lambdaworks.redis.RedisClient;
import com.lambdaworks.redis.RedisURI;
import com.lambdaworks.redis.api.StatefulRedisConnection;

/**
 * TODO doc me.
 *
 * @autor Guilherme Dalmarco (dalmarco.gd@gmail.com)
 */
public class Main {

	public static void main(String[] args) {
		RedisClient redisClient = RedisClient.create(RedisURI.create("redis://localhost:6379"));
	    StatefulRedisConnection<String, String> connection = redisClient.connect();

	    System.out.println("Connected to Redis");

	    connection.async().set("oi123", "123456");

	    connection.close();
	    redisClient.shutdown();
	}
}
