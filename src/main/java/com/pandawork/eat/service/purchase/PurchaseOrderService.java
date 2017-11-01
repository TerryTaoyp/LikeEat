package com.pandawork.eat.service.purchase;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.purchase.PurchaseOrder;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface PurchaseOrderService {
    /**
     * 新增采购订单
     * @param purchaseOrder
     * @throws SSException
     */
    public void addPurchaseOrder(PurchaseOrder purchaseOrder)throws SSException;

    /**
     * 编辑采购订单信息
     * @param purchaseOrder
     * @throws SSException
     */
    public void updatePurchaseOrder(PurchaseOrder purchaseOrder)throws SSException;

    /**
     * 删除采购订单
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delPurchaseOrder(int id)throws SSException;

    /**
     * 列出所有的采购订单
     * @return
     * @throws SSException
     */
    public List<PurchaseOrder> listAll()throws SSException;
}
