package com.pandawork.eat.web.controller.system;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.system.Role;
import com.pandawork.eat.service.system.RoleService;
import com.pandawork.eat.web.controller.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/11/12.
 */
@Controller
@RequestMapping("/role")
public class RoleController extends AbstractController {
    @Autowired
    RoleService roleService;

    /**
     * 角色列表页面
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Model model)throws SSException{
        List<Role> roleList = roleService.listAll();
        model.addAttribute("roleList",roleList);
        return "system/role";
    }


}
