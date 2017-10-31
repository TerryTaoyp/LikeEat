package com.pandawork.eat.goods;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.AbstractTestCase;
import com.pandawork.eat.common.entity.goods.PricePara;
import com.pandawork.eat.service.goods.PriceParaService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public class PriceParaServiceTest extends AbstractTestCase {
    @Autowired
    PriceParaService priceParaService;

    /**
     * 新增价格参数测试
     * @throws SSException
     */
    @Test
    public void addTest()throws SSException{
        PricePara pricePara = new PricePara();
        pricePara.setCustomerTypeId(2);
        pricePara.setPricePara(3.2);
        priceParaService.addPricePara(pricePara);
    }

    /**
     * 价格参数编辑测试
     * @throws SSException
     */
    @Test
    public void editTest()throws SSException{
        PricePara pricePara = new PricePara();
        pricePara.setId(1);
        pricePara.setCustomerTypeId(2);
        pricePara.setPricePara(3.2);
        priceParaService.editPricePara(pricePara);
    }

    /**
     * 价格参数删除测试
     * @throws SSException
     */
    @Test
    public void delTest()throws SSException{
        priceParaService.delPricePara(1);
    }

    /**
     * 列出所有的测试
     * @throws SSException
     */
    @Test
    public void listAllTest()throws SSException{
        priceParaService.listAll();
    }
}
