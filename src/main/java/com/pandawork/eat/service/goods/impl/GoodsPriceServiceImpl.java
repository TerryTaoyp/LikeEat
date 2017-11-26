package com.pandawork.eat.service.goods.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.goods.GoodsPrice;
import com.pandawork.eat.common.exception.EatException;
import com.pandawork.eat.mapper.goods.GoodsPriceMapper;
import com.pandawork.eat.service.goods.GoodsPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/25.
 */
@Service(value = "goodsPriceService")
public class GoodsPriceServiceImpl implements GoodsPriceService {
    @Autowired
    GoodsPriceMapper goodsPriceMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void addGoodsPrice(GoodsPrice goodsPrice) throws SSException {
        try {
            if (Assert.isNull(goodsPrice)){
                return;
            }
            goodsPriceMapper.addGoodsPrice(goodsPrice);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.AddGoodsPriceFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void updateGoodsPrice(GoodsPrice goodsPrice) throws SSException {
        try {
            if (Assert.isNull(goodsPrice)){
                return;
            }
            goodsPriceMapper.updateGoodsPrice(goodsPrice);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.UpdateGoodsPriceFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public boolean delGoodsPrice(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return false;
            }
            return goodsPriceMapper.delGoodsPrice(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.DelGoodsPriceFailed);
        }
    }

    @Override
    public List<GoodsPrice> listAll() throws SSException {
        try {
            return goodsPriceMapper.listAll();
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.ListAllGoodsPriceFailed);
        }
    }

    @Override
    public GoodsPrice queryById(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return null;
            }
            System.out.println(goodsPriceMapper.queryById(id));
            return goodsPriceMapper.queryById(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.QueryGoodsPriceByIdFailed);
        }
    }

    @Override
    public GoodsPrice queryByGoodsId(int goodsId) throws SSException {
        try {
            if (Assert.isNull(goodsId)){
                return null;
            }
            return goodsPriceMapper.queryByGoodsId(goodsId);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.QueryGoodsPriceByGoodsIdFailed);
        }
    }
}
