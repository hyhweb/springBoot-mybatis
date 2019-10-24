package com.springboot.mybatis.entity;

import java.io.Serializable;

/**
 * (TSysRole)实体类
 *
 * @author makejava
 * @since 2019-10-23 11:33:24
 */
public class TSysRole implements Serializable {
    private static final long serialVersionUID = -75341709061502394L;
    //ID
    private Long roleId;
    //角色名称
    private String roleName;
    
    private String roleCode;
    
    private String name;


    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}