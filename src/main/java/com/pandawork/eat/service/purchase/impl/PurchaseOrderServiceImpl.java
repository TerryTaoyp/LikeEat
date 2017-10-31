package com.pandawork.eat.service.purchase.impl;

import com.pandawork.eat.mapper.purchase.PurchaseOrderMapper;
import com.pandawork.eat.service.purchase.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Taoyongpan on 2017/10/31.
 */
@Service(value = "purchaseOrderService")
public class PurchaseOrderServiceImpl implements PurchaseOrderService {
    @Autowired
    PurchaseOrderMapper purchaseOrderMapper;
}
