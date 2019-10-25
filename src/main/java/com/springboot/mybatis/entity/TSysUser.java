package com.springboot.mybatis.entity;

import java.io.Serializable;
import java.util.List;

/**
 * (TSysUser)实体类
 *
 * @author makejava
 * @since 2019-10-23 11:33:24
 */
public class TSysUser implements Serializable {
    private static final long serialVersionUID = 462185045451750407L;
    //用户ID
    private Long id;
    //用户名
    private String username;
    
    private String password;
    
    private String salt;

    private TTestUser testUser;

    private List<TSysUser> roles;
    private List<TSysUserRole> userRoles;

    public TTestUser getTestUser() {
        return testUser;
    }

    public void setTestUser(TTestUser testUser) {
        this.testUser = testUser;
    }

    public List<TSysUserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<TSysUserRole> userRoles) {
        this.userRoles = userRoles;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<TSysUser> getRoles() {
        return roles;
    }

    public void setRoles(List<TSysUser> roles) {
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

}