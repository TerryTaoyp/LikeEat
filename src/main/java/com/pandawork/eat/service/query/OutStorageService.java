package com.pandawork.eat.service.query;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.query.OutStorage;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface OutStorageService {

    /**
     * 新增出库
     * @param outStorage
     * @throws SSException
     */
    public void addOutStorage(OutStorage outStorage)throws SSException;

    /**
     * 根据ID删除出库
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delOutStorage(int id)throws SSException;

    /**
     * 编辑出库信息
     * @param outStorage
     * @throws SSException
     */
    public void editOutStorage(OutStorage outStorage)throws SSException;
}
