package com.pandawork.eat.common.exception;

import com.pandawork.core.common.exception.IBizExceptionMes;

/**
 * Created by Taoyongpan on 2017/8/12.
 */
public enum EatException implements IBizExceptionMes{
    //系统管理
    InsertUserFailed("新增用户失败",1001),
    UpdateUserFailed("更新用户失败",1002),
    UpdatePasswordFailed("更新用户密码失败",1003),
    DelUserFailed("删除用户失败",1004),
    QueryUserByUsernameFailed("根据用户名查找失败",1005),
    QueryUserByRoleIdFailed("根据角色ID查找用户失败",1006),
    QueryUserByIdFailed("根据用户ID查找失败",1007),
    AddRoleFailed("添加角色失败",1008),
    UpdateRoleFailed("更新角色信息失败",1009),
    DelRoleFailed("删除角色信息失败",1010),
    ListAllRoleFailed("列出所有的角色",1011),

    //商品管理
    AddGoodsFailed("新增商品失败",1101),
    UpdateGoodsFailed("编辑商品信息失败",1102),
    DelGoodsFailed("删除商品信息失败",1103),
    QueryGoodsByIdFailed("根据ID查找商品信息失败",1104),
    ListAllGoodsFailed("列出所有的商品失败",1105),
    QueryGoodsByTypeFailed("根据商品类型查找",1106),
    QueryGoodsByNameFailed("根据商品名字查找失败",1107),
    AddGoodsPriceFailed("新增商品信息",1108),
    UpdateGoodsPriceFailed("编辑商品信息失败",1109),
    DelGoodsPriceFailed("删除商品信息失败",1110),
    AddGoodsTypeFailed("新增商品类别失败",1111),
    EditGoodsTypeFailed("编辑商品类别失败",1112),
    DelGoodsTypeFailed("删除商品类别失败",1113),
    ListAllGoodsType("列出所有的商品类别失败",1114),
    AddPriceParaFailed("新增价格参数失败",1115),
    EditPriceParaFailed("编辑价格参数失败",1116),
    DelPriceParaFailed("删除价格参数失败",1117),
    ListAllPriceParaFailed("列出所有的价格参数失败",1118),


    //供货商管理
    AddSupplierFailed("新增供货商信息失败",1201),
    EditSupplierFailed("编辑供货商信息失败",1202),
    DelSupplierFailed("删除供货商信息失败",1203),
    ListSupplierFailed("列出所有供货商失败",1204),
    AddSupplierTypeFailed("新增供货商类别失败",1205),
    EditSupplierTypeFailed("编辑供货商类别信息失败",1206),
    DelSupplierTypeFailed("删除供货商类别失败",1207),
    ListAllSupplierTypeFailed("列出所有的供货商类别失败",1208),
    AddPurchaseOrderFailed("新增采购订单失败",1209),
    EditPurchaseOrderFailed("编辑采购订单信息失败",1210),
    DelPurchaseOrderFailed("删除采购订单失败",1211),
    ListAllPurchaseOrderFailed("列出所有的采购订单失败",1212)
    //销售管理
    //查询管理


    ;
    private String mes;
    private int code;

    EatException(String mes, int code) {
        this.mes = mes;
        this.code = code;
    }

    @Override
    public String getMes() {
        return mes;
    }

    @Override
    public int getCode() {
        //return Integer.parseInt(SMSEXCPTIONCODE + "" + code);
        return code;
    }

}
