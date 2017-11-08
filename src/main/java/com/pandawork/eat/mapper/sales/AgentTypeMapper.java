package com.pandawork.eat.mapper.sales;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.sales.AgentType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface AgentTypeMapper {
    /**
     * 新增代理商类别
     * @param agentType
     */
    public void addAgentType(@Param("agentType")AgentType agentType)throws SSException;

    /**
     * 删除代理商类别
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delAgentType(@Param("id")int id)throws SSException;

    /**
     * 编辑代理商类别信息
     * @param agentType
     * @throws SSException
     */
    public void editAgentType(@Param("agentType")AgentType agentType)throws SSException;

    /**
     * 列出所有的代理商类别
     * @return
     * @throws SSException
     */
    public List<AgentType> listAll()throws SSException;
}
