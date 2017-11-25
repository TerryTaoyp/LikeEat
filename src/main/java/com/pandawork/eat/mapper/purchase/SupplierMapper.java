package com.pandawork.eat.mapper.purchase;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.purchase.Supplier;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface SupplierMapper {

    /**
     * 新增供货商
     * @param supplier
     * @throws SSException
     */
    public void addSupplier(@Param("supplier") Supplier supplier)throws SSException;

    /**
     * 编辑供货商信息
     * @param supplier
     * @throws SSException
     */
    public void editSupplier(@Param("supplier") Supplier supplier)throws SSException;

    /**
     * 删除供货商信息
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delSupplier(@Param("id") int id)throws SSException;

    /**
     * 列出所有
     * @return
     * @throws SSException
     */
    public List<Supplier> listAll()throws SSException;

    /**
     * 根据ID查找供货商
     * @param id
     * @return
     * @throws SSException
     */
    public Supplier queryById(@Param("id") int id)throws SSException;
}
