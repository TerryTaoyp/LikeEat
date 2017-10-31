package com.pandawork.eat.service.purchase.impl;

import com.pandawork.eat.mapper.purchase.SupplierTypeMapper;
import com.pandawork.eat.service.purchase.SupplierTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "supplierTypeService")
public class SupplierTypeServiceImpl implements SupplierTypeService {

    @Autowired
    SupplierTypeMapper supplierTypeMapper;
}
