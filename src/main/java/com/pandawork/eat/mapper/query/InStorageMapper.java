package com.pandawork.eat.mapper.query;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.query.InStorage;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface InStorageMapper {
    /**
     * 新增入库
     * @param inStorage
     * @throws SSException
     */
    public void addInStorage(@Param("inStorage")InStorage inStorage)throws SSException;

    /**
     * 删除
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delInStorage(@Param("id")int id)throws SSException;

    /**
     * 编辑入库信息
     * @param inStorage
     * @throws SSException
     */
    public void editInStorage(@Param("inStorage")InStorage inStorage)throws SSException;
}
