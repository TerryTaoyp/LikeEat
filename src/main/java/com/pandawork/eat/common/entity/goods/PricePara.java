package com.pandawork.eat.common.entity.goods;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Taoyongpan on 2017/10/19.
 * 价格参数表
 */
@Entity
@Table(name = "t_price_parameter")
public class PricePara {
    @Id
    private Integer id;

    //客户类别
    @Column(name = "customer_type_id")
    private Integer customerTypeId;

    //价格参数
    @Column(name = "price_parameter")
    private Double pricePara;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Integer customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public Double getPricePara() {
        return pricePara;
    }

    public void setPricePara(Double pricePara) {
        this.pricePara = pricePara;
    }

    @Override
    public String toString() {
        return "PricePara{" +
                "id=" + id +
                ", customerTypeId=" + customerTypeId +
                ", pricePara=" + pricePara +
                '}';
    }
}
