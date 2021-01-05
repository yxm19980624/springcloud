package com.yxm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: yxm
 * @Date: 2021/1/5 16:53
 * @Emial: yxm1136656235@163.com
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer //服务端的启动类 可以接收别人注册进来
public class SpringCloudEureka7003 {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEureka7003.class,args);
    }
}
