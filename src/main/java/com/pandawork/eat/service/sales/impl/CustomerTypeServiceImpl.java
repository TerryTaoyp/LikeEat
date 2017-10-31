package com.pandawork.eat.service.sales.impl;

import com.pandawork.eat.mapper.sales.CustomerTypeMapper;
import com.pandawork.eat.service.sales.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "customerTypeService")
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    CustomerTypeMapper customerTypeMapper;
}
