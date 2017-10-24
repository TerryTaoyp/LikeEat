package com.pandawork.eat.system;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.AbstractTestCase;
import com.pandawork.eat.common.entity.system.User;
import com.pandawork.eat.service.system.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Taoyongpan on 2017/10/20.
 */
public class UserServiceTest extends AbstractTestCase {
    @Autowired
    UserService userService;

    /**
     * 新增测试
     * @throws SSException
     */
    @Test
    public void addTest()throws SSException{
        User user = new User();
        user.setUsername("taoyongpan1");
        user.setRealName("陶永攀");
        user.setPassword("123456");
        user.setIdCard("123123456789");
        user.setPhone("17684373801");
        user.setRoleId(1);
        userService.insertUser(user);
    }

    /**
     * 编辑用户信息
     * @throws SSException
     */
    @Test
    public void updateTest() throws SSException {
        User user = new User();
        user.setId(1);
        user.setRealName("陶永攀");
        user.setPassword("12345678");
        user.setIdCard("123123456789");
        user.setPhone("17684373801");
        user.setRoleId(1);
        userService.updateUser(user);
    }

    /**
     * 更新用户密码
     * @throws SSException
     */
    @Test
    public void updatePasswordTest()throws SSException{
        User user = new User();
        user.setId(1);
        user.setPassword("12345678");
        userService.updatePassword(user);
    }

    /**
     * 删除测试
     * @throws SSException
     */
    @Test
    public void delTest()throws SSException{
        userService.delUser(2);
    }

    /**
     * 根据用户名查询
     * @throws SSException
     */
    @Test
    public void queryByUsername()throws SSException{
        userService.queryByUsername("taoyongpan");
    }

    /**
     * 根据角色ID查找
     * @throws SSException
     */
    @Test
    public void queryByRoleId()throws SSException{
        userService.queryByRoleId(1);
    }

    /**
     * 根据用户ID查询
     * @throws SSException
     */
    @Test
    public void queryById()throws SSException{
        userService.queryById(1);
    }

    /**
     * 列出所有的用户
     * @throws SSException
     */
    @Test
    public void listAllTest()throws SSException{
        userService.listAll();
    }
}
