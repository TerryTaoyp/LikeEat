package com.pandawork.eat.mapper.query;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.query.OutStorage;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface OutStorageMapper {
    /**
     * 新增出库
     * @param outStorage
     * @throws SSException
     */
    public void addOutStorage(@Param("outStorage")OutStorage outStorage)throws SSException;

    /**
     * 根据ID删除出库
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delOutStorage(@Param("id")int id)throws SSException;

    /**
     * 编辑出库信息
     * @param outStorage
     * @throws SSException
     */
    public void editOutStorage(@Param("outStorage")OutStorage outStorage)throws SSException;
}
