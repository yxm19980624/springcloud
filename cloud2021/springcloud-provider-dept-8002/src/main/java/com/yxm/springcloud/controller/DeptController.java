package com.yxm.springcloud.controller;

import com.yxm.springcloud.entity.Dept;
import com.yxm.springcloud.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 部门表 前端控制器
 * </p>
 *
 * @author yxm
 * @since 2021-01-04
 */
@RestController
@RequestMapping("/dept")
@Slf4j
public class DeptController {

    @Autowired
    DeptService deptService;

    //获取一些配置的信息，得到具体的微服务
    @Autowired
    private DiscoveryClient client;

    @GetMapping("/selectAll")
    public List<Dept> SelectAll(){
        return deptService.findAll();
    }

    //注册进来的微服务，获取一些消息
    @GetMapping("/discovery")
    public Object discovery(){

        //获取微服务列表的清单
        List<String> services = client.getServices();
        log.info("discovery获取到的消息是================》》》" + services);

        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance instance: instances) {
            log.info(instance.getHost() + "\t" +
                    instance.getPort() + "\t" +
                    instance.getUri() + "\t" +
                    instance.getServiceId()); }
        return this.client;
    }
}

