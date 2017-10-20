package com.pandawork.eat.service.system.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.system.User;
import com.pandawork.eat.common.exception.EatException;
import com.pandawork.eat.mapper.system.UserMapper;
import com.pandawork.eat.service.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Taoyongpan on 2017/10/20.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void insertUser(User user) throws SSException {
        try {
            if (Assert.isNull(user)){
                return;
            }
            userMapper.insertUser(user);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.InsertUserFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void updateUser(User user) throws SSException {
        try {
            if (Assert.isNull(user)){
                return;
            }
            userMapper.updateUser(user);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.UpdateUserFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void updatePassword(User user) throws SSException {
        try {
            if (Assert.isNull(user)){
                return;
            }
            userMapper.updatePassword(user);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.UpdatePasswordFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public boolean delUser(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return false;
            }
            return userMapper.delUser(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.DelUserFailed);
        }
    }

    @Override
    public User queryByUsername(String username) throws SSException {
        try {
            if (Assert.isNull(username)){
                return null;
            }
            return userMapper.queryByUsername(username);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.QueryUserByUsernameFailed);
        }
    }

    @Override
    public User queryByRoleId(int roleId) throws SSException {
        try {
            if (Assert.isNull(roleId)){
                return null;
            }
            return userMapper.queryByRoleId(roleId);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.QueryUserByRoleIdFailed);
        }
    }

    @Override
    public User queryById(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return null;
            }
            return userMapper.queryById(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.QueryUserByIdFailed);
        }
    }
}
