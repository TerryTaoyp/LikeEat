package com.pandawork.eat.common.entity.system;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Taoyongpan on 2017/10/19.
 */
@Entity
@Table(name = "t_role")
public class Role {

    @Id
    private Integer id;

    //角色名字
    @Column(name = "role")
    private String role;

    //权限等级
    @Column(name = "power_id")
    private Integer powerId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", powerId=" + powerId +
                '}';
    }
}
