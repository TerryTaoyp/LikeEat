package com.pandawork.eat.mapper.system;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.system.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/24.
 */
public interface RoleMapper {
    /**
     * 新增角色
     * @param role
     * @throws SSException
     */
    public void addRole(@Param("role") Role role)throws SSException;

    /**
     * 编辑角色信息
     * @param role
     * @throws SSException
     */
    public void updateRole(@Param("role") Role role)throws SSException;

    /**
     * 根据ID删除角色
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delRole(@Param("id") int id)throws SSException;

    /**
     * 列出所有的角色
     * @return
     * @throws SSException
     */
    public List<Role> listAll()throws SSException;
}
