package com.pandawork.eat.service.query.impl;

import com.pandawork.eat.mapper.query.OutStorageMapper;
import com.pandawork.eat.service.query.OutStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "outStorageService")
public class OutStorageServiceImpl implements OutStorageService {
    @Autowired
    OutStorageMapper outStorageMapper;
}
