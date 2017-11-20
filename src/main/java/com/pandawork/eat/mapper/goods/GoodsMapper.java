package com.pandawork.eat.mapper.goods;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.dto.goods.GoodsDto;
import com.pandawork.eat.common.entity.goods.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/25.
 */
public interface GoodsMapper {
    /**
     * 新增商品
     * @param goods
     * @throws SSException
     */
    public void addGoods(@Param("goods") Goods goods)throws SSException;

    /**
     * 编辑商品信息
     * @param goods
     * @throws SSException
     */
    public void updateGoods(@Param("goods") Goods goods)throws SSException;

    /**
     * 根据ID删除商品
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delGoods(@Param("id") int id)throws SSException;

    /**
     * 根据ID查找
     * @param id
     * @return
     * @throws SSException
     */
    public Goods queryGoodsById(@Param("id") int id)throws SSException;

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
    public List<Goods> queryGoodsByType(@Param("goodsType") int goodsType)throws SSException;

    /**
     * 根据商品名字查找商品信息
     * @param goodsName
     * @return
     * @throws SSException
     */
    public Goods queryGoodsByName(@Param("goodsName") String goodsName)throws SSException;

    /**
     * 列出所有的
     * @return
     * @throws SSException
     */
    public List<GoodsDto> listAllGoodsDto()throws SSException;

    /**
     * 根据ID查询商品的基本信息
     * @param id
     * @return
     * @throws SSException
     */
    public GoodsDto queryGoodsDtoById(@Param("id") int id)throws SSException;
}
