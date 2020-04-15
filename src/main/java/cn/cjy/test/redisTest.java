package cn.cjy.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest
public class redisTest {

    private Jedis jedis;

    @Before
    public void before(){
        jedis = new Jedis("39.96.28.20",6379);
    }

    @Test
    public void test(){
        System.out.println(jedis.select(4));

    }
}
