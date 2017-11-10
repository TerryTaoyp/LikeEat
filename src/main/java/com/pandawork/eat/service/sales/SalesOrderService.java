package com.pandawork.eat.service.sales;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.sales.SalesOrder;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface SalesOrderService {
    /**
     * 新增销售订单
     * @param salesOrder
     * @throws SSException
     */
    public void addSalesOrder(SalesOrder salesOrder)throws SSException;

    /**
     * 根据ID删除销售订单
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delSalesOrder(int id)throws SSException;

    /**
     * 编辑销售订单信息
     * @param salesOrder
     * @throws SSException
     */
    public void editSalesOrder(SalesOrder salesOrder)throws SSException;
}
