<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>

<head>
    <title>用户管理</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Fonts -->
    <jsp:include page="../common/link.jsp"/>
</head>

<body class="flat-green">
<div class="app-container expanded">
    <div class="row content-container">
        <jsp:include page="../common/header.jsp"/>
        <jsp:include page="../common/sidebar.jsp"/>
        <!-- Main Content -->
        <div class="container-fluid">
            <div class="side-body padding-top">
                <div class="row">
                    <div class="col-xs-12">
                        <div class="card">
                            <div class="card-header">
                                <div class="card-title">
                                    <div class="title">用户管理</div>
                                </div>
                            </div>
                            <div class="card-body">
                                <table class="datatable table table-striped" cellspacing="0" width="100%" id="list">
                                    <thead>
                                    <tr>
                                        <th>序号</th>
                                        <th>姓名</th>
                                        <th>角色</th>
                                        <th>电话</th>
                                        <th>操作</th>
                                        <th class="hidden"></th>
                                    </tr>
                                    </thead>

                                    <tbody>
                                    <c:forEach items="${userList}" var="user" varStatus="status">
                                        <tr>
                                            <td>${status.index+1}</td>
                                            <td>${user.username}</td>
                                            <td>${user.roleId}</td>
                                            <td>${user.phone}</td>
                                            <td>
                                                <button type="button" class="btn btn-success edit">修改</button>
                                                <button type="button" class="btn btn-danger del">删除</button>
                                            </td>
                                            <td class="hidden" id="userId">62</td>
                                        </tr>
                                    </c:forEach>

                                    </tbody>
                                    <tfoot>
                                    <tr>
                                        <th>序号</th>
                                        <th>用户名</th>
                                        <th>角色</th>
                                        <th>电话</th>
                                        <th>操作</th>
                                        <th class="hidden"></th>
                                    </tr>
                                    </tfoot>
                                </table>
                            </div>
                        </div>
                        <a class="btn btn-success btn-add" data-toggle="modal" data-target="#modalAddUser" role="button"> 添加</a>
                    </div>
                </div>
            </div>
            <jsp:include page="../common/footer.jsp"/>
        </div>
    </div>
</div>
<div class="modal fade" id="modalAddUser" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">用户添加</h4>
            </div>
            <div class="modal-body">
                <form id="addUser">
                    <div class="row">
                        <div class="form-group col-lg-6">
                            <label for="userName">姓名</label>
                            <input type="text" class="form-control" id="userName" placeholder="请输入用户姓名">
                        </div>
                        <div class="form-group col-lg-6">
                            <label for="phone">电话</label>
                            <input type="text" class="form-control" id="phone" placeholder="请输入电话号码">
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-lg-6">
                            <label for="password">密码</label>
                            <input type="password" class="form-control" id="password" placeholder="请输入密码">
                        </div>
                        <div class="form-group col-lg-6">
                            <label for="re-password">重复密码</label>
                            <input type="password" class="form-control" id="re-password" placeholder="请再一次输入密码">
                        </div>
                    </div>
                    <div class="form-group">
                        <label>角色</label>
                        <div>
                            <div class="radio3 radio-check radio-inline">
                                <input type="radio" id="radio1" name="role" value="1">
                                <label for="radio1">
                                    超级管理员
                                </label>
                            </div>
                            <div class="radio3 radio-check radio-inline">
                                <input type="radio" id="radio2" name="role" value="2">
                                <label for="radio2">
                                    管理员
                                </label>
                            </div>
                            <div class="radio3 radio-check radio-inline">
                                <input type="radio" id="radio3" name="role" value="3">
                                <label for="radio3">
                                    经理
                                </label>
                            </div>
                            <div class="radio3 radio-check radio-inline">
                                <input type="radio" id="radio4" name="role" value="4">
                                <label for="radio4">
                                    员工
                                </label>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-success" id="addSubmit">提交</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="modalEditUser" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
        </div>
    </div>
</div>
<jsp:include page="../common/script.jsp"/>
<script type="text/javascript" src="${staticWebsite}/js/system/user.js"></script>
</body>

</html>
