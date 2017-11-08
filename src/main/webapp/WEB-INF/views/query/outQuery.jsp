<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <title>出库查询</title>
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
                                    <div class="title">出库查询</div>
                                </div>
                            </div>
                            <div class="card-body">
                                <form class="form-inline">
                                    <div class="form-group">
                                        <label for="orderNum">订单号：</label>
                                        <input type="text" class="form-control" id="orderNum" placeholder="请输入订单号">
                                    </div>
                                    <div class="form-group">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
                                    <div class="form-group">
                                        <label for="date">销售日期：</label>
                                        <input type="date" class="form-control" id="date">
                                    </div>
                                    <div class="form-group">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
                                    <div class="form-group">
                                        <label for="agent">代理商：</label>
                                        <input type="text" class="form-control" id="agent" placeholder="请输入代理商名称">
                                    </div>
                                    <div class="form-group">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
                                    <div class="form-group">
                                        <label for="seller">销售商：</label>
                                        <input type="text" class="form-control" id="seller" placeholder="请输入销售商名称">
                                    </div>
                                </form>
                                <div class="sub-title" role="button" id="baseOnVIP">按会员查询
                                    <i class="fa fa-angle-down" id="icon"></i>
                                </div>
                                <form class="form-inline hidden" id="VIPSearch">
                                    <div class="form-group">
                                        <label for="cardId">卡号：</label>
                                        <input type="text" class="form-control" id="cardId" placeholder="请输入会员卡号">
                                    </div>
                                    <div class="form-group">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
                                    <div class="form-group">
                                        <label for="name">姓名：</label>
                                        <input type="text" class="form-control" id="name" placeholder="请输入会员姓名">
                                    </div>
                                    <div class="form-group">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
                                    <div class="form-group">
                                        <label for="idNumber">身份证号：</label>
                                        <input type="text" class="form-control" id="idNumber" placeholder="请输入会员身份证号">
                                    </div>
                                    <div class="form-group">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
                                    <div class="form-group">
                                        <label for="phone">电话：</label>
                                        <input type="text" class="form-control" id="phone" placeholder="请输入会员电话号码">
                                    </div>
                                    <div class="form-group">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
                                    <div class="form-group">
                                        <label for="level">会员等级：</label>
                                        <select class="form-control" id="level">
                                            <option>青铜会员</option>
                                            <option>白银会员</option>
                                            <option>黄金会员</option>
                                            <option>白金会员</option>
                                            <option>钻石会员</option>
                                            <option>至尊会员</option>
                                        </select>
                                    </div>
                                </form>
                                <div class="card-body pull-right">
                                    <button class="btn btn-success" id="searchSubmit">查询</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-xs-12">
                        <div class="card">
                            <div class="card-body">
                                <table class="datatable table table-striped" cellspacing="0" width="100%" id="list">
                                    <thead>
                                    <tr>
                                        <th>序号</th>
                                        <th>姓名</th>
                                        <th>角色</th>
                                        <th>手机号</th>
                                    </tr>
                                    </thead>

                                    <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>陶永攀</td>
                                        <td>超级管理员</td>
                                        <td>17684373801</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>石昊</td>
                                        <td>管理员</td>
                                        <td>15764322090</td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>李成族</td>
                                        <td>经理</td>
                                        <td>15764321968</td>
                                    </tr>
                                    <tr>
                                        <td>4</td>
                                        <td>李帅鑫</td>
                                        <td>员工</td>
                                        <td>15764321234</td>
                                    </tr>
                                    </tbody>
                                    <tfoot>
                                    <tr>
                                        <th>序号</th>
                                        <th>用户名</th>
                                        <th>角色</th>
                                        <th>手机号</th>
                                    </tr>
                                    </tfoot>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <jsp:include page="../common/footer.jsp"/>
        </div>
    </div>
</div>
<jsp:include page="../common/script.jsp"/>
<script type="text/javascript" src="../../../resources/js/query/outQuery.js"></script>
</body>

</html>
