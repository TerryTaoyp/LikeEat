package com.pandawork.eat.service.purchase.impl;

import com.pandawork.eat.mapper.purchase.SupplierMapper;
import com.pandawork.eat.service.purchase.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "supplierService")
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    SupplierMapper supplierMapper;
}
