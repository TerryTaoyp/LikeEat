package com.pandawork.eat.common.entity.query;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Taoyongpan on 2017/10/19.
 * 库存表
 */
@Entity
@Table(name = "t_stock")
public class Stock {

    @Id
    private Integer id;

    //商品ID
    @Column(name = "goods_id")
    private Integer goodsId;

    //均价
    @Column(name = "averages_price")
    private Double averagesPrice;

    //剩余数量
    @Column(name = "number")
    private Integer number;

    //金额
    @Column(name = "sum_money")
    private Double sumMoney;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Double getAveragesPrice() {
        return averagesPrice;
    }

    public void setAveragesPrice(Double averagesPrice) {
        this.averagesPrice = averagesPrice;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(Double sumMoney) {
        this.sumMoney = sumMoney;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", goodsId=" + goodsId +
                ", averagesPrice=" + averagesPrice +
                ", number=" + number +
                ", sumMoney=" + sumMoney +
                '}';
    }
}
