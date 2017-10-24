package com.pandawork.eat.service.system.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.system.Role;
import com.pandawork.eat.common.exception.EatException;
import com.pandawork.eat.mapper.system.RoleMapper;
import com.pandawork.eat.service.system.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/24.
 */
@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void addRole(Role role) throws SSException {
        try {
            if (Assert.isNull(role)){
                return;
            }
            roleMapper.addRole(role);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.AddRoleFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public void updateRole(Role role) throws SSException {
        try {
            if (Assert.isNull(role)){
                return;
            }
            roleMapper.updateRole(role);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.UpdateRoleFailed);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class,Exception.class, RuntimeException.class})
    public boolean delRole(int id) throws SSException {
        try {
            if (Assert.isNull(id)){
                return false;
            }
            return roleMapper.delRole(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.DelRoleFailed);
        }
    }

    @Override
    public List<Role> listAll() throws SSException {
        try {
            return roleMapper.listAll();
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(EatException.ListAllRoleFailed);
        }

    }
}
