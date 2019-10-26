package com.springboot.mybatis.entity;

import java.io.Serializable;

/**
 * (TTestUser)实体类
 *
 * @author makejava
 * @since 2019-10-26 10:49:39
 */
public class TTestUser implements Serializable {
    private static final long serialVersionUID = 201372015127753620L;
    //id
    private Long userTestId;
    //user_id
    private Long userId;
    //other
    private String userOther;

    private TSysUser tSysUser;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public TSysUser gettSysUser() {
        return tSysUser;
    }

    public void settSysUser(TSysUser tSysUser) {
        this.tSysUser = tSysUser;
    }

    public Long getUserTestId() {
        return userTestId;
    }

    public void setUserTestId(Long userTestId) {
        this.userTestId = userTestId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserOther() {
        return userOther;
    }

    public void setUserOther(String userOther) {
        this.userOther = userOther;
    }

}