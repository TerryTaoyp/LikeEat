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
    QueryRoleByIDFailed("根据ID查询角色失败",1012),

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
    QueryGoodsTypeByIdFailed("根据ID查找商品类型失败",1119),
    ListAllGoodsPriceFailed("列出所有的商品价格失败",1120),
    QueryGoodsPriceByIdFailed("根据ID查找商品价格信息失败",1121),
    QueryGoodsPriceParaByIdFailed("根据ID查找价格参数失败",1122),


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
    ListAllPurchaseOrderFailed("列出所有的采购订单失败",1212),
    //销售管理
    AddAgentTypeFailed("新增代理商类别失败",1301),
    DelAgentTypeFailed("删除代理商类别失败",1302),
    EditAgentTypeFailed("编辑代理商类别失败",1303),
    ListAllAgentType("列出所有的代理商类别失败",1304),

    AddCustomerFailed("新增客户失败",1305),
    DelCustomerFailed("删除客户失败",1306),
    EditCustomerFailed("编辑客户信息失败",1307),
    ListAllCustomerFailed("列出所有的客户信息",1308),

    AddCustomerTypeFailed("新增客户类型失败",1309),
    DelCustomerTypeFailed("删除客户类型失败",1310),
    EditCustomerTypeFailed("编辑客户类型失败",1311),
    ListAllCustomerTypeFailed("列出所有的客户类型失败",1312),

    AddMemberFailed("新增会员失败",1313),
    DelMemberFailed("删除会员失败",1314),
    EditMemberFailed("编辑会员信息失败",1315),
    ListAllMemberFailed("列出所有的会员信息失败",1316),

    AddMemberTypeFailed("新增会员类型失败",1317),
    DelMemberTypeFailed("删除会员类型失败",1318),
    EditMemberTypeFailed("编辑会员类型失败",1319),
    ListAllMemberTypeFailed("罗列会员类型失败",1320),

    AddRetailerTypeFailed("新增供销商类别失败",1321),
    DelRetailerTypeFailed("删除供销商类别失败",1322),
    EditRetailerTypeFailed("编辑供销商类别失败",1323),
    ListAllRetailerTypeFailed("罗列供销商类别失败",1324),
    AddSalesOrderFailed("新增销售订单失败",1325),
    DelSalesOrderFailed("删除销售订单失败",1326),
    EditSalesOrderFailed("编辑销售订单信息失败",1327),

    //查询管理
    AddInStorageFailed("新增入库信息失败",1401),
    DelInStorageFailed("删除入库信息失败",1402),
    EditInStorageFailed("编辑入库信息失败",1403),

    AddOutStorageFailed("新增出库信息失败",1404),
    DelOutStorageFailed("删除出库信息失败",1405),
    EditOutStorageFailed("编辑出库信息失败",1406),

    AddStockFailed("进入库存失败",1407),
    DelStockFailed("删除某条库存信息失败",1408),
    EditStockFailed("编辑库存信息失败",1409)


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
