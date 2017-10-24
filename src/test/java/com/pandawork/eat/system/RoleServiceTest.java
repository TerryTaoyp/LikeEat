package com.pandawork.eat.system;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.AbstractTestCase;
import com.pandawork.eat.common.entity.system.Role;
import com.pandawork.eat.service.system.RoleService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Created by Taoyongpan on 2017/10/24.
 */
public class RoleServiceTest extends AbstractTestCase {
    @Autowired
    RoleService roleService;

    /**
     * 添加角色
     * @throws SSException
     */
    @Test
    public void addRole()throws SSException{
        Role role = new Role();
        role.setRole("超级管理员");
        role.setPowerId(1);
        roleService.addRole(role);
    }

    /**
     * 编辑角色信息
     * @throws SSException
     */
    @Test
    public void updateRole()throws SSException{
        Role role = new Role();
        role.setId(1);
        role.setRole("管理员");
        role.setPowerId(2);
        roleService.updateRole(role);
    }

    /**
     * 删除测试
     * @throws SSException
     */
    @Test
    public void delRole()throws SSException{
        roleService.delRole(2);
    }

    /**
     * 列出所有的用户
     * @throws SSException
     */
    @Test
    public void listAll()throws SSException{
        roleService.listAll();
    }
}
