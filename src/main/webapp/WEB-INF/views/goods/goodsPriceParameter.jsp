<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <title>商品价格参数管理</title>
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
                                    <div class="title">商品价格参数管理</div>
                                </div>
                            </div>
                            <div class="card-body">
                                <table class="datatable table table-striped" cellspacing="0" width="100%" id="list">
                                    <thead>
                                    <tr>
                                        <th>序号</th>
                                        <th>客户类别</th>
                                        <th>价格折扣</th>
                                        <th>操作</th>
                                        <th class="hidden"></th>
                                    </tr>
                                    </thead>

                                    <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>一级代理价格参数</td>
                                        <td>7折</td>
                                        <td>
                                            <button type="button" class="btn btn-success edit">修改</button>
                                            <button type="button" class="btn btn-danger del">删除</button>
                                        </td>
                                        <td class="hidden" id="customerTypeId">21</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>二级代理价格参数</td>
                                        <td>8折</td>
                                        <td>
                                            <button type="button" class="btn btn-success edit">修改</button>
                                            <button type="button" class="btn btn-danger del">删除</button>
                                        </td>
                                        <td class="hidden" id="customerTypeId">22</td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>一级代理价格参数</td>
                                        <td>9折</td>
                                        <td>
                                            <button type="button" class="btn btn-success edit">修改</button>
                                            <button type="button" class="btn btn-danger del">删除</button>
                                        </td>
                                        <td class="hidden" id="customerTypeId">23</td>
                                    </tr>
                                    <tr>
                                        <td>4</td>
                                        <td>销售价格参数参数</td>
                                        <td>9.5折</td>
                                        <td>
                                            <button type="button" class="btn btn-success edit">修改</button>
                                            <button type="button" class="btn btn-danger del">删除</button>
                                        </td>
                                        <td class="hidden" id="customerTypeId">24</td>
                                    </tr>
                                    </tbody>
                                    <tfoot>
                                    <tr>
                                        <th>序号</th>
                                        <th>客户类别</th>
                                        <th>价格折扣</th>
                                        <th>操作</th>
                                        <th class="hidden"></th>
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
<div class="modal fade" id="modalEditPriceParam" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
        </div>
    </div>
</div>
<jsp:include page="../common/script.jsp"/>
<script type="text/javascript" src="../../../resources/js/goods/goodsPriceParameter.js"></script>
</body>

</html>