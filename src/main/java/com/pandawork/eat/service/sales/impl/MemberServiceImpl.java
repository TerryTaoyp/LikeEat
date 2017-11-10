package com.pandawork.eat.service.sales.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.sales.Member;
import com.pandawork.eat.common.exception.EatException;
import com.pandawork.eat.mapper.sales.MemberMapper;
import com.pandawork.eat.service.sales.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "memberService")
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberMapper memberMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void addMember(Member member) throws SSException {
        try {
            if (Assert.isNull(member)){
                return;
            }
            memberMapper.addMember(member);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.AddMemberFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public boolean delMember(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return false;
            }
            return memberMapper.delMember(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.DelMemberFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void editMember(Member member) throws SSException {
        try {
            if (Assert.isNull(member)){
                return;
            }
            memberMapper.editMember(member);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.EditMemberFailed);
        }
    }

    @Override
    public List<Member> listAll() throws SSException {
        try {
            return memberMapper.listAll();
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.ListAllMemberFailed);
        }
    }
}
