package com.pandawork.eat.common.entity.system;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Taoyongpan on 2017/10/19.
 */
@Entity
@Table(name = "t_power")
public class Power {

    @Id
    private Integer id;

    //权限等级
    @Column(name = "power")
    private Integer power;

    //备注
    @Column(name = "remark")
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Power{" +
                "id=" + id +
                ", power=" + power +
                ", remark='" + remark + '\'' +
                '}';
    }
}
