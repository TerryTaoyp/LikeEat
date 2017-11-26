package com.pandawork.eat.service.goods.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.dto.goods.GoodsDto;
import com.pandawork.eat.common.entity.goods.Goods;
import com.pandawork.eat.common.exception.EatException;
import com.pandawork.eat.mapper.goods.GoodsMapper;
import com.pandawork.eat.service.goods.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/25.
 */
@Service(value = "goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void addGoods(Goods goods) throws SSException {
        try {
            if (Assert.isNull(goods)){
                return;
            }
            goodsMapper.addGoods(goods);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.AddGoodsFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void updateGoods(Goods goods) throws SSException {
        try {
            if (Assert.isNull(goods)){
                return;
            }
            goodsMapper.updateGoods(goods);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.UpdateGoodsFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public boolean delGoods(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return false;
            }
            return goodsMapper.delGoods(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.DelGoodsFailed);
        }
    }

    @Override
    public Goods queryGoodsById(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return null;
            }
            return goodsMapper.queryGoodsById(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.QueryGoodsByIdFailed);
        }
    }

    @Override
    public List<Goods> listAll() throws SSException {
        try {
            return goodsMapper.listAll();
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.ListAllGoodsFailed);
        }
    }

    @Override
    public List<Goods> queryGoodsByType(int goodsType) throws SSException {
        try {
            if (Assert.isNull(goodsType)){
                return null;
            }
            return goodsMapper.queryGoodsByType(goodsType);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.QueryGoodsByTypeFailed);
        }
    }

    @Override
    public Goods queryGoodsByName(String goodsName) throws SSException{
        try {
            if (Assert.isNull(goodsName)){
                return null;
            }
            return goodsMapper.queryGoodsByName(goodsName);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.QueryGoodsByNameFailed);
        }
    }

    @Override
    public List<GoodsDto> listAllGoodsDto() throws SSException {
        try {
            return goodsMapper.listAllGoodsDto();
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.ListAllGoodsFailed);
        }
    }

    @Override
    public GoodsDto queryGoodsDtoById(int id) throws SSException {
        try {
            if (Assert.isNotNull(id)){
                return goodsMapper.queryGoodsDtoById(id);
            }
            return null;
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.QueryGoodsByIdFailed);
        }
    }
}
