package cn.cjy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@MapperScan("cn.cjy")
@SpringBootApplication
@EnableCaching
public class ApplicationStart {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(ApplicationStart.class, args);
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
