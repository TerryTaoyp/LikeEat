package com.pandawork.eat.mapper.goods;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.goods.GoodsType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/25.
 */
public interface GoodsTypeMapper {
    /**
     * 新增商品类型
     * @param goodsType
     * @throws SSException
     */
    public void addGoodsType(@Param("goodsType") GoodsType goodsType)throws SSException;

    /***
     * 编辑商品类型的基本信息
     * @param goodsType
     * @throws SSException
     */
    public void editGoodsType(@Param("goodsType") GoodsType goodsType)throws SSException;

    /**
     * 删除商品信息
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delGoodsType(@Param("id")int id)throws SSException;

    /**
     * 列出所有的商品类型
     * @return
     * @throws SSException
     */
    public List<GoodsType> listAll()throws SSException;

}
