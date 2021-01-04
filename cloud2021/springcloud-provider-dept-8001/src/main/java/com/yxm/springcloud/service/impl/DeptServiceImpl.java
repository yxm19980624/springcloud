package com.yxm.springcloud.service.impl;

import com.yxm.springcloud.entity.Dept;
import com.yxm.springcloud.mapper.DeptMapper;
import com.yxm.springcloud.service.DeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author yxm
 * @since 2021-01-04
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {

}
