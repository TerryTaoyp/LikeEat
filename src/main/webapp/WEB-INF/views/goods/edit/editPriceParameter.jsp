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
        <input type="text" class="hidden" value=63 id="editCustomerTypeId">
        <div class="form-group">
            <label for="customerType">客户类型</label>
            <p id="customerType">一级代理商</p>
        </div>
        <div class="form-group">
            <label for="priceParam">价格参数</label>
            <input type="text" class="form-control" id="priceParam" placeholder="请输入价格参数">
        </div>
    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-success" id="editSubmit">提交</button>
    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
</div>
<script>
    $("#editSubmit").click(function(){
        var customerTypeId=$("#editCustomerTypeId").val();
        var priceParam=$("#priceParam").val();
        alert(customerTypeId+"+"+priceParam);
    })
</script>
