package com.pandawork.eat.service.goods;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.goods.GoodsType;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/28.
 */
public interface GoodsTypeService {
    /**
     * 新增商品类型
     * @param goodsType
     * @throws SSException
     */
    public void addGoodsType(GoodsType goodsType)throws SSException;

    /***
     * 编辑商品类型的基本信息
     * @param goodsType
     * @throws SSException
     */
    public void editGoodsType(GoodsType goodsType)throws SSException;

    /**
     * 删除商品信息
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delGoodsType(int id)throws SSException;

    /**
     * 列出所有的商品类型
     * @return
     * @throws SSException
     */
    public List<GoodsType> listAll()throws SSException;
}
