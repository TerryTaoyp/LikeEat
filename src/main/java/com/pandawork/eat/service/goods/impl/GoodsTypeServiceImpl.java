package com.pandawork.eat.service.goods.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.goods.GoodsType;
import com.pandawork.eat.common.exception.EatException;
import com.pandawork.eat.mapper.goods.GoodsTypeMapper;
import com.pandawork.eat.service.goods.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/28.
 */
@Service(value = "goodsTypeService")
public class GoodsTypeServiceImpl implements GoodsTypeService {
    @Autowired
    GoodsTypeMapper goodsTypeMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void addGoodsType(GoodsType goodsType) throws SSException {
        try {
            if (Assert.isNull(goodsType)){
                return;
            }
            goodsTypeMapper.addGoodsType(goodsType);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.AddGoodsTypeFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void editGoodsType(GoodsType goodsType) throws SSException {
        try {
            if (Assert.isNull(goodsType)){
                return;
            }
            goodsTypeMapper.editGoodsType(goodsType);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.EditGoodsTypeFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public boolean delGoodsType(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return false;
            }
            return goodsTypeMapper.delGoodsType(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.DelGoodsTypeFailed);
        }
    }

    @Override
    public List<GoodsType> listAll() throws SSException {
        try {
            return goodsTypeMapper.listAll();
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.ListAllGoodsType);
        }
    }
}
