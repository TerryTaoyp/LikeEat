package com.pandawork.eat.sales;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.AbstractTestCase;
import com.pandawork.eat.common.entity.sales.Member;
import com.pandawork.eat.service.sales.MemberService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public class MemberServiceTest extends AbstractTestCase {
    @Autowired
    MemberService memberService;

    /**
     * 新增测试
     * @throws SSException
     */
    @Test
    public void addTest()throws SSException{
        Member member = new Member();
        member.setBirthday("fghjkl");
        member.setCardData("323");
        member.setCardNumber(12);
        member.setIdNumber("q123");
        member.setmName("hahah");
        member.setPhone("3456789");
        member.setPoints(2.2);
        member.setTypeId(1);
        member.setSex("nan");
        memberService.addMember(member);
    }

    /**
     * 删除测试
     * @throws SSException
     */
    @Test
    public void delTest()throws SSException{
        memberService.delMember(1);
    }

    /**
     * 编辑 测试
     * @throws SSException
     */
    @Test
    public void editTest()throws SSException{
        Member member = new Member();
        member.setId(2);
        member.setBirthday("fghjkl");
        member.setCardData("323");
        member.setCardNumber(12);
        member.setIdNumber("q123");
        member.setmName("hahah");
        member.setPhone("3456789");
        member.setPoints(2.2);
        member.setTypeId(1);
        member.setSex("nan");
        memberService.editMember(member);
    }

    /**
     * 罗列测试
     * @throws SSException
     */
    @Test
    public void listAllTest()throws SSException{
        memberService.listAll();
    }
}
