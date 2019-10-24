package com.springboot.mybatis.dao;

import com.springboot.mybatis.entity.TSysRole;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TSysRole)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-23 11:33:24
 */
public interface TSysRoleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param roleId 主键
     * @return 实例对象
     */
    TSysRole queryById(Long roleId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TSysRole> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tSysRole 实例对象
     * @return 对象列表
     */
    List<TSysRole> queryAll(TSysRole tSysRole);

    /**
     * 新增数据
     *
     * @param tSysRole 实例对象
     * @return 影响行数
     */
    int insert(TSysRole tSysRole);

    /**
     * 修改数据
     *
     * @param tSysRole 实例对象
     * @return 影响行数
     */
    int update(TSysRole tSysRole);

    /**
     * 通过主键删除数据
     *
     * @param roleId 主键
     * @return 影响行数
     */
    int deleteById(Long roleId);

}