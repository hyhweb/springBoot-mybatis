package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.TSysUser;
import java.util.List;

/**
 * (TSysUser)表服务接口
 *
 * @author makejava
 * @since 2019-10-23 11:33:24
 */
public interface TSysUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TSysUser queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TSysUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tSysUser 实例对象
     * @return 实例对象
     */
    TSysUser insert(TSysUser tSysUser);

    /**
     * 修改数据
     *
     * @param tSysUser 实例对象
     * @return 实例对象
     */
    TSysUser update(TSysUser tSysUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}