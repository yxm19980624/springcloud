package com.yxm.springcloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yxm.springcloud.entity.Dept;

import java.util.List;

/**
 * <p>
 * 部门表 服务类
 * </p>
 *
 * @author yxm
 * @since 2021-01-04
 */
public interface DeptService extends IService<Dept> {

    List<Dept> findAll();
}
