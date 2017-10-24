package com.pandawork.eat.service.system.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.system.Power;
import com.pandawork.eat.mapper.system.PowerMapper;
import com.pandawork.eat.service.system.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/24.
 */
@Service(value = "powerService")
public class PowerServiceImpl implements PowerService {
    @Autowired
    PowerMapper powerMapper;
    @Override
    public List<Power> listAll() throws SSException {
        return powerMapper.listAll();
    }
}
