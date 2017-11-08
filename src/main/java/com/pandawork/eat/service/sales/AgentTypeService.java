package com.pandawork.eat.service.sales;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.sales.AgentType;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface AgentTypeService {

    /**
     * 新增代理商类别
     * @param agentType
     */
    public void addAgentType(AgentType agentType)throws SSException;

    /**
     * 删除代理商类别
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delAgentType(int id)throws SSException;

    /**
     * 编辑代理商类别信息
     * @param agentType
     * @throws SSException
     */
    public void editAgentType(AgentType agentType)throws SSException;

    /**
     * 列出所有的代理商类别
     * @return
     * @throws SSException
     */
    public List<AgentType> listAll()throws SSException;
}
