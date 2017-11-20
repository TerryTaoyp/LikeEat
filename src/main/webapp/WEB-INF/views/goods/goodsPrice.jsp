<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <title>商品价格信息管理</title>
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
                                    <div class="title">商品价格信息管理</div>
                                </div>
                            </div>
                            <div class="card-body">
                                <table class="datatable table table-striped" cellspacing="0" width="100%" id="list">
                                    <thead>
                                    <tr>
                                        <th>序号</th>
                                        <th>商品类别</th>
                                        <th>商品名称</th>
                                        <th>进货价格</th>
                                        <th>市场价格</th>
                                        <th>备注</th>
                                        <th>操作</th>
                                        <th class="hidden"></th>
                                    </tr>
                                    </thead>

                                    <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>水果类</td>
                                        <td id="goods">苹果</td>
                                        <td>2元/斤</td>
                                        <td>3元/斤</td>
                                        <td>好吃多汁，物美价廉</td>
                                        <td>
                                            <button type="button" class="btn btn-info detail">价格信息详情</button>
                                            <button type="button" class="btn btn-success edit">修改</button>
                                            <button type="button" class="btn btn-danger del">删除</button>
                                        </td>
                                        <td class="hidden" id="goodsId">63</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>水果类</td>
                                        <td id="goods">苹果</td>
                                        <td>2元/斤</td>
                                        <td>3元/斤</td>
                                        <td>好吃多汁，物美价廉</td>
                                        <td>
                                            <button type="button" class="btn btn-info detail">价格信息详情</button>
                                            <button type="button" class="btn btn-success edit">修改</button>
                                            <button type="button" class="btn btn-danger del">删除</button>
                                        </td>
                                        <td class="hidden" id="goodsId">66</td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>水果类</td>
                                        <td id="goods">苹果</td>
                                        <td>2元/斤</td>
                                        <td>3元/斤</td>
                                        <td>好吃多汁，物美价廉</td>
                                        <td>
                                            <button type="button" class="btn btn-info detail">价格信息详情</button>
                                            <button type="button" class="btn btn-success edit">修改</button>
                                            <button type="button" class="btn btn-danger del">删除</button>
                                        </td>
                                        <td class="hidden" id="goodsId">65</td>
                                    </tr>
                                    <tr>
                                        <td>4</td>
                                        <td>水果类</td>
                                        <td id="goods">苹果</td>
                                        <td>2元/斤</td>
                                        <td>3元/斤</td>
                                        <td>好吃多汁，物美价廉</td>
                                        <td>
                                            <button type="button" class="btn btn-info detail">价格信息详情</button>
                                            <button type="button" class="btn btn-success edit">修改</button>
                                            <button type="button" class="btn btn-danger del">删除</button>
                                        </td>
                                        <td class="hidden" id="goodsId">64</td>
                                    </tr>
                                    </tbody>
                                    <tfoot>
                                    <tr>
                                        <th>序号</th>
                                        <th>商品类别</th>
                                        <th>商品名称</th>
                                        <th>进货价格</th>
                                        <th>市场价格</th>
                                        <th>备注</th>
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
<div class="modal fade" id="modalPriceDetail" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
        </div>
    </div>
</div>
<div class="modal fade" id="modalEditParam" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
        </div>
    </div>
</div>
<jsp:include page="../common/script.jsp"/>
<script type="text/javascript" src="${staticWebsite}/js/goods/goodsPrice.js"></script>
</body>

</html>