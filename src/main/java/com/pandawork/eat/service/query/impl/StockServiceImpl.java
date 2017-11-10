package com.pandawork.eat.service.query.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.query.Stock;
import com.pandawork.eat.common.exception.EatException;
import com.pandawork.eat.mapper.query.StockMapper;
import com.pandawork.eat.service.query.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "stockService")
public class StockServiceImpl implements StockService {
    @Autowired
    StockMapper stockMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void addStock(Stock stock) throws SSException {
        try {
            if (Assert.isNull(stock)){
                return;
            }
            stockMapper.addStock(stock);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.AddStockFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public boolean delStock(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return false;
            }
            return stockMapper.delStock(id);
        }
        catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.DelStockFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void editStock(Stock stock) throws SSException {
        try {
            if (Assert.isNull(stock)){
                return;
            }
            stockMapper.editStock(stock);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.EditStockFailed);
        }
    }
}
