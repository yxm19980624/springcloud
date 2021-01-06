package com.yxm.rule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yxm
 * @Date: 2021/1/6 18:01
 * @Emial: yxm1136656235@163.com
 * @Description:
 */
@Configuration
public class RibbonRule {

    //    自定义负载均衡算法  实现IRule接口
    /**         负载均衡策略
     * 轮询 RoundRobinRule
     * 随机 RandomRule
     * 权重 WeightedResponseTimeRule
     * 优先过滤掉访问故障的服务，对剩下的轮询  AvailabilityFilteringRule
     * 重试 会先轮询，如果获取失败，会在指定时间内进行重试 RetryRule
     * ……………………
     */
    @Bean
    public IRule iRule(){
        return new YxmRandomRule();     //调用自己的负载均衡策略 默认是轮询
    }
}
