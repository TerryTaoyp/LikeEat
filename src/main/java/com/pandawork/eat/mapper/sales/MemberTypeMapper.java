package com.pandawork.eat.mapper.sales;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.sales.MemberType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface MemberTypeMapper {
    /**
     * 新增会员类型
     * @param memberType
     * @throws SSException
     */
    public void addMemberType(@Param("memberType")MemberType memberType)throws SSException;

    /**
     * 删除会员类型
     * @param id
     * @throws SSException
     */
    public boolean delMemberType(@Param("id")int id)throws SSException;

    /**
     * 编辑会员类型信息
     * @param memberType
     * @throws SSException
     */
    public void editMemberType(@Param("memberType")MemberType memberType)throws SSException;

    /**
     * 列出所有的会员类型信息
     * @throws SSException
     */
    public List<MemberType> listAll()throws SSException;

}
