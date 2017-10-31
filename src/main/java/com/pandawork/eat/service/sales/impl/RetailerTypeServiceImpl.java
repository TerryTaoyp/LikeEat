package com.pandawork.eat.service.sales.impl;

import com.pandawork.eat.mapper.sales.RetailerTypeMapper;
import com.pandawork.eat.service.sales.RetailerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "retailerTypeService")
public class RetailerTypeServiceImpl implements RetailerTypeService {
    @Autowired
    RetailerTypeMapper retailerTypeMapper;
}
