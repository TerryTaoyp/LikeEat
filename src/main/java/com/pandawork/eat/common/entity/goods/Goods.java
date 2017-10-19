package com.pandawork.eat.common.entity.goods;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Taoyongpan on 2017/10/19.
 */

@Entity
@Table(name = "t_goods")
public class Goods {

    @Id
    private Integer id;

    //商品名字
    @Column(name = "goods_name")
    private String goodsName;

    //商品类别的ID
    @Column(name = "goods_type")
    private Integer goodsType;

    //商品的产地
    @Column(name = "goods_address")
    private String goodsAddress;

    //商品规格
    @Column(name = "specification")
    private String specification;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsAddress() {
        return goodsAddress;
    }

    public void setGoodsAddress(String goodsAddress) {
        this.goodsAddress = goodsAddress;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", goodsType=" + goodsType +
                ", goodsAddress='" + goodsAddress + '\'' +
                ", specification='" + specification + '\'' +
                '}';
    }
}
