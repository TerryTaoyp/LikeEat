package com.pandawork.eat.mapper.query;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.query.Stock;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface StockMapper {
    /**
     * 入库
     * @param stock
     * @throws SSException
     */
    public void addStock(@Param("stock")Stock stock)throws SSException;

    /**
     * 删除
     * @param id
     * @throws SSException
     */
    public boolean delStock(@Param("id")int id)throws SSException;

    /**
     * 编辑
     * @param stock
     * @throws SSException
     */
    public void editStock(@Param("stock")Stock stock)throws SSException;
}
