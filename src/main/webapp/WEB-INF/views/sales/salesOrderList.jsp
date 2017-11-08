<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <title>销售订单管理</title>
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
                                    <div class="title">销售订单管理</div>
                                </div>
                            </div>
                            <div class="card-body">
                                <table class="datatable table table-striped" cellspacing="0" width="100%" id="list">
                                    <thead>
                                    <tr>
                                        <th>序号</th>
                                        <th>订单号</th>
                                        <th>客户姓名</th>
                                        <th>商品名称</th>
                                        <th>操作</th>
                                        <th class="hidden"></th>
                                    </tr>
                                    </thead>

                                    <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>陶永攀</td>
                                        <td>超级管理员</td>
                                        <td>17684373801</td>
                                        <td>
                                            <button type="button" class="btn btn-info detail">查看</button>
                                            <button type="button" class="btn btn-danger del">删除</button>
                                        </td>
                                        <td class="hidden" id="orderNum">20170531</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>石昊</td>
                                        <td>管理员</td>
                                        <td>15764322090</td>
                                        <td>
                                            <button type="button" class="btn btn-info detail">查看</button>
                                            <button type="button" class="btn btn-danger del">删除</button>
                                        </td>
                                        <td class="hidden" id="orderNum">20170531</td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>李成族</td>
                                        <td>经理</td>
                                        <td>15764321968</td>
                                        <td>
                                            <button type="button" class="btn btn-info detail">查看</button>
                                            <button type="button" class="btn btn-danger del">删除</button>
                                        </td>
                                        <td class="hidden" id="orderNum">20170531</td>
                                    </tr>
                                    <tr>
                                        <td>4</td>
                                        <td>李帅鑫</td>
                                        <td>员工</td>
                                        <td>15764321234</td>
                                        <td>
                                            <button type="button" class="btn btn-info detail">查看</button>
                                            <button type="button" class="btn btn-danger del">删除</button>
                                        </td>
                                        <td class="hidden" id="orderNum">20170531</td>
                                    </tr>
                                    </tbody>
                                    <tfoot>
                                    <tr>
                                        <th>序号</th>
                                        <th>订单号</th>
                                        <th>客户姓名</th>
                                        <th>商品名称</th>
                                        <th>操作</th>
                                        <th class="hidden"></th>
                                    </tr>
                                    </tfoot>
                                </table>
                            </div>
                        </div>
                        <a class="btn btn-success btn-add" id="addOrder" role="button"> 添加</a>
                    </div>
                </div>
            </div>
            <jsp:include page="../common/footer.jsp"/>
        </div>
    </div>
</div>
<div class="modal fade" id="modalAddOrder" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
        </div>
    </div>
</div>
<div class="modal fade" id="modalOrderDetail" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
        </div>
    </div>
</div>
<jsp:include page="../common/script.jsp"/>
<script type="text/javascript" src="../../../resources/js/sales/salesOrderList.js"></script>
</body>

</html>
