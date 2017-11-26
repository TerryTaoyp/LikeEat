<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>

<head>
    <title>商品基本信息管理</title>
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
                                    <div class="title">商品基本信息管理</div>
                                </div>
                            </div>
                            <div class="card-body">
                                <table class="datatable table table-striped" cellspacing="0" width="100%" id="list">
                                    <thead>
                                    <tr>
                                        <th>序号</th>
                                        <th>商品类别</th>
                                        <th>商品名称</th>
                                        <th>商品产地</th>
                                        <th>商品规格</th>
                                        <th>操作</th>
                                        <th class="hidden"></th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${goodsList}" var="good" varStatus="statusG">
                                        <c:forEach items="${goodsTypeList}" var="type" varStatus="statusT">
                                            <c:if test="${good.goodsType == type.id}">
                                                <tr>
                                                    <td>${statusG.index+1}</td>
                                                    <td>${type.name}</td>
                                                    <td id="goods">${good.goodsName}</td>
                                                    <td>${good.goodsAddress}</td>
                                                    <td>${good.specification}</td>
                                                    <td>
                                                        <button type="button" class="btn btn-success edit">修改</button>
                                                        <button type="button" class="btn btn-danger del">删除</button>
                                                    </td>
                                                    <td class="hidden" id="goodsId">${good.id}</td>
                                                </tr>
                                            </c:if>
                                        </c:forEach>
                                    </c:forEach>
                                    </tbody>
                                    <tfoot>
                                    <tr>
                                        <th>序号</th>
                                        <th>商品类别</th>
                                        <th>商品名称</th>
                                        <th>商品产地</th>
                                        <th>商品规格</th>
                                        <th>操作</th>
                                        <th class="hidden"></th>
                                    </tr>
                                    </tfoot>
                                </table>
                            </div>
                        </div>
                        <a class="btn btn-success btn-add" role="button" id="add"> 添加</a>
                    </div>
                </div>
            </div>
            <jsp:include page="../common/footer.jsp"/>
        </div>
    </div>
</div>
<div class="modal fade" id="modalAddGoods" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
        </div>
    </div>
</div>
<div class="modal fade" id="modalEditGoods" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
        </div>
    </div>
</div>
<jsp:include page="../common/script.jsp"/>
<script type="text/javascript" src="${staticWebsite}/js/goods/goodsManager.js"></script>
</body>

</html>