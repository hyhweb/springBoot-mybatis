package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.TTestUser;
import java.util.List;

/**
 * (TTestUser)表服务接口
 *
 * @author makejava
 * @since 2019-10-23 20:32:43
 */
public interface TTestUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTestUser queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TTestUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tTestUser 实例对象
     * @return 实例对象
     */
    TTestUser insert(TTestUser tTestUser);

    /**
     * 修改数据
     *
     * @param tTestUser 实例对象
     * @return 实例对象
     */
    TTestUser update(TTestUser tTestUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}