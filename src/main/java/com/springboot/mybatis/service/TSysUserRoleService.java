package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.TSysUserRole;
import java.util.List;

/**
 * (TSysUserRole)表服务接口
 *
 * @author makejava
 * @since 2019-10-23 11:33:24
 */
public interface TSysUserRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param userRoleId 主键
     * @return 实例对象
     */
    TSysUserRole queryById(Long userRoleId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TSysUserRole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tSysUserRole 实例对象
     * @return 实例对象
     */
    TSysUserRole insert(TSysUserRole tSysUserRole);

    /**
     * 修改数据
     *
     * @param tSysUserRole 实例对象
     * @return 实例对象
     */
    TSysUserRole update(TSysUserRole tSysUserRole);

    /**
     * 通过主键删除数据
     *
     * @param userRoleId 主键
     * @return 是否成功
     */
    boolean deleteById(Long userRoleId);

}