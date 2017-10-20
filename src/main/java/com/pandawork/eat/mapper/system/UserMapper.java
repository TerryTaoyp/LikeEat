package com.pandawork.eat.mapper.system;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.system.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Taoyongpan on 2017/10/20.
 */
public interface UserMapper {

    /**
     * 新增系统用户
     * @param user
     * @throws SSException
     */
    public void insertUser(@Param("user") User user)throws SSException;

    /**
     * 编辑系统用户信息
     * @param user
     * @throws SSException
     */
    public void updateUser(@Param("user") User user)throws SSException;

    /**
     * 修改用户密码
     * @param user
     * @throws SSException
     */
    public void updatePassword(@Param("user") User user)throws SSException;

    /**
     * 根据ID删除系统用户
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delUser(@Param("id") int id)throws SSException;

    /**
     * 根据名字查找
     * @param username
     * @return
     * @throws SSException
     */
    public User queryByUsername(@Param("username") String username)throws SSException;

    /**
     * 根据角色ID查找用户
     * @param roleId
     * @return
     * @throws SSException
     */
    public User queryByRoleId(@Param("roleId") int roleId)throws SSException;

    /**
     * 根据ID查询
     * @param id
     * @return
     * @throws SSException
     */
    public User queryById(@Param("id") int id)throws SSException;
}
