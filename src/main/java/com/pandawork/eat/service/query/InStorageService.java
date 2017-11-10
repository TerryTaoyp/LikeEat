package com.pandawork.eat.service.query;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.query.InStorage;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface InStorageService {
    /**
     * 新增入库
     * @param inStorage
     * @throws SSException
     */
    public void addInStorage(InStorage inStorage)throws SSException;

    /**
     * 删除
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delInStorage(int id)throws SSException;

    /**
     * 编辑入库信息
     * @param inStorage
     * @throws SSException
     */
    public void editInStorage(InStorage inStorage)throws SSException;
}
