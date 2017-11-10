package com.pandawork.eat.service.sales.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.sales.MemberType;
import com.pandawork.eat.common.exception.EatException;
import com.pandawork.eat.mapper.sales.MemberTypeMapper;
import com.pandawork.eat.service.sales.MemberTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "memberTypeService")
public class MemberTypeServiceImpl implements MemberTypeService {
    @Autowired
    MemberTypeMapper memberTypeMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void addMemberType(MemberType memberType) throws SSException {
        try {
            if (Assert.isNull(memberType)){
                return;
            }
            memberTypeMapper.addMemberType(memberType);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.AddMemberTypeFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public boolean delMemberType(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return false;
            }
            return memberTypeMapper.delMemberType(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.DelMemberTypeFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void editMemberType(MemberType memberType) throws SSException {
        try {
            if (Assert.isNull(memberType)){
                return;
            }
            memberTypeMapper.editMemberType(memberType);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.EditMemberTypeFailed);
        }
    }

    @Override
    public List<MemberType> listAll() throws SSException {
        try {
            return memberTypeMapper.listAll();
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.ListAllMemberTypeFailed);
        }
    }
}
