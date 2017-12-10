package com.pandawork.eat.web.controller.sales;

import com.pandawork.eat.service.sales.MemberService;
import com.pandawork.eat.service.sales.MemberTypeService;
import com.pandawork.eat.web.controller.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Taoyongpan on 2017/12/10.
 */
@Controller
@RequestMapping("/member")
public class MemberController extends AbstractController {
    @Autowired
    MemberService memberService;
    @Autowired
    MemberTypeService memberTypeService;
}
