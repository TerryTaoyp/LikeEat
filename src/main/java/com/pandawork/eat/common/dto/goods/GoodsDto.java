package com.pandawork.eat.common.dto.goods;

/**
 * Created by Taoyongpan on 2017/11/20.
 */
public class GoodsDto {

    //商品ID
    private Integer id;

    //商品名字
    private String goodsName;

    //商品类别的ID
    private String goodsType;

    //商品的备注信息
    private String typeRemark;

    //商品的产地
    private String goodsAddress;

    //商品规格
    private String specification;

    //商品进货价格
    private Double priceCost;

    //商品市场价格
    private Double marketPrice;

    //商品备注信息
    private String goodsRemark;

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

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getTypeRemark() {
        return typeRemark;
    }

    public void setTypeRemark(String typeRemark) {
        this.typeRemark = typeRemark;
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

    public Double getPriceCost() {
        return priceCost;
    }

    public void setPriceCost(Double priceCost) {
        this.priceCost = priceCost;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getGoodsRemark() {
        return goodsRemark;
    }

    public void setGoodsRemark(String goodsRemark) {
        this.goodsRemark = goodsRemark;
    }
}
