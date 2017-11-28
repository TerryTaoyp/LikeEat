<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>

<head>
    <title>客户类别管理</title>
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
                                    <div class="title">客户类别管理</div>
                                </div>
                            </div>
                            <div class="card-body">
                                <table class="datatable table table-striped" cellspacing="0" width="100%" id="list">
                                    <thead>
                                    <tr>
                                        <th>序号</th>
                                        <th>名称</th>
                                        <th>备注</th>
                                        <th>操作</th>
                                        <th class="hidden"></th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>海鲜类</td>
                                        <td>新鲜，可口，好吃</td>
                                        <td>
                                            <button type="button" class="btn btn-success edit">修改</button>
                                            <button type="button" class="btn btn-danger del">删除</button>
                                        </td>
                                        <td class="hidden" id="typeId">9</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>人参类</td>
                                        <td>自家生产，纯天然</td>
                                        <td>
                                            <button type="button" class="btn btn-success edit">修改</button>
                                            <button type="button" class="btn btn-danger del">删除</button>
                                        </td>
                                        <td class="hidden" id="typeId">9</td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>蔬菜类</td>
                                        <td>纯天然，无添加</td>
                                        <td>
                                            <button type="button" class="btn btn-success edit">修改</button>
                                            <button type="button" class="btn btn-danger del">删除</button>
                                        </td>
                                        <td class="hidden" id="typeId">9</td>
                                    </tr>
                                    <tr>
                                        <td>4</td>
                                        <td>水果类</td>
                                        <td>色泽鲜亮，新鲜，可口</td>
                                        <td>
                                            <button type="button" class="btn btn-success edit">修改</button>
                                            <button type="button" class="btn btn-danger del">删除</button>
                                        </td>
                                        <td class="hidden" id="typeId">9</td>
                                    </tr>
                                    </tbody>
                                    <tfoot>
                                    <tr>
                                        <th>序号</th>
                                        <th>名称</th>
                                        <th>备注</th>
                                        <th>操作</th>
                                        <th class="hidden"></th>
                                    </tr>
                                    </tfoot>
                                </table>
                            </div>
                        </div>
                        <a class="btn btn-success btn-add" data-toggle="modal" data-target="#modalAddCustType" role="button"> 添加</a>
                    </div>
                </div>
            </div>
            <jsp:include page="../../common/footer.jsp"/>
        </div>
    </div>
</div>
<div class="modal fade" id="modalAddCustType" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">客户类别添加</h4>
            </div>
            <div class="modal-body">
                <form id="addType">
                    <div class="row">
                        <div class="form-group col-lg-6">
                            <label for="typeName">类型名称</label>
                            <input type="text" class="form-control" id="typeName" placeholder="请输入客户类别名称">
                        </div>
                        <div class="form-group col-lg-2">
                            <label>&nbsp;&nbsp;&nbsp;&nbsp;</label>
                            <div class="checkbox3 checkbox-inline checkbox-check checkbox-light">
                                <input type="checkbox" id="isVIP"/>
                                <label for="isVIP">该类型属于会员</label>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="param">价格参数</label>
                        <input type="text" class="form-control" id="param" placeholder="请输入客户价格参数">
                    </div>

                    <div class="form-group">
                        <label for="remark">备注</label>
                        <input type="text" class="form-control" id="remark" placeholder="请输入客户类别备注">
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
<div class="modal fade" id="modalEditCustType" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">

        </div>
    </div>
</div>
<jsp:include page="../../common/script.jsp"/>
<script type="text/javascript" src="${staticWebsite}/js/sales/customerType.js"></script>
</body>

</html>
