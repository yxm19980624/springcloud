package com.yxm.springcloud.controller;

import com.yxm.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
public class DeptController {

    //消费者不应该有service层
    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @GetMapping("/findAll")
    private List<Dept> findAll(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/selectAll",List.class);
    }

}
