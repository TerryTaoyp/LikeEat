package com.pandawork.eat.mapper.sales;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.sales.CustomerType;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface CustomerTypeMapper {
    /**
     * 新增客户类型
     * @param customerType
     * @throws SSException
     */
    public void addCustomerType(@Param("customerType")CustomerType customerType)throws SSException;

    /**
     * 删除客户类型
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delCustomerType(@Param("id")int id)throws SSException;

    /**
     * 编辑客户类型信息
     * @param customerType
     * @throws SSException
     */
    public void editCustomerType(@Param("customerType")CustomerType customerType)throws SSException;

    /**
     * 列出所有的客户类型
     * @return
     * @throws SSException
     */
    public List<CustomerType> listAll()throws SSException;

    /**
     * 根据ID查找
     * @param id
     * @return
     * @throws SSException
     */
    public CustomerType queryById(@RequestParam("id") int id)throws SSException;
}
