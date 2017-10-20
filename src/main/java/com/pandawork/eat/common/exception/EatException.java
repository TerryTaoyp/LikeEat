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
    QueryUserByIdFailed("根据用户ID查找失败",1007)

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
