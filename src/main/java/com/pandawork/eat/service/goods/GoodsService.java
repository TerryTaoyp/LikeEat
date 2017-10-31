package com.pandawork.eat.service.goods;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.goods.Goods;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/25.
 */
public interface GoodsService {
    /**
     * 新增商品
     * @param goods
     * @throws SSException
     */
    public void addGoods(Goods goods)throws SSException;

    /**
     * 编辑商品信息
     * @param goods
     * @throws SSException
     */
    public void updateGoods(Goods goods)throws SSException;

    /**
     * 根据ID删除商品
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delGoods(int id)throws SSException;

    /**
     * 根据ID查找
     * @param id
     * @return
     * @throws SSException
     */
    public Goods queryGoodsById(int id)throws SSException;

    /**
     * 列出所有的商品信息
     * @return
     * @throws SSException
     */
    public List<Goods> listAll()throws SSException;

    /**
     * 根据商品类型ID查找商品信息
     * @param goodsType
     * @return
     * @throws SSException
     */
    public List<Goods> queryGoodsByType(int goodsType)throws SSException;

    /**
     * 根据商品名字查找商品信息
     * @param goodsName
     * @return
     * @throws SSException
     */
    public Goods queryGoodsByName(String goodsName)throws SSException;
}
