package com.pandawork.eat.service.sales.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.sales.SalesOrder;
import com.pandawork.eat.common.exception.EatException;
import com.pandawork.eat.mapper.sales.SalesOrderMapper;
import com.pandawork.eat.service.sales.SalesOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "salesOrderService")
public class SalesOrderServiceImpl implements SalesOrderService {
    @Autowired
    SalesOrderMapper salesOrderMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void addSalesOrder(SalesOrder salesOrder) throws SSException {
        try {
            if (Assert.isNull(salesOrder)){
                return;
            }
            salesOrderMapper.addSalesOrder(salesOrder);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.AddSalesOrderFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public boolean delSalesOrder(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return false;
            }
            return salesOrderMapper.delSalesOrder(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.DelSalesOrderFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void editSalesOrder(SalesOrder salesOrder) throws SSException {
        try {
            if (Assert.isNull(salesOrder)){
                return;
            }
            salesOrderMapper.editSalesOrder(salesOrder);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.EditSalesOrderFailed);
        }
    }
}
