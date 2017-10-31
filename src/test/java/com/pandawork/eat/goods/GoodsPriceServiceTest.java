package com.pandawork.eat.goods;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.AbstractTestCase;
import com.pandawork.eat.common.entity.goods.GoodsPrice;
import com.pandawork.eat.service.goods.GoodsPriceService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Taoyongpan on 2017/10/27.
 */
public class GoodsPriceServiceTest extends AbstractTestCase {
    @Autowired
    GoodsPriceService goodsPriceService;

    /**
     * 新增测试
     * @throws SSException
     */
    @Test
    public void addTest()throws SSException{
        GoodsPrice goodsPrice = new GoodsPrice();
        goodsPrice.setGoodsId(1);
        goodsPrice.setMarketPrice(3.2);
        goodsPrice.setPrimeCost(3.4);
        goodsPrice.setRemark("haahha");
        goodsPriceService.addGoodsPrice(goodsPrice);
    }

    /**
     * 编辑测试
     * @throws SSException
     */
    @Test
    public void updateTest()throws SSException{
        GoodsPrice goodsPrice = new GoodsPrice();
        goodsPrice.setId(1);
        goodsPrice.setGoodsId(2);
        goodsPrice.setMarketPrice(3.2);
        goodsPrice.setPrimeCost(3.4);
        goodsPrice.setRemark("haahha");
        goodsPriceService.updateGoodsPrice(goodsPrice);
    }

    /**
     * 删除测试
     * @throws SSException
     */
    @Test
    public void delTest()throws SSException{
        goodsPriceService.delGoodsPrice(2);
    }
}
