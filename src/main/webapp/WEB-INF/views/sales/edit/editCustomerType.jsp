<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        <span aria-hidden="true">&times;</span>
    </button>
    <h4 class="modal-title" id="myModalLabel">客户类别修改</h4>
</div>
<div class="modal-body">
    <form>
        <div class="row">
            <div class="form-group col-lg-6">
                <label for="editTypeName">类型名称</label>
                <input type="text" class="form-control" id="editTypeName" value="${customerType.name}">
            </div>
            <div class="form-group col-lg-6">
                <label for="editGeneralType">该类型属于</label>
                <select class="form-control" id="editGeneralType">
                    <option value="2">会员</option>
                    <option value="3">销售商</option>
                    <option value="4">代理商</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="editRemark">备注</label>
            <input type="text" class="form-control" id="editRemark" value="${customerType.remark}">
        </div>
    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-success" id="editSubmit">提交</button>
    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
</div>
<script>
    $("#editSubmit").click(function(){
        var editTypeName =$("#editTypeName").val();
        var editGeneralType = $("#editGeneralType").val();
        var editRemark = $("#editRemark").val();
        $.ajax({
            type:"post",
            url:_ajax.url.sale.customerType.update,
            dataType:"json",
            data:{
                id:${customerType.id},
                name:editTypeName,
                generalType:editGeneralType,
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
