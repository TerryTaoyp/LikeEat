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
        user.setUsername("taoyongpan");
        user.setRealName("陶永攀");
        user.setPassword("123456");
        user.setIdCard("123123456789");
        user.setPhone("17684373801");
        userService.insertUser(user);
    }
}
