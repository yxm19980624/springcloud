package com.yxm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author: yxm
 * @Date: 2021/1/5 16:13
 * @Emial: yxm1136656235@163.com
 * @Description:
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringCloudConsumerDept80 {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerDept80.class,args);
    }
}
