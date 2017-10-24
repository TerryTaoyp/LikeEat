package com.pandawork.eat.service.system;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.system.Power;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/24.
 */
public interface PowerService {
    /**
     * 列出所有的权限
     * @return
     * @throws SSException
     */
    public List<Power> listAll()throws SSException;
}
