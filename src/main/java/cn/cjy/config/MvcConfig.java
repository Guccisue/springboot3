package cn.cjy.config;

import cn.cjy.filter.MyFilter;
import cn.cjy.filter.allOncePerRequestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MvcConfig {

    /**
     * 拦截器注册
     *
     * @return FilterRegistrationBean
     */
    @Bean
    public FilterRegistrationBean myFilterRegistration(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter());
        registration.addUrlPatterns("/a/*");// 拦截路径
        registration.setName("MyFilter");// 拦截器名称
        registration.setOrder(1);// 顺序
        return registration;
    }

    /**
     * 拦截器注册
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean myOncePerRequestFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new allOncePerRequestFilter());
        registration.addUrlPatterns("/*");// 拦截路径
        registration.setName("MyOncePerRequestFilter");// 拦截器名称
        registration.setOrder(2);// 顺序
        return registration;
    }


}
