package com.pandawork.eat.web.controller.system;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.system.Role;
import com.pandawork.eat.service.system.RoleService;
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

    /**
     * 跳转到修改页面
     * @param id
     * @return
     */
    @RequestMapping(value = "/to/edit/{id}",method = RequestMethod.GET)
    public String toEdit(@PathVariable("id") int id,Model model) throws SSException {
        Role role = roleService.queryById(id);

        model.addAttribute("role",role);
        return "system/edit/editRole";
    }

    /**
     * 编辑角色信息
     * @param id
     * @param role
     * @param power
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public JSONObject edit(@RequestParam("id") int id,@RequestParam("role") String role, @RequestParam("power") int power)throws SSException{
        Role role1 = roleService.queryById(id);
        if (role1==null){
            return sendJsonObject(0);
        }else {
            role1.setRole(role);
            role1.setPowerId(power);
            roleService.updateRole(role1);
            return sendJsonObject(1);
        }
    }

    /**
     * 新增角色
     * @param role
     * @param power
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public JSONObject addRole(@RequestParam("role") String role,@RequestParam("power") int power) throws SSException {
        Role role1 = new Role();
        role1.setRole(role);
        role1.setPowerId(power);
        roleService.addRole(role1);
        return sendJsonObject(1);
    }

    /**
     * 删除角色,成功返回1，失败返回0
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/del",method = RequestMethod.POST)
    public JSONObject delRole(@RequestParam("id") int id) throws SSException {
        if (Assert.isNotNull(id)){
            roleService.delRole(id);
            return sendJsonObject(1);
        }else {
            return sendJsonObject(0);
        }

    }
}
