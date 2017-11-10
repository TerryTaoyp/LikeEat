package com.pandawork.eat.sales;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.AbstractTestCase;
import com.pandawork.eat.common.entity.sales.CustomerType;
import com.pandawork.eat.service.sales.CustomerTypeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public class CustomerTypeServiceTest extends AbstractTestCase {
    @Autowired
    CustomerTypeService customerTypeService;

    /**
     * 新增客户类型测试
     * @throws SSException
     */
    @Test
    public void AddTest()throws SSException{
        CustomerType customerType = new CustomerType();
        customerType.setName("test");
        customerType.setRemark("beizhu");
        customerTypeService.addCustomerType(customerType);
    }

    /**
     * 删除客户类型测试
     * @return
     * @throws SSException
     */
    @Test
    public void delTest()throws SSException{
        customerTypeService.delCustomerType(1);
    }

    /**
     * 编辑测试
     * @throws SSException
     */
    @Test
    public void editTest()throws SSException{
        CustomerType customerType = new CustomerType();
        customerType.setName("test");
        customerType.setRemark("beizhu");
        customerType.setId(2);
        customerTypeService.editCustomerType(customerType);
    }

    /**
     * 罗列测试
     * @throws SSException
     */
    @Test
    public void listAllTest()throws SSException{
        customerTypeService.listAll();
    }
}
