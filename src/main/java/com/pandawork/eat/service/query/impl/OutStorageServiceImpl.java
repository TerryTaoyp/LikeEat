package com.pandawork.eat.service.query.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.query.OutStorage;
import com.pandawork.eat.common.exception.EatException;
import com.pandawork.eat.mapper.query.OutStorageMapper;
import com.pandawork.eat.service.query.OutStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "outStorageService")
public class OutStorageServiceImpl implements OutStorageService {
    @Autowired
    OutStorageMapper outStorageMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void addOutStorage(OutStorage outStorage) throws SSException {
        try {
            if (Assert.isNull(outStorage)){
                return;
            }
            outStorageMapper.addOutStorage(outStorage);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.AddOutStorageFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public boolean delOutStorage(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return false;
            }
            return outStorageMapper.delOutStorage(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.DelOutStorageFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void editOutStorage(OutStorage outStorage) throws SSException {
        try {
            if (Assert.isNull(outStorage)){
                return;
            }
            outStorageMapper.editOutStorage(outStorage);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.EditOutStorageFailed);
        }
    }
}
