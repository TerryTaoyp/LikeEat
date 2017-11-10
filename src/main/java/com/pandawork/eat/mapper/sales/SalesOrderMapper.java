package com.pandawork.eat.mapper.sales;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.sales.SalesOrder;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface SalesOrderMapper {
    /**
     * 新增销售订单
     * @param salesOrder
     * @throws SSException
     */
    public void addSalesOrder(@Param("salesOrder")SalesOrder salesOrder)throws SSException;

    /**
     * 根据ID删除销售订单
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delSalesOrder(@Param("id")int id)throws SSException;

    /**
     * 编辑销售订单信息
     * @param salesOrder
     * @throws SSException
     */
    public void editSalesOrder(@Param("salesOrder")SalesOrder salesOrder)throws SSException;
}
