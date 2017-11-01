package com.pandawork.eat.service.purchase;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.purchase.Supplier;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface SupplierService {
    /**
     * 新增供货商
     * @param supplier
     * @throws SSException
     */
    public void addSupplier(Supplier supplier)throws SSException;

    /**
     * 编辑供货商信息
     * @param supplier
     * @throws SSException
     */
    public void editSupplier(Supplier supplier)throws SSException;

    /**
     * 删除供货商信息
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delSupplier(int id)throws SSException;

    /**
     * 列出所有
     * @return
     * @throws SSException
     */
    public List<Supplier> listAll()throws SSException;
}
