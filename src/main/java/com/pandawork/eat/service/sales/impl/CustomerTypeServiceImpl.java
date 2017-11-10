package com.pandawork.eat.service.sales.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.sales.CustomerType;
import com.pandawork.eat.common.exception.EatException;
import com.pandawork.eat.mapper.sales.CustomerTypeMapper;
import com.pandawork.eat.service.sales.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "customerTypeService")
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    CustomerTypeMapper customerTypeMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void addCustomerType(CustomerType customerType) throws SSException {
        try {
            if (Assert.isNull(customerType)){
                return;
            }
            customerTypeMapper.addCustomerType(customerType);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.AddCustomerTypeFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public boolean delCustomerType(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return false;
            }
            return customerTypeMapper.delCustomerType(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.DelCustomerTypeFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void editCustomerType(CustomerType customerType) throws SSException {
        try {
            if (Assert.isNull(customerType)){
                return;
            }
            customerTypeMapper.editCustomerType(customerType);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.EditCustomerTypeFailed);
        }
    }

    @Override
    public List<CustomerType> listAll() throws SSException {
        try {
            return customerTypeMapper.listAll();
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.ListAllCustomerTypeFailed);
        }
    }
}
