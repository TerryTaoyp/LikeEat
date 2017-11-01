package com.pandawork.eat.service.purchase;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.purchase.SupplierType;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface SupplierTypeService {
    /**
     * 新增供货商类别
     * @param supplierType
     * @throws SSException
     */
    public void addSupplierType(SupplierType supplierType)throws SSException;

    /**
     * 编辑供货商类别
     * @param supplierType
     * @throws SSException
     */
    public void editSupplierType(SupplierType supplierType)throws SSException;

    /**
     * 删除 供货商类别
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delSupplierType(int id)throws SSException;

    /**
     * 列出所有的供货商类别
     * @return
     * @throws SSException
     */
    public List<SupplierType> listAll()throws SSException;
}
