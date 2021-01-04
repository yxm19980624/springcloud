package com.yxm.springcloud.controller;


import com.yxm.springcloud.entity.Dept;
import com.yxm.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
public class DeptController {

    @Autowired
    DeptService deptService;

    @PostMapping("/selectAll")
    public Dept SelectAll(){
        return deptService.getById(1);
    }
}

