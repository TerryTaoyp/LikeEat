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
    <h4 class="modal-title" id="myModalLabel">商品价格参数修改</h4>
</div>
<div class="modal-body">
    <form>
        <div class="form-group">
            <label for="customerType">客户类型</label>
            <p id="customerType">一级代理商</p>
        </div>
        <div class="form-group">
            <label for="priceParam">价格参数</label>
            <input type="text" class="form-control" id="priceParam" value="${pricePara.pricePara}">
        </div>
    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-success" id="editSubmit">提交</button>
    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
</div>
<script>
    $("#editSubmit").click(function(){
        var priceParam=$("#priceParam").val();
        $.ajax({
            type:"post",
            url:_ajax.url.goods.para.update,
            dataType:"json",
            data:{
                id:${pricePara.id},
                pricePara:priceParam
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
