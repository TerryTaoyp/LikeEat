package com.pandawork.eat.mapper.sales;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.sales.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface CustomerMapper {
    /**
     * 新增客户
     * @param customer
     * @throws SSException
     */
    public void addCustomer(@Param("customer")Customer customer)throws SSException;

    /**
     * 删根据ID除客户
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delCustomer(@Param("id")int id)throws SSException;

    /**
     * 编辑客户信息
     * @param customer
     * @throws SSException
     */
    public void editCustomer(@Param("customer")Customer customer)throws SSException;

    /**
     * 列出所有客户的信息
     * @return
     * @throws SSException
     */
    public List<Customer> listAll()throws SSException;

    /**
     * 根据 ID查找
     * @param id
     * @return
     * @throws SSException
     */
    public Customer queryById(@Param("id") int id)throws SSException;
}
