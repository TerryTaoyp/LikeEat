package com.pandawork.eat.mapper.sales;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.sales.Member;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface MemberMapper {
    /**
     * 新增会员
     * @param member
     * @throws SSException
     */
    public void addMember(@Param("member")Member member)throws SSException;

    /**
     * 删除会员
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delMember(@Param("id")int id)throws SSException;

    /**
     * 编辑会员信息
     * @param member
     * @throws SSException
     */
    public void editMember(@Param("member")Member member)throws SSException;

    /**
     * 列出所有的会员
     * @return
     * @throws SSException
     */
    public List<Member> listAll()throws SSException;
}
