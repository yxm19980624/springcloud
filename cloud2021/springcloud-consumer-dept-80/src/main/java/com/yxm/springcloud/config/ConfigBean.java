package com.yxm.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: yxm
 * @Date: 2021/1/5 15:33
 * @Emial: yxm1136656235@163.com
 * @Description:
 */
@Configuration
public class ConfigBean {

    //配置负载均衡实现RestTemplate  加注解@LoadBalanced
    @Bean
    @LoadBalanced   //Ribbon  开启负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
