package com.pandawork.eat.service.sales;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.sales.MemberType;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface MemberTypeService {
    /**
     * 新增会员类型
     * @param memberType
     * @throws SSException
     */
    public void addMemberType(MemberType memberType)throws SSException;

    /**
     * 删除会员类型
     * @param id
     * @throws SSException
     */
    public boolean delMemberType(int id)throws SSException;

    /**
     * 编辑会员类型信息
     * @param memberType
     * @throws SSException
     */
    public void editMemberType(MemberType memberType)throws SSException;

    /**
     * 列出所有的会员类型信息
     * @throws SSException
     */
    public List<MemberType> listAll()throws SSException;
}
