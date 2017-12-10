package com.pandawork.eat.common.entity.sales;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Taoyongpan on 2017/10/19.
 * 客户表
 */
@Entity
@Table(name = "t_customer")
public class Customer {
    @Id
    private Integer id;

    //客户用户名
    @Column(name = "customer_name")
    private String customerName;

    //客户单位地址
    @Column(name = "customer_unit_address")
    private String unitAddress;

    //送货地址1
    @Column(name = "delivery_address1")
    private String deliveryAddress1;

    //送货地址2
    @Column(name = "delivery_address2")
    private String deliveryAddress2;

    //送货地址3
    @Column(name = "delivery_address3")
    private String deliveryAddress3;

    //联系方式1
    @Column(name = "telephone1")
    private String telephone1;

    //联系方式2
    @Column(name = "telephone2")
    private String telephone2;

    //联系方式3
    @Column(name = "telephone3")
    private String telephone3;

    //qq号
    @Column(name = "qq")
    private String qq;

    //微信号
    @Column(name = "wechat")
    private String weChat;

    //支付宝账号
    @Column(name = "alipay")
    private String alipay;

    //银行卡号
    @Column(name = "bank_num")
    private String bankNum;

    //银行名字
    @Column(name = "bank_name")
    private String bankName;

    //邮箱1
    @Column(name = "email1")
    private String email1;

    //邮箱2
    @Column(name = "email2")
    private String email2;

    //客户类别
    @Column(name = "customer_type")
    private Integer customerTypeId;

    //客户二级类别，1为普通客户，2为会员,3为分销商，4为代理商
    @Column(name = "customer_type2")
    private Integer customerTypeId2;
    //备注
    @Column(name = "remark")
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getUnitAddress() {
        return unitAddress;
    }

    public void setUnitAddress(String unitAddress) {
        this.unitAddress = unitAddress;
    }

    public String getDeliveryAddress1() {
        return deliveryAddress1;
    }

    public void setDeliveryAddress1(String deliveryAddress1) {
        this.deliveryAddress1 = deliveryAddress1;
    }

    public String getDeliveryAddress2() {
        return deliveryAddress2;
    }

    public void setDeliveryAddress2(String deliveryAddress2) {
        this.deliveryAddress2 = deliveryAddress2;
    }

    public String getDeliveryAddress3() {
        return deliveryAddress3;
    }

    public void setDeliveryAddress3(String deliveryAddress3) {
        this.deliveryAddress3 = deliveryAddress3;
    }

    public String getTelephone1() {
        return telephone1;
    }

    public void setTelephone1(String telephone1) {
        this.telephone1 = telephone1;
    }

    public String getTelephone2() {
        return telephone2;
    }

    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2;
    }

    public String getTelephone3() {
        return telephone3;
    }

    public void setTelephone3(String telephone3) {
        this.telephone3 = telephone3;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public String getAlipay() {
        return alipay;
    }

    public void setAlipay(String alipay) {
        this.alipay = alipay;
    }

    public String getBankNum() {
        return bankNum;
    }

    public void setBankNum(String bankNum) {
        this.bankNum = bankNum;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public Integer getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Integer customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", unitAddress='" + unitAddress + '\'' +
                ", deliveryAddress1='" + deliveryAddress1 + '\'' +
                ", deliveryAddress2='" + deliveryAddress2 + '\'' +
                ", deliveryAddress3='" + deliveryAddress3 + '\'' +
                ", telephone1='" + telephone1 + '\'' +
                ", telephone2='" + telephone2 + '\'' +
                ", telephone3='" + telephone3 + '\'' +
                ", qq='" + qq + '\'' +
                ", weChat='" + weChat + '\'' +
                ", alipay='" + alipay + '\'' +
                ", bankNum='" + bankNum + '\'' +
                ", bankName='" + bankName + '\'' +
                ", eamil1='" + email1 + '\'' +
                ", eamil2='" + email2 + '\'' +
                ", customerTypeId=" + customerTypeId +
                ", remark='" + remark + '\'' +
                '}';
    }
}
