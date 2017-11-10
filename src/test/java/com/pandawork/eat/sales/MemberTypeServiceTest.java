package com.pandawork.eat.sales;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.AbstractTestCase;
import com.pandawork.eat.common.entity.sales.MemberType;
import com.pandawork.eat.service.sales.MemberTypeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public class MemberTypeServiceTest extends AbstractTestCase {
    @Autowired
    MemberTypeService memberTypeService;

    /**
     * 新增测试
     * @throws SSException
     */
    @Test
    public void addTest()throws SSException{
        MemberType memberType = new MemberType();
        memberType.setName("test");
        memberType.setRemark("hahaha");
        memberTypeService.addMemberType(memberType);
    }


    /**
     * 删除测试
     * @throws SSException
     */
    @Test
    public void delTest()throws SSException{
        memberTypeService.delMemberType(2);
    }

    /**
     * 编辑测试
     * @throws SSException
     */
    @Test
    public void editTest()throws SSException{
        MemberType memberType = new MemberType();
        memberType.setId(1);
        memberType.setName("ha");
        memberType.setRemark("hrh");
        memberTypeService.editMemberType(memberType);
    }

    /**
     * 罗列测试
     * @throws SSException
     */
    @Test
    public void listAllTest()throws SSException{
        memberTypeService.listAll();
    }
}
