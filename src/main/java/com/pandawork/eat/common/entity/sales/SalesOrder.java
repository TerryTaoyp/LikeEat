package com.pandawork.eat.common.entity.sales;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Taoyongpan on 2017/10/19.
 * 销售订单
 */
@Entity
@Table(name = "t_sales_order")
public class SalesOrder {
    @Id
    private Integer id;

    //卡号，自动生成
    @Column(name = "card_number")
    private Integer cardNumber;

    //客户ID
    @Column(name = "customer_id")
    private Integer customerId;

    //销售金额
    @Column(name = "sales_amount")
    private Double salesAmount;

    //快递费
    @Column(name = "express_fee")
    private Double expressFee;

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

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(Double salesAmount) {
        this.salesAmount = salesAmount;
    }

    public Double getExpressFee() {
        return expressFee;
    }

    public void setExpressFee(Double expressFee) {
        this.expressFee = expressFee;
    }

    @Override
    public String toString() {
        return "SalesOrder{" +
                "id=" + id +
                ", cardNumber=" + cardNumber +
                ", customerId=" + customerId +
                ", salesAmount=" + salesAmount +
                ", expressFee=" + expressFee +
                '}';
    }
}
