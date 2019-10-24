package com.springboot.mybatis.entity;

import java.io.Serializable;

/**
 * (TSysUserRole)实体类
 *
 * @author makejava
 * @since 2019-10-23 11:33:24
 */
public class TSysUserRole implements Serializable {
    private static final long serialVersionUID = 685392682883831131L;
    //ID
    private Long userRoleId;
    //user_id
    private Long userId;
    //role_id
    private Long roleId;


    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

}