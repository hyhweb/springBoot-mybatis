package com.springboot.mybatis.controller;

import com.springboot.mybatis.entity.TSysUserRole;
import com.springboot.mybatis.service.TSysUserRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TSysUserRole)表控制层
 *
 * @author makejava
 * @since 2019-10-23 11:33:24
 */
@RestController
@RequestMapping("tSysUserRole")
public class TSysUserRoleController {
    /**
     * 服务对象
     */
    @Resource
    private TSysUserRoleService tSysUserRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TSysUserRole selectOne(Long id) {
        return this.tSysUserRoleService.queryById(id);
    }

}