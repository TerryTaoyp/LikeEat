package com.pandawork.eat.common.entity.sales;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Taoyongpan on 2017/10/19.
 * 会员表
 */
@Entity
@Table(name = "t_member")
public class Member {
    @Id
    private Integer id;

    //卡号，随机生成
    @Column(name = "card_number")
    private Integer cardNumber;

    //会员姓名
    @Column(name = "mName")
    private String mName;

    //性别
    @Column(name = "sex")
    private String sex;

    //生日
    @Column(name = "birthday")
    private String birthday;

    //身份证号
    @Column(name = "id_number")
    private String idNumber;

    //手机号
    @Column(name = "phone")
    private String phone;

    //办卡日期
    @Column(name = "card_data")
    private String cardData;

    //会员等级ID
    @Column(name = "type_id")
    private Integer typeId;

    //消费积分
    @Column(name = "consumption_points")
    private Double points;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCardData() {
        return cardData;
    }

    public void setCardData(String cardData) {
        this.cardData = cardData;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", cardNumber=" + cardNumber +
                ", mName='" + mName + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", phone='" + phone + '\'' +
                ", cardData='" + cardData + '\'' +
                ", typeId=" + typeId +
                ", points=" + points +
                '}';
    }
}
