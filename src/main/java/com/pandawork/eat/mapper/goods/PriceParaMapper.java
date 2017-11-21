package com.pandawork.eat.mapper.goods;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.goods.PricePara;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/25.
 */
public interface PriceParaMapper {
    /**
     * 新增价格参数
     * @param pricePara
     * @throws SSException
     */
    public void addPricePara(@Param("pricePara") PricePara pricePara)throws SSException;

    /**
     * 编辑价格参数
     * @param pricePara
     * @throws SSException
     */
    public void editPricePara(@Param("pricePara")PricePara pricePara)throws SSException;

    /**
     * 根据ID删除价格参数
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delPricePara(@Param("id") int id)throws SSException;

    /**
     * 列出所有价格参数
     * @return
     * @throws SSException
     */
    public List<PricePara> listAll()throws SSException;

    /**
     * 根据ID查找价格参数
     * @param id
     * @return
     * @throws SSException
     */
    public PricePara queryById(@Param("id") int id)throws SSException;
}
