package com.pandawork.eat.service.purchase.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.purchase.Supplier;
import com.pandawork.eat.common.exception.EatException;
import com.pandawork.eat.mapper.purchase.SupplierMapper;
import com.pandawork.eat.service.purchase.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "supplierService")
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    SupplierMapper supplierMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void addSupplier(Supplier supplier) throws SSException {
        try {
            if (Assert.isNull(supplier)){
                return;
            }
            supplierMapper.addSupplier(supplier);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.AddSupplierFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void editSupplier(Supplier supplier) throws SSException {
        try {
            if (Assert.isNull(supplier)){
                return;
            }
            supplierMapper.editSupplier(supplier);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.EditSupplierFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public boolean delSupplier(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return false;
            }
            return supplierMapper.delSupplier(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.DelSupplierFailed);
        }
    }

    @Override
    public List<Supplier> listAll() throws SSException {
        try {
            return supplierMapper.listAll();
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.ListSupplierFailed);
        }
    }
}
