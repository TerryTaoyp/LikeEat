package com.pandawork.eat.service.sales.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.sales.Customer;
import com.pandawork.eat.common.exception.EatException;
import com.pandawork.eat.mapper.sales.CustomerMapper;
import com.pandawork.eat.service.sales.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void addCustomer(Customer customer) throws SSException {
        try {
            if (Assert.isNull(customer)){
                return;
            }
            customerMapper.addCustomer(customer);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.AddCustomerFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public boolean delCustomer(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return false;
            }
            return customerMapper.delCustomer(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.DelCustomerFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void editCustomer(Customer customer) throws SSException {
        try {
            if (Assert.isNull(customer)){
                return;
            }
            customerMapper.editCustomer(customer);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.EditCustomerFailed);
        }
    }

    @Override
    public List<Customer> listAll() throws SSException {
        try {
            return customerMapper.listAll();
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.ListAllCustomerFailed);
        }
    }
}
