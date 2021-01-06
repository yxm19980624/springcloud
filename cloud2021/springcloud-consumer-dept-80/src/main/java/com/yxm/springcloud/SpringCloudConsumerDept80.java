package com.yxm.springcloud;

import com.yxm.rule.RibbonRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: yxm
 * @Date: 2021/1/5 16:13
 * @Emial: yxm1136656235@163.com
 * @Description:
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaClient         //让eureka生效
//让微服务启动时就加载自定义的ribbon的负载均衡策略，指定后将覆盖原来默认的轮询机制，且注意该类不应该在主启动类同级目录下，会被@ComponentScan扫描，会被所有的ribbon策略共享
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT",configuration = RibbonRule.class)
public class SpringCloudConsumerDept80 {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerDept80.class,args);
    }
}
