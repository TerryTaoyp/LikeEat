package com.pandawork.eat.service.query;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.query.Stock;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface StockService {
    /**
     * 入库
     * @param stock
     * @throws SSException
     */
    public void addStock(Stock stock)throws SSException;

    /**
     * 删除
     * @param id
     * @throws SSException
     */
    public boolean delStock(int id)throws SSException;

    /**
     * 编辑
     * @param stock
     * @throws SSException
     */
    public void editStock(Stock stock)throws SSException;
}
