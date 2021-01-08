package com.yxm.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yxm.springcloud.entity.Dept;
import com.yxm.springcloud.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    @GetMapping("/selectAll")
    @HystrixCommand(fallbackMethod = "hystrixSelectAll")
    public List<Dept> selectAll(){
        List<Dept> dept = deptService.findAll();
        if (dept.size() == 0){
            throw new RuntimeException("deptNo不存在");
        }
        return dept;
    }


    //备选方法
    public List<Dept> hystrixSelectAll(){
        ArrayList<Dept> depts = new ArrayList<>();
        Dept dept = new Dept();
        dept.setDbSource("没有对应的数据库").setDeptName("测试");
        depts.add(dept);
        return depts;
    }
}

