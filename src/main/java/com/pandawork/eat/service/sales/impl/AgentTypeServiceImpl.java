package com.pandawork.eat.service.sales.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.sales.AgentType;
import com.pandawork.eat.common.exception.EatException;
import com.pandawork.eat.mapper.sales.AgentTypeMapper;
import com.pandawork.eat.service.sales.AgentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "agentTypeService")
public class AgentTypeServiceImpl implements AgentTypeService {
    @Autowired
    AgentTypeMapper agentTypeMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void addAgentType(AgentType agentType) throws SSException {
        try {
            if (Assert.isNull(agentType)){
                return;
            }
            agentTypeMapper.addAgentType(agentType);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.AddAgentTypeFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public boolean delAgentType(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return false;
            }
            return agentTypeMapper.delAgentType(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.DelAgentTypeFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void editAgentType(AgentType agentType) throws SSException {
        try {
            if (Assert.isNull(agentType)){
                return;
            }
            agentTypeMapper.editAgentType(agentType);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.EditAgentTypeFailed);
        }
    }

    @Override
    public List<AgentType> listAll() throws SSException {
        try {
            return agentTypeMapper.listAll();
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.ListAllAgentType);
        }
    }
}
