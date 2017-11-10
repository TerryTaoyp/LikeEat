package com.pandawork.eat.sales;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.AbstractTestCase;
import com.pandawork.eat.common.entity.sales.RetailerType;
import com.pandawork.eat.service.sales.RetailerTypeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public class RetailerTypeServiceTest extends AbstractTestCase {
    @Autowired
    RetailerTypeService retailerTypeService;

    /**
     * 新增测试
     * @throws SSException
     */
    @Test
    public void addTest()throws SSException{
        RetailerType retailerType = new RetailerType();
        retailerType.setName("gh");
        retailerType.setRemark("gdhs");
        retailerTypeService.addRetailerType(retailerType);
    }

    /**
     * 删除测试
     * @throws SSException
     */
    @Test
    public void delTest()throws SSException{
        retailerTypeService.delRetailerType(2);
    }

    /**
     * 编辑测试
     * @throws SSException
     */
    @Test
    public void editTest()throws SSException{
        RetailerType retailerType = new RetailerType();
        retailerType.setName("gh");
        retailerType.setId(1);
        retailerType.setRemark("vbv");
        retailerTypeService.editRetailerType(retailerType);
    }

    /**
     * 列出所有测试
     * @throws SSException
     */
    @Test
    public void listAllTest()throws SSException{
        retailerTypeService.listAll();
    }
}
