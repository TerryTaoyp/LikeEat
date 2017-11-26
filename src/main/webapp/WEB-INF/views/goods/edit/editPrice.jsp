<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        <span aria-hidden="true">&times;</span>
    </button>
    <h4 class="modal-title" id="myModalLabel">价格信息修改</h4>
</div>
<div class="modal-body">
    <form>
        <div class="form-group">
            <label for="goodsName">商品名称</label>
            <p id="goodsName">${goodsDto.goodsName}</p>
        </div>
        <div class="row">
            <div class="form-group col-lg-6">
                <label for="editInPrice">商品进价</label>
                <input type="text" class="form-control" id="editInPrice" value="${goodsDto.priceCost}">
            </div>
            <div class="form-group col-lg-6">
                <label for="editOutPrice">商品市场价格</label>
                <input type="text" class="form-control" id="editOutPrice" value="${goodsDto.marketPrice}">
            </div>
        </div>
        <div class="form-group">
            <label for="editRemark">商品备注</label>
            <input type="text" class="form-control" id="editRemark" value="${goodsDto.goodsRemark}">
        </div>
    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-success" id="editSubmit">提交</button>
    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
</div>
<script>
    $("#editSubmit").click(function(){
        var editInPrice=$("#editInPrice").val();
        var editOutPrice=$("#editOutPrice").val();
        var editRemark=$("#editRemark").val();
        $.ajax({
            type:"post",
            url:_ajax.url.goods.price.update,
            dataType:"json",
            data:{
                goodsId:${goodsDto.id},
                priceCost:editInPrice*1.0,
                marketPrice:editOutPrice*1.0,
                remark:editRemark
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
    })
</script>