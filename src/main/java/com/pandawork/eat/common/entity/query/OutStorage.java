package com.pandawork.eat.common.entity.query;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Taoyongpan on 2017/10/19.
 * 出库表
 */
@Entity
@Table(name = "t_out_storage")
public class OutStorage {
    @Id
    private Integer id;

    //商品ID
    @Column(name = "goods_id")
    private Integer goodsId;

    //价格ID
    @Column(name = "price_id")
    private Integer priceId;

    //销售数量
    @Column(name = "sell_number")
    private Integer sellNumber;

    //销售金额
    @Column(name = "sell_money")
    private Double sellMoney;

    //客户ID
    @Column(name = "customer_id")
    private Integer customerId;

    //快递费用
    @Column(name = "express_fee")
    private Double expressFee;

    //其他费用
    @Column(name = "other_fee")
    private Double otherFee;


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

    public Integer getPriceId() {
        return priceId;
    }

    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }

    public Integer getSellNumber() {
        return sellNumber;
    }

    public void setSellNumber(Integer sellNumber) {
        this.sellNumber = sellNumber;
    }

    public Double getSellMoney() {
        return sellMoney;
    }

    public void setSellMoney(Double sellMoney) {
        this.sellMoney = sellMoney;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Double getExpressFee() {
        return expressFee;
    }

    public void setExpressFee(Double expressFee) {
        this.expressFee = expressFee;
    }

    public Double getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(Double otherFee) {
        this.otherFee = otherFee;
    }

    @Override
    public String toString() {
        return "OutStorage{" +
                "id=" + id +
                ", goodsId=" + goodsId +
                ", priceId=" + priceId +
                ", sellNumber=" + sellNumber +
                ", sellMoney=" + sellMoney +
                ", customerId=" + customerId +
                ", expressFee=" + expressFee +
                ", otherFee=" + otherFee +
                '}';
    }
}
