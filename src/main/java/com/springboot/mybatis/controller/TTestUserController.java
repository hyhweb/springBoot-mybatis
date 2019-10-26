package com.springboot.mybatis.controller;

import com.springboot.mybatis.entity.TTestUser;
import com.springboot.mybatis.service.TTestUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TTestUser)表控制层
 *
 * @author makejava
 * @since 2019-10-26 10:49:39
 */
@RestController
@RequestMapping("tTestUser")
public class TTestUserController {
    /**
     * 服务对象
     */
    @Resource
    private TTestUserService tTestUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TTestUser selectOne(Long id) {
        return this.tTestUserService.queryById(id);
    }

}