<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header>
    <nav class="navbar navbar-default navbar-fixed-top navbar-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-expand-toggle fa-rotate-90">
                    <i class="fa fa-bars icon"></i>
                </button>
                <ol class="breadcrumb navbar-breadcrumb">
                    <li class="active"></li>
                </ol>
                <button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
                    <i class="fa fa-th icon"></i>
                </button>
            </div>
            <ul class="nav navbar-nav navbar-right">
                <button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
                    <i class="fa fa-times icon"></i>
                </button>
                <li class="dropdown profile">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">您好：${sessionScope.realName} <span class="caret"></span></a>
                    <ul class="dropdown-menu animated fadeInDown">
                        <li>
                            <div class="profile-info">
                                <h4 class="username">${sessionScope.username}</h4>
                                <p>${sessionScope.role}</p>
                                <p class="hidden" id="sessionUserId">${sessionScope.userId}</p>
                                <div class="btn-group margin-bottom-2x" role="group">
                                    <a role="button" class="btn btn-default" data-toggle="modal" data-target="#modalEditPassword"><i class="fa fa-gear"></i> 修改密码</a>
                                    <a role="button" class="btn btn-default" href="${website}/logout"><i class="fa fa-sign-out"></i> 退出登录</a>
                                </div>
                            </div>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
    <div class="modal fade" id="modalEditPassword" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title" id="myModalLabel">修改密码</h4>
                </div>
                <div class="modal-body">
                    <form>
                        <div class="row">
                            <div class="form-group col-lg-6">
                                <label>用户名</label>
                                <input type="text" class="form-control" value="${sessionScope.username}" disabled>
                            </div>
                            <div class="form-group col-lg-6">
                                <label for="oldPassword">原密码</label>
                                <input type="password" class="form-control" id="oldPassword" placeholder="请输入原密码">
                            </div>
                        </div>
                        <div class="row">
                            <div class="form-group col-lg-6">
                                <label for="editPassword">新密码</label>
                                <input type="password" class="form-control" id="editPassword" placeholder="请输入新密码">
                            </div>
                            <div class="form-group col-lg-6">
                                <label for="re-editPassword">重复新密码</label>
                                <input type="password" class="form-control" id="re-editPassword" placeholder="请再输入一次新密码">
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-success" id="editPasswordSubmit">提交</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                </div>
            </div>
        </div>
    </div>
</header>
