package com.pandawork.eat.service.goods;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.goods.GoodsPrice;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/25.
 */
public interface GoodsPriceService {

    /**
     * 新增商品价格信息
     * @param goodsPrice
     * @throws SSException
     */
    public void addGoodsPrice(GoodsPrice goodsPrice)throws SSException;

    /**
     * 修改商品信息
     * @param goodsPrice
     * @throws SSException
     */
    public void updateGoodsPrice(GoodsPrice goodsPrice)throws SSException;

    /**
     * 根据ID删除
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delGoodsPrice(int id)throws SSException;

    /**
     * 列出所有
     * @return
     * @throws SSException
     */
    public List<GoodsPrice> listAll()throws SSException;

    /**
     * 根据ID查找
     * @param id
     * @return
     * @throws SSException
     */
    public GoodsPrice queryById(int id)throws SSException;

    /**
     * 根据ID查找
     * @param id
     * @return
     * @throws SSException
     */
    public GoodsPrice queryByGoodsId(int goodsId)throws SSException;
}
