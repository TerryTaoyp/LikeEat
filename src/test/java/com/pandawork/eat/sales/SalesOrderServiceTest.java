package com.pandawork.eat.sales;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.AbstractTestCase;
import com.pandawork.eat.common.entity.sales.SalesOrder;
import com.pandawork.eat.service.sales.SalesOrderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public class SalesOrderServiceTest extends AbstractTestCase {
    @Autowired
    SalesOrderService salesOrderService;

    /**
     * 新增测试
     * @throws SSException
     */
    @Test
    public void addTest()throws SSException{
        SalesOrder salesOrder = new SalesOrder();
        salesOrder.setCardNumber(24);
        salesOrder.setCustomerId(34);
        salesOrder.setExpressFee(4.5);
        salesOrder.setSalesAmount(4.6);
        salesOrderService.addSalesOrder(salesOrder);
    }

    /**
     * 删除测试
     * @throws SSException
     */
    @Test
    public void delTest()throws SSException{
        salesOrderService.delSalesOrder(2);
    }

    /**
     * 编辑测试
     * @throws SSException
     */
    @Test
    public void editTest()throws SSException{
        SalesOrder salesOrder = new SalesOrder();
        salesOrder.setId(1);
        salesOrder.setCardNumber(25);
        salesOrder.setCustomerId(34);
        salesOrder.setExpressFee(4.5);
        salesOrder.setSalesAmount(4.6);
        salesOrderService.editSalesOrder(salesOrder);
    }
}
