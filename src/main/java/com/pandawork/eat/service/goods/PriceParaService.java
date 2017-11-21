package com.pandawork.eat.service.goods;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.goods.PricePara;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/28.
 */
public interface PriceParaService {
    /**
     * 新增价格参数
     * @param pricePara
     * @throws SSException
     */
    public void addPricePara(PricePara pricePara)throws SSException;

    /**
     * 编辑价格参数
     * @param pricePara
     * @throws SSException
     */
    public void editPricePara(PricePara pricePara)throws SSException;

    /**
     * 根据ID删除价格参数
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delPricePara(int id)throws SSException;

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
    public PricePara queryById(int id)throws SSException;
}
