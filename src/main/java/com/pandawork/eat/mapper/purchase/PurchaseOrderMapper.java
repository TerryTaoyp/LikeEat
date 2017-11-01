package com.pandawork.eat.mapper.purchase;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.purchase.PurchaseOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface PurchaseOrderMapper {
    /**
     * 新增采购订单
     * @param purchaseOrder
     * @throws SSException
     */
    public void addPurchaseOrder(@Param("purchaseOrder")PurchaseOrder purchaseOrder)throws SSException;

    /**
     * 编辑采购订单信息
     * @param purchaseOrder
     * @throws SSException
     */
    public void updatePurchaseOrder(@Param("purchaseOrder")PurchaseOrder purchaseOrder)throws SSException;

    /**
     * 删除采购订单
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delPurchaseOrder(@Param("id")int id)throws SSException;

    /**
     * 列出所有的采购订单
     * @return
     * @throws SSException
     */
    public List<PurchaseOrder> listAll()throws SSException;
}
