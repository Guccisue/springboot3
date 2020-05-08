package cn.cjy.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.ScanParams;
import redis.clients.jedis.ScanResult;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class redisTest {

    private Jedis jedis;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before
    public void before(){
        jedis = new Jedis("39.96.28.20",6379);
        jedis.auth("!QAZ1qaz");
    }

    @Test
    public void test(){
        System.out.println(jedis.select(4));
//        jedis.lpush("lpush","v1","v2","v3","v4");
//        jedis.rpop("lpush");
//        jedis.sadd("set1","v1","v2","v3","v4");
    }

    @Test
    public void hashTest(){
        System.out.println(jedis.select(4));
//        Map<String,String> hashMap = new HashMap<String,String>();
//        hashMap.put("v1","这是v1");
//        hashMap.put("v2","这是v2");
//        jedis.hset("map",hashMap);
        System.out.println(jedis.hgetAll("map"));
    }

    @Test
    public void scanTest(){

    }
}
