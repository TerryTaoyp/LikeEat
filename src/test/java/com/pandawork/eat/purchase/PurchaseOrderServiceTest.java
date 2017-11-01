package com.pandawork.eat.purchase;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.AbstractTestCase;
import com.pandawork.eat.common.entity.purchase.PurchaseOrder;
import com.pandawork.eat.service.purchase.PurchaseOrderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public class PurchaseOrderServiceTest extends AbstractTestCase {
    @Autowired
    PurchaseOrderService purchaseOrderService;

    /**
     * 新增测试
     * @throws SSException
     */
    @Test
    public void addTest()throws SSException{
        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setCardNumber(1);
        purchaseOrder.setExpressFee(2.2);
        purchaseOrder.setSalesAmount(3.3);
        purchaseOrder.setSupplierId(3);
        purchaseOrderService.addPurchaseOrder(purchaseOrder);
    }

    /**
     * 编辑测试
     * @throws SSException
     */
    @Test
    public void editTest()throws SSException{
        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setId(1);
        purchaseOrder.setCardNumber(1);
        purchaseOrder.setExpressFee(2.2);
        purchaseOrder.setSalesAmount(3.3);
        purchaseOrder.setSupplierId(3);
        purchaseOrderService.updatePurchaseOrder(purchaseOrder);
    }

    /**
     * 删除测试
     * @throws SSException
     */
    @Test
    public void delTest()throws SSException{
        purchaseOrderService.delPurchaseOrder(2);
    }

    /**
     * 列出所有测试
     * @throws SSException
     */
    @Test
    public void listAllTest()throws SSException{
        purchaseOrderService.listAll();
    }
}
