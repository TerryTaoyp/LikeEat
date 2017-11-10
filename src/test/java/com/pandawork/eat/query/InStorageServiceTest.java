package com.pandawork.eat.query;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.AbstractTestCase;
import com.pandawork.eat.common.entity.query.InStorage;
import com.pandawork.eat.service.query.InStorageService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public class InStorageServiceTest extends AbstractTestCase {
    @Autowired
    InStorageService inStorageService;

    /**
     * 新增测试
     * @throws SSException
     */
    @Test
    public void addTest()throws SSException{
        InStorage inStorage = new InStorage();
        inStorage.setSupplierId(1);
        inStorage.setGoodsId(2);
        inStorage.setInData("2017");
        inStorage.setNumber(34);
        inStorage.setPriceId(23);
        inStorage.setSumMoney(89.0);
        inStorageService.addInStorage(inStorage);
    }

    /**
     * 删除测试
     * @throws SSException
     */
    @Test
    public void delTest()throws SSException{
        inStorageService.delInStorage(2);
    }

    /**
     * 编辑测试
     * @throws SSException
     */
    @Test
    public void editTest()throws SSException{
        InStorage inStorage = new InStorage();
        inStorage.setId(1);
        inStorage.setSupplierId(1);
        inStorage.setGoodsId(2);
        inStorage.setInData("2017");
        inStorage.setNumber(34);
        inStorage.setPriceId(23);
        inStorage.setSumMoney(89.0);
        inStorageService.addInStorage(inStorage);
    }
}
