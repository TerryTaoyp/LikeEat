package com.pandawork.eat.mapper.goods;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.goods.GoodsPrice;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Taoyongpan on 2017/10/25.
 */
public interface GoodsPriceMapper {
    /**
     * 新增商品价格信息
     * @param goodsPrice
     * @throws SSException
     */
    public void addGoodsPrice(@Param("goodsPrice") GoodsPrice goodsPrice)throws SSException;

    /**
     * 修改商品信息
     * @param goodsPrice
     * @throws SSException
     */
    public void updateGoodsPrice(@Param("goodsPrice") GoodsPrice goodsPrice)throws SSException;

    /**
     * 根据ID删除
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delGoodsPrice(@Param("id") int id)throws SSException;
}
