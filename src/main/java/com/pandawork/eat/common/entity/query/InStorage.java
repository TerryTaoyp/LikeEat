package com.pandawork.eat.common.entity.query;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Taoyongpan on 2017/10/19.
 * 入库表
 */
@Entity
@Table(name = "t_in_storage")
public class InStorage {
    @Id
    private Integer id;

    //供货商ID
    @Column(name = "supplier_id")
    private Integer supplierId;

    //商品ID
    @Column(name = "goods_id")
    private Integer goodsId;

    //价格ID，商品价格信息表
    @Column(name = "price_id")
    private Integer priceId;

    //数量表
    @Column(name = "number")
    private Integer number;

    //入库日期
    @Column(name = "in_data")
    private String inData;

    //此次的总金额
    @Column(name = "sum_money")
    private Double sumMoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getPriceId() {
        return priceId;
    }

    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getInData() {
        return inData;
    }

    public void setInData(String inData) {
        this.inData = inData;
    }

    public Double getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(Double sumMoney) {
        this.sumMoney = sumMoney;
    }

    @Override
    public String toString() {
        return "InStorage{" +
                "id=" + id +
                ", supplierId=" + supplierId +
                ", goodsId=" + goodsId +
                ", priceId=" + priceId +
                ", number=" + number +
                ", inData='" + inData + '\'' +
                ", sumMoney=" + sumMoney +
                '}';
    }
}
