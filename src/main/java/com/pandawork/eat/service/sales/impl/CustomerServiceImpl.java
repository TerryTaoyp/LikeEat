package com.pandawork.eat.service.sales.impl;

import com.pandawork.eat.mapper.sales.CustomerMapper;
import com.pandawork.eat.service.sales.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;
}
