package com.pandawork.eat.service.goods.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.goods.PricePara;
import com.pandawork.eat.common.exception.EatException;
import com.pandawork.eat.mapper.goods.PriceParaMapper;
import com.pandawork.eat.service.goods.PriceParaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/28.
 */
@Service(value = "priceParaService")
public class PriceParaServiceImpl implements PriceParaService {
    @Autowired
    PriceParaMapper priceParaMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void addPricePara(PricePara pricePara) throws SSException {
        try {
            if (Assert.isNull(pricePara)){
                return;
            }
            priceParaMapper.addPricePara(pricePara);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.AddPriceParaFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void editPricePara(PricePara pricePara) throws SSException {
        try {
            if (Assert.isNull(pricePara)){
                return;
            }
            priceParaMapper.editPricePara(pricePara);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.EditPriceParaFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public boolean delPricePara(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return false;
            }
            return priceParaMapper.delPricePara(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.DelPriceParaFailed);
        }
    }

    @Override
    public List<PricePara> listAll() throws SSException {
        try {
            return priceParaMapper.listAll();
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.ListAllPriceParaFailed);
        }
    }
}
