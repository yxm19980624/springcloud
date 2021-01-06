package com.yxm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: yxm
 * @Date: 2021/1/4 21:05
 * @Emial: yxm1136656235@163.com
 * @Description: 启动类
 */
@SpringBootApplication
@EnableEurekaClient     //启用eureka 服务注册
@EnableDiscoveryClient    //服务发现
public class SpringCloudProviderDept8002 {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProviderDept8002.class, args);
    }
}
