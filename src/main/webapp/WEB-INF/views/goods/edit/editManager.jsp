<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        <span aria-hidden="true">&times;</span>
    </button>
    <h4 class="modal-title" id="myModalLabel">商品修改</h4>
</div>
<div class="modal-body">
    <form>
        <div class="row">
            <div class="form-group col-lg-6">
                <label for="editGoodsName">商品名称</label>
                <input type="text" class="form-control" id="editGoodsName" value="${goods.goodsName}">
            </div>
            <div class="form-group col-lg-6">
                <label for="editGoodsSpec">商品规格</label>
                <input type="text" class="form-control" id="editGoodsSpec" value="${goods.specification}" >
            </div>
        </div>
        <div class="row">
            <div class="form-group col-lg-8">
                <label for="editGoodsArea">商品产地</label>
                <div class="form-inline" data-toggle="distpicker" id="editGoodsArea">
                    <select class="form-control" id="editProvince"></select>
                    <select class="form-control" id="editCity"></select>
                </div>
            </div>
            <div class="form-group col-lg-4">
                <label for="editGoodsType">商品类别</label>
                <select class="form-control" id="editGoodsType">
                    <c:forEach items="${goodsTypeList}" var="type" varStatus="status">
                        <option value="${type.id}">${type.name}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-success" id="editSubmit">提交</button>
    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
</div>
<script type="text/javascript" src="${staticWebsite}/lib/js/distpicker.js"></script>
<script>
    $(document).ready(function () {
        $("#editGoodsType").value=${goods.goodsType};
    });

    $("#editSubmit").click(function(){
        var editGoodsName=$("#editGoodsName").val();
        var editGoodsSpec=$("#editGoodsSpec").val();
        var editArea=$("#editProvince").select().val()+$("#editCity").select().val();
        var editGoodsType=$("#editGoodsType").select().val();
        $.ajax({
            type:"post",
            url:_ajax.url.goods.manager.update,
            dataType:"json",
            data:{
                id:${goods.id},
                goodsName:editGoodsName,
                goodsTypeId:editGoodsType,
                goodsAddress:editArea,
                specification:editGoodsSpec
            },
            success: function(data) {
                if (data.code) {
                    // 提示信息
                    alert('修改成功');
                    location.reload(true);
                }
                else{
                    alert('修改失败');
                }
            },
            error: function () {
                console.log("获取JSON数据异常");
            }
        })
    });
</script>