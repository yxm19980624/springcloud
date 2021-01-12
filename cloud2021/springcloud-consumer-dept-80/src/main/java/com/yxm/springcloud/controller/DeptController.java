package com.yxm.springcloud.controller;

import com.yxm.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: yxm
 * @Date: 2021/1/5 15:29
 * @Emial: yxm1136656235@163.com
 * @Description:
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    //消费者不应该有service层   通过RestTemplate模板，访问远程http服务的方法
    @Autowired
    private RestTemplate restTemplate;

//    private static final String REST_URL_PREFIX = "http://localhost:8001";

//    ribbon 通过服务提供者的服务名来访问
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @GetMapping("/findAll")
    private List<Dept> findAll(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/selectAll",List.class);
    }

}
