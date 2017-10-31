package com.pandawork.eat.service.query.impl;

import com.pandawork.eat.mapper.query.StockMapper;
import com.pandawork.eat.service.query.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "stockService")
public class StockServiceImpl implements StockService {
    @Autowired
    StockMapper stockMapper;
}
