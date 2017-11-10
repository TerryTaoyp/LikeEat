package com.pandawork.eat.query;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.AbstractTestCase;
import com.pandawork.eat.common.entity.query.Stock;
import com.pandawork.eat.service.query.StockService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public class StockServiceTest extends AbstractTestCase {
    @Autowired
    StockService stockService;

    /**
     * 新增
     * @throws SSException
     */
    @Test
    public void addTest()throws SSException{
        Stock stock = new Stock();
        stock.setGoodsId(2);
        stock.setAveragesPrice(2.3);
        stock.setNumber(23);
        stock.setSumMoney(45.4);
        stockService.addStock(stock);
    }

    /**
     * 删除测试
     * @throws SSException
     */
    @Test
    public void delTest()throws SSException{
        Stock stock = new Stock();
        stockService.delStock(2);
    }

    /**
     * 编辑测试
     * @throws SSException
     */
    @Test
    public void editTest()throws SSException{
        Stock stock = new Stock();
        stock.setId(1);
        stock.setGoodsId(23);
        stock.setAveragesPrice(2.3);
        stock.setNumber(23);
        stock.setSumMoney(45.4);
    }
}
