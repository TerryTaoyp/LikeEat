<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>

<head>
    <title>供货商家管理</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Fonts -->
    <jsp:include page="../../common/link.jsp"/>
</head>

<body class="flat-green">
<div class="app-container expanded">
    <div class="row content-container">
        <jsp:include page="../../common/header.jsp"/>
        <jsp:include page="../../common/sidebar.jsp"/>
        <!-- Main Content -->
        <div class="container-fluid">
            <div class="side-body padding-top">
                <div class="row">
                    <div class="col-xs-12">
                        <div class="card">
                            <div class="card-header">
                                <div class="card-title">
                                    <div class="title">供货商家管理</div>
                                </div>
                            </div>
                            <div class="card-body">
                                <table class="datatable table table-striped" cellspacing="0" width="100%" id="list">
                                    <thead>
                                    <tr>
                                        <th>序号</th>
                                        <th>供货商类别</th>
                                        <th>供货商名称</th>
                                        <th>供货商地址</th>
                                        <th>联系方式</th>
                                        <th>备注</th>
                                        <th>操作</th>
                                        <th class="hidden"></th>
                                    </tr>
                                    </thead>

                                    <tbody>
                                    <c:forEach items="${supplierList}" var="supp" varStatus="statusS">
                                        <c:forEach items="${supplierTypeList}" var="type" varStatus="statusT">
                                            <c:if test="${supp.supplierTypeId==type.id}">
                                                <tr>
                                                    <td>${statusS.index+1}</td>
                                                    <td>${type.name}</td>
                                                    <td id="supplierName">${supp.supplierName}</td>
                                                    <td>${supp.supplierAddress}</td>
                                                    <td>${supp.telephone}</td>
                                                    <td>${supp.remark}</td>
                                                    <td>
                                                        <button type="button" class="btn btn-success edit">修改</button>
                                                        <button type="button" class="btn btn-danger del">删除</button>
                                                    </td>
                                                    <td class="hidden" id="suppId">${supp.id}</td>
                                                </tr>
                                            </c:if>
                                        </c:forEach>
                                    </c:forEach>
                                    </tbody>
                                    <tfoot>
                                    <tr>
                                        <th>序号</th>
                                        <th>供货商类别</th>
                                        <th>供货商名称</th>
                                        <th>供货商地址</th>
                                        <th>联系方式</th>
                                        <th>备注</th>
                                        <th>操作</th>
                                        <th class="hidden"></th>
                                    </tr>
                                    </tfoot>
                                </table>
                            </div>
                        </div>
                        <a class="btn btn-success btn-add" data-toggle="modal" data-target="#modalAddSupp"
                           role="button"> 添加</a>
                    </div>
                </div>
            </div>
            <jsp:include page="../../common/footer.jsp"/>
        </div>
    </div>
</div>
<div class="modal fade" id="modalAddSupp" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">供货商添加</h4>
            </div>
            <div class="modal-body">
                <form>
                    <div class="row">
                        <div class="form-group col-lg-6">
                            <label for="name">供货商名称</label>
                            <input type="text" class="form-control" id="name" placeholder="请输入供货商名称">
                        </div>
                        <div class="form-group col-lg-6">
                            <label for="type">供货商类别</label>
                            <select class="form-control" id="type">
                                <c:forEach items="${supplierTypeList}" varStatus="status" var="type">
                                    <option value="${type.id}">${type.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-lg-6">
                            <label for="addr">供货商地址</label>
                            <input type="text" class="form-control" id="addr" placeholder="请输入供货商地址">
                        </div>
                        <div class="form-group col-lg-6">
                            <label for="contact">联系方式</label>
                            <input type="text" class="form-control" id="contact" placeholder="请输入供货商联系方式">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="remark">备注</label>
                        <input type="text" class="form-control" id="remark" placeholder="请输入供货商备注">
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
<div class="modal fade" id="modalEditSupp" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
        </div>
    </div>
</div>
<jsp:include page="../../common/script.jsp"/>
<script type="text/javascript" src="${staticWebsite}/js/purchase/supplierList.js"></script>
</body>

</html>
