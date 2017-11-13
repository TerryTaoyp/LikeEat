package com.pandawork.eat.web.controller.system;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.system.User;
import com.pandawork.eat.service.system.UserService;
import com.pandawork.eat.web.controller.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by Taoyongpan on 2017/11/11.
 */
@Controller
@RequestMapping(value = "")
public class LoginController extends AbstractController {

    @Autowired
    UserService userService;

    /**
     * 跳转到用户登录页面
     * @return
     */
    @RequestMapping(value = "/to/login",method = RequestMethod.GET)
    public String toLogin(){
        return "login";
    }

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(HttpSession session,@RequestParam("username") String username, @RequestParam("password") String password, Model model) throws SSException {
        User user = userService.queryByUsername(username);

        if (user!=null){
            if (user.getPassword().equals(password)){
                session.setAttribute("username",username);
                return "index";
            }else {
                model.addAttribute("msg","用户名或密码错误");
                return "login";
            }
        }else {
            model.addAttribute("msg","用户名或密码错误");
            return "login";
        }
    }

    /**
     * 退出登录
     * @return
     */
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.removeAttribute("username");
        return "login";
    }
}
