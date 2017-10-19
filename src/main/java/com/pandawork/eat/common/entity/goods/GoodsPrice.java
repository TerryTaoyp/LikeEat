package com.pandawork.eat.common.entity.goods;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Taoyongpan on 2017/10/19.
 * 商品价格信息表
 */
@Entity
@Table(name = "t_goods_price")
public class GoodsPrice {
    @Id
    private Integer id;

    //商品的ID
    @Column(name = "goods_id")
    private Integer goodsId;

    //进货价格
    @Column(name = "price_cost")
    private Double primeCost;

    //市场价格
    @Column(name = "market_price")
    private Double marketPrice;

    //备注信息
    @Column(name = "remark")
    private String remark;

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

    public Double getPrimeCost() {
        return primeCost;
    }

    public void setPrimeCost(Double primeCost) {
        this.primeCost = primeCost;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "GoodsPrice{" +
                "id=" + id +
                ", goodsId=" + goodsId +
                ", primeCost=" + primeCost +
                ", marketPrice=" + marketPrice +
                ", remark='" + remark + '\'' +
                '}';
    }
}
