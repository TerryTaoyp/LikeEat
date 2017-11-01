package com.pandawork.eat.purchase;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.AbstractTestCase;
import com.pandawork.eat.common.entity.purchase.Supplier;
import com.pandawork.eat.service.purchase.SupplierService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public class SupplierServiceTest extends AbstractTestCase {
    @Autowired
    SupplierService supplierService;

    /**
     * 供货商新增测试
     * @throws SSException
     */
    @Test
    public void addTest()throws SSException{
        Supplier supplier = new Supplier();
        supplier.setSupplierName("hahaha");
        supplier.setSupplierTypeId(1);
        supplier.setSupplierAddress("hahahaha");
        supplier.setTelephone("15764321950");
        supplier.setRemark("hahahha");
        supplierService.addSupplier(supplier);
    }

    /**
     * 编辑测试
     * @throws SSException
     */
    @Test
    public void editTest()throws SSException{
        Supplier supplier = new Supplier();
        supplier.setId(2);
        supplier.setSupplierName("hahaha");
        supplier.setSupplierTypeId(1);
        supplier.setSupplierAddress("hahahaha");
        supplier.setTelephone("15764321950");
        supplier.setRemark("hahahha");
        supplierService.editSupplier(supplier);
    }

    /**
     * 删除测试
     * @throws SSException
     */
    @Test
    public void delTest()throws SSException{
        supplierService.delSupplier(2);
    }

    /**
     * 列出所有测试
     * @throws SSException
     */
    @Test
    public void listAllTest()throws SSException{
        supplierService.listAll();
    }
}
