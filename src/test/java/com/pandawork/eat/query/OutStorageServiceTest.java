package com.pandawork.eat.query;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.AbstractTestCase;
import com.pandawork.eat.common.entity.query.OutStorage;
import com.pandawork.eat.service.query.OutStorageService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public class OutStorageServiceTest extends AbstractTestCase {
    @Autowired
    OutStorageService outStorageService;

    /**
     * 新增测试
     * @throws SSException
     */
    @Test
    public void addTest()throws SSException{
        OutStorage outStorage = new OutStorage();
        outStorage.setPriceId(1);
        outStorage.setGoodsId(2);
        outStorage.setCustomerId(3);
        outStorage.setExpressFee(3.2);
        outStorage.setOtherFee(4.3);
        outStorage.setSellMoney(5.6);
        outStorage.setSellNumber(45);
        outStorageService.addOutStorage(outStorage);
    }

    /**
     * 删除测试
     * @throws SSException
     */
    @Test
    public void delTest()throws SSException{
        outStorageService.delOutStorage(2);
    }

    /**
     * 编辑测试
     * @throws SSException
     */
    @Test
    public void editTest()throws SSException{
        OutStorage outStorage = new OutStorage();
        outStorage.setId(1);
        outStorage.setPriceId(4);
        outStorage.setGoodsId(2);
        outStorage.setCustomerId(3);
        outStorage.setExpressFee(3.2);
        outStorage.setOtherFee(4.3);
        outStorage.setSellMoney(5.6);
        outStorage.setSellNumber(45);
        outStorageService.editOutStorage(outStorage);
    }
}
