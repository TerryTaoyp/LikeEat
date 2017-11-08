package com.pandawork.eat.sales;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.AbstractTestCase;
import com.pandawork.eat.common.entity.sales.AgentType;
import com.pandawork.eat.service.sales.AgentTypeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public class AgentTypeServiceTest extends AbstractTestCase {
    @Autowired
    AgentTypeService agentTypeService;

    /**
     * 新增测试
     * @throws SSException
     */
    @Test
    public void addTest()throws SSException{
        AgentType agentType = new AgentType();
        agentType.setName("2");
        agentType.setRemark("haha");
        agentTypeService.addAgentType(agentType);
    }

    /**
     * 删除测试
     * @throws SSException
     */
    @Test
    public void delTest()throws SSException{
        agentTypeService.delAgentType(1);
    }

    /**
     * 编辑测试
     * @throws SSException
     */
    @Test
    public void editTest()throws SSException{
        AgentType agentType = new AgentType();
        agentType.setName("1");
        agentType.setRemark("h");
        agentType.setId(2);
        agentTypeService.editAgentType(agentType);
    }

    /**
     * 列出所有
     * @throws SSException
     */
    @Test
    public void listAllTest()throws SSException{
        agentTypeService.listAll();
    }
}
