package com.pandawork.eat.service.sales;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.sales.Customer;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface CustomerService {
    /**
     * 新增客户
     * @param customer
     * @throws SSException
     */
    public void addCustomer(Customer customer)throws SSException;

    /**
     * 删根据ID除客户
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delCustomer(int id)throws SSException;

    /**
     * 编辑客户信息
     * @param customer
     * @throws SSException
     */
    public void editCustomer(Customer customer)throws SSException;

    /**
     * 列出所有客户的信息
     * @return
     * @throws SSException
     */
    public List<Customer> listAll()throws SSException;
}
