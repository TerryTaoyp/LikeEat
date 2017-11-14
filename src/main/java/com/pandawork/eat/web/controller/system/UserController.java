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
     * @param user
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addUser(@RequestParam("user") User user)throws SSException{
        try {
            if (user!=null){
                userService.insertUser(user);
            }
            return "redirect:/user/list";
        }catch (Exception e){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    /**
     * 跳转到编辑页面
     * @param id
     * @param model
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/to/edit",method = RequestMethod.GET)
    public String toEdit(@PathVariable("id") int id,Model model)throws SSException{
        User user = userService.queryById(id);
        model.addAttribute("user",user);
        return "system/edit/editUser";
    }

    /**
     * 更新用户信息
     * @param user
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public String edit(@RequestParam("user") User user)throws SSException{

        try {
            if (Assert.isNull(user)){
                return null;
            }
            userService.updatePassword(user);
            return "redirect:/user/list";
        }catch (Exception e){
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    /**
     * 删除用户
     * @param id
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/del",method = RequestMethod.GET)
    public JSONObject del(@PathVariable("id") int id)throws SSException{
        if (Assert.isNotNull(id)){
            userService.delUser(id);
            return sendJsonObject(1);
        }else {
            return sendJsonObject(0);
        }
    }

}
