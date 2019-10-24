package com.springboot.mybatis.entity;

import java.io.Serializable;

/**
 * (TTestUser)实体类
 *
 * @author makejava
 * @since 2019-10-23 20:32:43
 */
public class TTestUser implements Serializable {
    private static final long serialVersionUID = 584964575303979514L;
    //id
    private Long id;
    //user_id
    private Long userId;
    //other
    private String userOther;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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