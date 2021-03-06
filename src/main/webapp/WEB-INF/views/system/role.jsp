<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>

<head>
    <title>角色管理</title>
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
                                    <div class="title">角色管理</div>
                                </div>
                            </div>
                            <div class="card-body">
                                <table class="datatable table table-striped" cellspacing="0" width="100%" id="list">
                                    <thead>
                                    <tr>
                                        <th>序号</th>
                                        <th>名称</th>
                                        <th>操作</th>
                                        <th class="hidden"></th>
                                    </tr>
                                    </thead>

                                    <tbody>
                                    <c:forEach items="${roleList}" var="role" varStatus="status">
                                        <tr>
                                            <td>${status.index+1}</td>
                                            <td id="role">${role.role}</td>
                                            <td>
                                                <button type="button" class="btn btn-success edit">修改</button>
                                                <button type="button" class="btn btn-danger del">删除</button>
                                            </td>
                                            <td class="hidden" id="roleId">${role.id}</td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                    <tfoot>
                                    <tr>
                                        <th>序号</th>
                                        <th>名称</th>
                                        <th>操作</th>
                                        <th class="hidden"></th>
                                    </tr>
                                    </tfoot>
                                </table>
                            </div>
                        </div>
                        <a class="btn btn-success btn-add" data-toggle="modal" data-target="#modalAddRole" role="button"> 添加</a>
                    </div>
                </div>
            </div>
            <jsp:include page="../common/footer.jsp"/>
        </div>
    </div>
</div>
<div class="modal fade" id="modalAddRole" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">角色添加</h4>
            </div>
            <div class="modal-body">
                <form id="addRole">
                    <div class="form-group">
                        <label for="roleName">角色名称</label>
                        <input type="text" class="form-control" id="roleName" placeholder="请输入角色名称">
                    </div>
                    <div class="form-group">
                        <label>角色权限</label>
                        <div>
                            <div class="radio3 radio-check radio-inline">
                                <input type="radio" id="radio1" name="power" value="1">
                                <label for="radio1">
                                    超级管理员
                                </label>
                            </div>
                            <div class="radio3 radio-check radio-inline">
                                <input type="radio" id="radio2" name="power" value="2">
                                <label for="radio2">
                                    管理员
                                </label>
                            </div>
                            <div class="radio3 radio-check radio-inline">
                                <input type="radio" id="radio3" name="power" value="3">
                                <label for="radio3">
                                    经理
                                </label>
                            </div>
                            <div class="radio3 radio-check radio-inline">
                                <input type="radio" id="radio4" name="power" value="4">
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
<div class="modal fade" id="modalEditRole" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
        </div>
    </div>
</div>
<jsp:include page="../common/script.jsp"/>
<script src="${staticWebsite}/js/system/role.js"></script>
</body>

</html>