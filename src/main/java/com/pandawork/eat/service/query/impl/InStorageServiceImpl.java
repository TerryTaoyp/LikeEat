package com.pandawork.eat.service.query.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.query.InStorage;
import com.pandawork.eat.common.exception.EatException;
import com.pandawork.eat.mapper.query.InStorageMapper;
import com.pandawork.eat.service.query.InStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "inStorageService")
public class InStorageServiceImpl implements InStorageService {
    @Autowired
    InStorageMapper inStorageMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void addInStorage(InStorage inStorage) throws SSException {
        try {
            if (Assert.isNull(inStorage)){
                return;
            }
            inStorageMapper.addInStorage(inStorage);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.AddInStorageFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public boolean delInStorage(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return false;
            }
            return inStorageMapper.delInStorage(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.DelInStorageFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void editInStorage(InStorage inStorage) throws SSException {
        try {
            if (Assert.isNull(inStorage)){
                return;
            }
            inStorageMapper.editInStorage(inStorage);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.EditInStorageFailed);
        }
    }
}
