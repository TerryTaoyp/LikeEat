package com.pandawork.eat.common.entity.purchase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Taoyongpan on 2017/10/19.
 * 供货商表
 */
@Entity
@Table(name = "t_supplier")
public class Supplier {

    @Id
    private Integer id;
    //供货商名字
    @Column(name = "supplier_name")
    private String supplierName;
    //供货商类别
    @Column(name = "supplier_type")
    private Integer supplierTypeId;

    //供货商地址
    @Column(name = "supplier_address")
    private String supplierAddress;

    //手机号
    @Column(name = "telephone")
    private String telephone;

    //备注
    @Column(name = "remark")
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Integer getSupplierTypeId() {
        return supplierTypeId;
    }

    public void setSupplierTypeId(Integer supplierTypeId) {
        this.supplierTypeId = supplierTypeId;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", supplierName='" + supplierName + '\'' +
                ", supplierTypeId=" + supplierTypeId +
                ", supplierAddress='" + supplierAddress + '\'' +
                ", telephone='" + telephone + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
