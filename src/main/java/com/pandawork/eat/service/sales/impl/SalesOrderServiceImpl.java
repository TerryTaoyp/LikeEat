package com.pandawork.eat.service.sales.impl;

import com.pandawork.eat.mapper.sales.SalesOrderMapper;
import com.pandawork.eat.service.sales.SalesOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "salesOrderService")
public class SalesOrderServiceImpl implements SalesOrderService {
    @Autowired
    SalesOrderMapper salesOrderMapper;
}
