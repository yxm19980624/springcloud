package com.yxm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: yxm
 * @Date: 2021/1/12 16:58
 * @Emial: yxm1136656235@163.com
 * @Description:
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableZuulProxy        //开启zuul代理服务 zuul是自动注册到服务与发现的
public class ZuulApplication9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication9527.class,args);
    }
}
