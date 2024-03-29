package com.springboot.mybatis.service.impl;

import com.springboot.mybatis.entity.TSysUser;
import com.springboot.mybatis.dao.TSysUserDao;
import com.springboot.mybatis.service.TSysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TSysUser)表服务实现类
 *
 * @author makejava
 * @since 2019-10-23 11:33:24
 */
@Service("tSysUserService")
public class TSysUserServiceImpl implements TSysUserService {
    @Resource
    private TSysUserDao tSysUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TSysUser queryById(Long id) {
        return this.tSysUserDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TSysUser> queryAllByLimit(int offset, int limit) {
        return this.tSysUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tSysUser 实例对象
     * @return 实例对象
     */
    @Override
    public TSysUser insert(TSysUser tSysUser) {
        this.tSysUserDao.insert(tSysUser);
        return tSysUser;
    }

    /**
     * 修改数据
     *
     * @param tSysUser 实例对象
     * @return 实例对象
     */
    @Override
    public TSysUser update(TSysUser tSysUser) {
        this.tSysUserDao.update(tSysUser);
        return this.queryById(tSysUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tSysUserDao.deleteById(id) > 0;
    }
}