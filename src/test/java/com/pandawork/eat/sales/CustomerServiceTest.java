package com.pandawork.eat.sales;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.AbstractTestCase;
import com.pandawork.eat.common.entity.sales.Customer;
import com.pandawork.eat.service.sales.CustomerService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public class CustomerServiceTest extends AbstractTestCase {
    @Autowired
    CustomerService customerService;

    /**
     * 新增客户测试
     * @throws SSException
     */
    @Test
    public void addTest()throws SSException{
        Customer customer = new Customer();
        customer.setRemark("haha");
        customer.setCustomerName("tao");
        customer.setAlipay("taoyongpan");
        customer.setBankName("交通银行");
        customer.setBankNum("34567890");
        customer.setCustomerTypeId(1);
        customer.setDeliveryAddress1("henan");
        customer.setDeliveryAddress2("zhengzhou");
        customer.setDeliveryAddress3("zhongmu");
        customer.setEmail1("yewu");
        customer.setEmail2("2");
        customer.setQq("565656556");
        customer.setWeChat("jf");
        customer.setTelephone1("hah");
        customer.setTelephone2("hah");
        customer.setTelephone3("hah");
        customer.setUnitAddress("dfhadha");
        customerService.addCustomer(customer);
    }

    /**
     * 删除测试
     * @throws SSException
     */
    @Test
    public void delTest()throws SSException{
        customerService.delCustomer(1);
    }

    /**
     * 编辑测试
     * @throws SSException
     */
    @Test
    public void editTest()throws SSException{
        Customer customer = new Customer();
        customer.setId(2);
        customer.setRemark("haha");
        customer.setCustomerName("tao");
        customer.setAlipay("taoyongpan");
        customer.setBankName("交通银行");
        customer.setBankNum("34567890");
        customer.setCustomerTypeId(1);
        customer.setDeliveryAddress1("henan");
        customer.setDeliveryAddress2("zhengzhou");
        customer.setDeliveryAddress3("zhongmu");
        customer.setEmail1("yewu");
        customer.setEmail2("2");
        customer.setQq("565656556");
        customer.setWeChat("jf");
        customer.setTelephone1("hah");
        customer.setTelephone2("hah");
        customer.setTelephone3("hah");
        customer.setUnitAddress("dfhadha");
        customerService.editCustomer(customer);
    }

    /**
     * 列出所有测试
     * @throws SSException
     */
    @Test
    public void listAll()throws SSException{
        customerService.listAll();
    }

}
