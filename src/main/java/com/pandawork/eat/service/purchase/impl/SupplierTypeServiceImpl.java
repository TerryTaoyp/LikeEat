package com.pandawork.eat.service.purchase.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.purchase.SupplierType;
import com.pandawork.eat.common.exception.EatException;
import com.pandawork.eat.mapper.purchase.SupplierTypeMapper;
import com.pandawork.eat.service.purchase.SupplierTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "supplierTypeService")
public class SupplierTypeServiceImpl implements SupplierTypeService {

    @Autowired
    SupplierTypeMapper supplierTypeMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void addSupplierType(SupplierType supplierType) throws SSException {
        try {
            if (Assert.isNull(supplierType)) {
                return;
            }
            supplierTypeMapper.addSupplierType(supplierType);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.AddSupplierTypeFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {SSException.class,Exception.class,RuntimeException.class})
    public void editSupplierType(SupplierType supplierType) throws SSException {
        try {
            if (Assert.isNull(supplierType)){
                return;
            }
            supplierTypeMapper.editSupplierType(supplierType);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.EditSupplierTypeFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {SSException.class,Exception.class,RuntimeException.class})
    public boolean delSupplierType(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return false;
            }
            return supplierTypeMapper.delSupplierType(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.DelSupplierTypeFailed);
        }
    }

    @Override
    public List<SupplierType> listAll() throws SSException {
        try {
            return supplierTypeMapper.listAll();
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.ListAllSupplierTypeFailed);
        }
    }

    @Override
    public SupplierType queryById(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return null;
            }
            return supplierTypeMapper.queryById(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.QuerySupplierTypeByIdFailed);
        }
    }
}
