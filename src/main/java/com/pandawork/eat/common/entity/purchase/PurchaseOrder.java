package com.pandawork.eat.common.entity.purchase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Taoyongpan on 2017/10/19.
 * 采购订单表
 */
@Entity
@Table(name = "t_purchase_order")
public class PurchaseOrder {
    @Id
    private Integer id;

    //订单编号，自动生成
    @Column(name = "card_number")
    private Integer cardNumber;

    //供货商ID
    @Column(name = "supplier_id")
    private Integer supplierId;

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

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
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
        return "PurchaseOrder{" +
                "id=" + id +
                ", cardNumber=" + cardNumber +
                ", supplierId=" + supplierId +
                ", salesAmount=" + salesAmount +
                ", expressFee=" + expressFee +
                '}';
    }
}
