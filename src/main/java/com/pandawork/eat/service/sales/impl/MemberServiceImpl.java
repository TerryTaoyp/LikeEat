package com.pandawork.eat.service.sales.impl;

import com.pandawork.eat.mapper.sales.MemberMapper;
import com.pandawork.eat.service.sales.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "memberService")
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberMapper memberMapper;
}
