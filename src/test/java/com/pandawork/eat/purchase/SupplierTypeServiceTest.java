package com.pandawork.eat.purchase;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.AbstractTestCase;
import com.pandawork.eat.common.entity.purchase.SupplierType;
import com.pandawork.eat.service.purchase.SupplierTypeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public class SupplierTypeServiceTest extends AbstractTestCase {
    @Autowired
    SupplierTypeService supplierTypeService;

    /**
     * 新增供货商类别
     * @throws SSException
     */
    @Test
    public void addTest()throws SSException{
        SupplierType supplierType = new SupplierType();
        supplierType.setName("hjd");
        supplierType.setRemark("hfjfh");
        supplierTypeService.addSupplierType(supplierType);
    }

    /**
     * 编辑测试
     * @throws SSException
     */
    @Test
    public void editTest()throws SSException{
        SupplierType supplierType = new SupplierType();
        supplierType.setId(1);
        supplierType.setName("hsj");
        supplierType.setRemark("haha");
        supplierTypeService.editSupplierType(supplierType);
    }

    /**
     * 删除测试
     * @throws SSException
     */
    @Test
    public void delTest()throws SSException{
        supplierTypeService.delSupplierType(2);
    }

    /**
     * 列表测试
     * @throws SSException
     */
    @Test
    public void listAllTest()throws SSException{
        supplierTypeService.listAll();
    }
}
