package com.pandawork.eat.service.purchase.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.purchase.PurchaseOrder;
import com.pandawork.eat.common.exception.EatException;
import com.pandawork.eat.mapper.purchase.PurchaseOrderMapper;
import com.pandawork.eat.service.purchase.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "purchaseOrderService")
public class PurchaseOrderServiceImpl implements PurchaseOrderService {
    @Autowired
    PurchaseOrderMapper purchaseOrderMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void addPurchaseOrder(PurchaseOrder purchaseOrder) throws SSException {
        try {
            if (Assert.isNull(purchaseOrder)){
                return;
            }
            purchaseOrderMapper.addPurchaseOrder(purchaseOrder);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.AddPurchaseOrderFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void updatePurchaseOrder(PurchaseOrder purchaseOrder) throws SSException {
        try {
            if (Assert.isNull(purchaseOrder)){
                return;
            }
            purchaseOrderMapper.updatePurchaseOrder(purchaseOrder);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.EditPurchaseOrderFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public boolean delPurchaseOrder(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return false;
            }
            return purchaseOrderMapper.delPurchaseOrder(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.DelPurchaseOrderFailed);
        }
    }

    @Override
    public List<PurchaseOrder> listAll() throws SSException {
        try {
            return purchaseOrderMapper.listAll();
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.ListAllPurchaseOrderFailed);
        }
    }
}
