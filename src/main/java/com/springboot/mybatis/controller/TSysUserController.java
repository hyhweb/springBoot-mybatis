package com.springboot.mybatis.controller;

import com.springboot.mybatis.entity.TSysUser;
import com.springboot.mybatis.service.TSysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TSysUser)表控制层
 *
 * @author makejava
 * @since 2019-10-23 11:33:24
 */
@RestController
@RequestMapping("tSysUser")
public class TSysUserController {
    /**
     * 服务对象
     */
    @Resource
    private TSysUserService tSysUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TSysUser selectOne(Long id) {
        return this.tSysUserService.queryById(id);
    }

}