<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        <span aria-hidden="true">&times;</span>
    </button>
    <h4 class="modal-title" id="myModalLabel">销售订单添加</h4>
</div>
<div class="modal-body">
    <form id="addOrder">
        <div class="form-group">
            <label for="order">订单号</label>
            <input type="text" class="form-control" id="order" placeholder="请输入采购订单号">
        </div>
        <div class="form-group">
            <label for="customer">客户姓名</label>
            <input type="text" class="form-control" id="customer" placeholder="请输入供货商名称">
        </div>
        <div id="items">
            <div class="row">
                <div class="form-group col-lg-4">
                    <label for="name0">商品名称</label>
                    <input type="text" class="form-control" id="name0" placeholder="请输入商品名称">
                </div>
                <div class="form-group col-lg-4">
                    <label for="price0">商品售价</label>
                    <input type="text" class="form-control" id="price0" placeholder="请输入商品进价">
                </div>
                <div class="form-group col-lg-4">
                    <label for="count0">售出数量</label>
                    <input type="number" class="form-control" id="count0" placeholder="请输入进货数量">
                </div>
            </div>
        </div>
        <div class="form-group">
            <a class="btn btn-link" role="button" id="addItem">
                <span class="fa fa-plus-square"></span> 添加商品</a>
        </div>
    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-success" id="addSubmit">提交</button>
    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
</div>
<script>

    var itemCnt = 1;

    $("#addItem").click(function () {
        var content = '' +
            '<div class="row">' +
            '<div class="form-group col-lg-4">' +
            '<label for="name' + itemCnt + '">商品名称</label>' +
            '<input type="text" class="form-control" id="name' + itemCnt + '" placeholder="请输入商品名称">' +
            '</div>' +
            '<div class="form-group col-lg-4">' +
            '<label for="price' + itemCnt + '">商品售价</label>' +
            '<input type="text" class="form-control" id="price' + itemCnt + '" placeholder="请输入商品进价">' +
            '</div>' +
            '<div class="form-group col-lg-4">' +
            '<label for="count' + itemCnt + '">售出数量</label>' +
            '<input type="number" class="form-control" id="count' + itemCnt + '" placeholder="请输入进货数量">' +
            '</div>' +
            '</div>';
        itemCnt++;
        $("#items").append(content);
    })

    $("#addSubmit").click(function () {
        var order = $("#order").val();
        var customer = $("#customer").val();
        var goods = new Array();
        for (var i = 0; i < itemCnt; i++) {
            var tmpName = $("#name" + i).val();
            var tmpPrice = $("#price" + i).val();
            var tmpCount = $("#count" + i).val();
            goods[i] = [tmpName, tmpPrice, tmpCount];
            alert(goods[i]);
        }
        alert(order + "+" + customer);
    });
</script>