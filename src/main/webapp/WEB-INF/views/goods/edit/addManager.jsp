<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        <span aria-hidden="true">&times;</span>
    </button>
    <h4 class="modal-title" id="myModalLabel">商品添加</h4>
</div>
<div class="modal-body">
    <form id="addGoods">
        <div class="row">
            <div class="form-group col-lg-6">
                <label for="goodsName">商品名称</label>
                <input type="text" class="form-control" id="goodsName" placeholder="请输入商品名称">
            </div>
            <div class="form-group col-lg-6">
                <label for="goodsSpec">商品规格</label>
                <input type="text" class="form-control" id="goodsSpec" placeholder="请输入商品规格">
            </div>

        </div>
        <div class="row">
            <div class="form-group col-lg-8">
                <label for="goodsArea">商品产地</label>
                <div class="form-inline" data-toggle="distpicker" id="goodsArea">
                    <select class="form-control" id="province"></select>
                    <select class="form-control" id="city"></select>
                </div>
            </div>
            <div class="form-group col-lg-4">
                <label for="goodsType">商品类别</label>
                <select class="form-control" id="goodsType">
                    <c:forEach items="${goodsTypeList}" var="type" varStatus="status">
                        <option value="${type.id}">${type.name}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-success" id="addSubmit">提交</button>
    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
</div>
<script type="text/javascript" src="${staticWebsite}/lib/js/distpicker.js"></script>
<script>
    $("#addSubmit").click(function () {
        var goodsName = $("#goodsName").val();
        var goodsSpec = $("#goodsSpec").val();
        var area = $("#province").select().val() + $("#city").select().val();
        var goodsType = $("#goodsType").select().val();
        $.ajax({
            type: "post",
            url: _ajax.url.goods.manager.insert,
            dataType: "json",
            data:{
                goodsName:goodsName,
                goodsTypeId:goodsType,
                goodsAddress:area,
                specification:goodsSpec
            },
            success: function (data) {
                if (data.code) {
                    // 提示信息
                    alert('添加成功');
                    location.reload(true);
                }
                else {
                    alert('添加失败');
                }
            },
            error: function () {
                console.log("获取JSON数据异常");
            }
        })
    });
</script>