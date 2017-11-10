package com.pandawork.eat.service.sales.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.sales.RetailerType;
import com.pandawork.eat.common.exception.EatException;
import com.pandawork.eat.mapper.sales.RetailerTypeMapper;
import com.pandawork.eat.service.sales.RetailerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "retailerTypeService")
public class RetailerTypeServiceImpl implements RetailerTypeService {
    @Autowired
    RetailerTypeMapper retailerTypeMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void addRetailerType(RetailerType retailerType) throws SSException {
        try {
            if (Assert.isNull(retailerType)){
                return;
            }
            retailerTypeMapper.addRetailerType(retailerType);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.AddRetailerTypeFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public boolean delRetailerType(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return false;
            }
            return retailerTypeMapper.delRetailerType(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.DelRetailerTypeFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void editRetailerType(RetailerType retailerType) throws SSException {
        try {
            if (Assert.isNull(retailerType)){
                return;
            }
            retailerTypeMapper.editRetailerType(retailerType);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.EditRetailerTypeFailed);
        }
    }

    @Override
    public List<RetailerType> listAll() throws SSException {
        try {
            return retailerTypeMapper.listAll();
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.ListAllRetailerTypeFailed);
        }
    }
}
