package com.pandawork.eat.service.system;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.system.User;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/20.
 */
public interface UserService {

    /**
     * 新增系统用户
     * @throws SSException
     */
    public void insertUser(User user)throws SSException;

    /**
     * 编辑系统用户信息
     * @throws SSException
     */
    public void updateUser(User user)throws SSException;

    /**
     * 修改用户密码
     * @throws SSException
     */
    public void updatePassword(User user)throws SSException;

    /**
     * 根据ID删除系统用户
     * @return
     * @throws SSException
     */
    public boolean delUser(int id)throws SSException;

    /**
     * 根据名字查找
     * @return
     * @throws SSException
     */
    public User queryByUsername(String username)throws SSException;

    /**
     * 根据角色ID查找用户
     * @return
     * @throws SSException
     */
    public List<User> queryByRoleId(int roleId)throws SSException;

    /**
     * 根据ID查询
     * @return
     * @throws SSException
     */
    public User queryById(int id)throws SSException;

    /**
     * 列出所有的用户
     * @return
     * @throws SSException
     */
    public List<User> listAll()throws SSException;
}
