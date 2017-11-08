<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        <span aria-hidden="true">&times;</span>
    </button>
    <h4 class="modal-title" id="myModalLabel">供货商类别修改</h4>
</div>
<div class="modal-body">
    <form>
        <div class="form-group">
            <label for="editTypeName">类型名称</label>
            <input type="text" class="form-control" id="editTypeName" placeholder="请输入商品类别名称">
        </div>
        <div class="form-group">
            <label for="editRemark">备注</label>
            <input type="text" class="form-control" id="editRemark" placeholder="请输入商品类别备注">
        </div>
    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-success" id="editSubmit">提交</button>
    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
</div>
<script>
    $("#editSubmit").click(function(){
        var editTypeName=$("#editTypeName").val();
        var editRemark=$("#editRemark").val();
        alert(editTypeName+"+"+editRemark);
    })
</script>