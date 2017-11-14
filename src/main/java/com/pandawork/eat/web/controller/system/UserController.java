package com.pandawork.eat.web.controller.system;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.system.Role;
import com.pandawork.eat.common.entity.system.User;
import com.pandawork.eat.service.system.RoleService;
import com.pandawork.eat.service.system.UserService;
import com.pandawork.eat.web.controller.AbstractController;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/11/12.
 */
@Controller
@RequestMapping("/user")
public class UserController extends AbstractController{
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;

    /**
     * 列表页面
     * @param model
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Model model)throws SSException{
        List<User> userList = userService.listAll();
        List<Role> roleList = roleService.listAll();
        model.addAttribute("userList",userList);
        model.addAttribute("roleList",roleList);
        return "system/user";
    }

    /**
     * 新增用户
     * @param username
     * @param realName
     * @param idCard
     * @param phone
     * @param roleId
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public JSONObject addUser(@RequestParam("username")String username,@RequestParam("realName")String realName,
                          @RequestParam("idCard")String idCard,@RequestParam("phone")String phone,@RequestParam("roleId")int roleId)throws SSException{
        User user = new User();
        user.setUsername(username);
        user.setIdCard(idCard);
        user.setPhone(phone);
        user.setRealName(realName);
        user.setRoleId(roleId);
        user.setPassword("123456");
        userService.insertUser(user);
        return sendJsonObject(1);
    }

    /**
     * 跳转到编辑页面
     * @param id
     * @param model
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/to/edit/{id}",method = RequestMethod.GET)
    public String toEdit(@PathVariable("id") int id,Model model)throws SSException{
        User user = userService.queryById(id);
        model.addAttribute("user",user);
        return "system/edit/editUser";
    }

    /**
     * 更新用户信息
     * @param id
     * @param username
     * @param realName
     * @param idCard
     * @param phone
     * @param roleId
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public JSONObject edit(@RequestParam("id")int id,@RequestParam("username")String username,@RequestParam("realName")String realName,
                       @RequestParam("idCard")String idCard,@RequestParam("phone")String phone,@RequestParam("roleId")int roleId)throws SSException{
        User user = userService.queryById(id);
        if(user==null){
            return sendJsonObject(0);
        }else {
            user.setUsername(username);
            user.setIdCard(idCard);
            user.setPhone(phone);
            user.setRealName(realName);
            user.setRoleId(roleId);
            userService.updateUser(user);
            return sendJsonObject(1);
        }

    }

    /**
     * 删除用户
     * @param id
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/del",method = RequestMethod.POST)
    public JSONObject del(@RequestParam("id") int id)throws SSException{
        if (Assert.isNotNull(id)){
            userService.delUser(id);
            return sendJsonObject(1);
        }else {
            return sendJsonObject(0);
        }
    }

}
