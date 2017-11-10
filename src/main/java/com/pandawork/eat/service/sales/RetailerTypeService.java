package com.pandawork.eat.service.sales;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.common.entity.sales.RetailerType;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
public interface RetailerTypeService {
    /**
     * 新增供销商类别
     * @param retailerType
     * @throws SSException
     */
    public void addRetailerType(RetailerType retailerType)throws SSException;

    /**
     * 删除供销商类别
     * @param id
     * @return
     * @throws SSException
     */
    public boolean delRetailerType(int id)throws SSException;

    /**
     * 编辑供销商类别信息
     * @param retailerType
     * @throws SSException
     */
    public void editRetailerType(RetailerType retailerType)throws SSException;

    /**
     * 罗列供销商类别信息
     * @return
     * @throws SSException
     */
    public List<RetailerType> listAll()throws SSException;
}
