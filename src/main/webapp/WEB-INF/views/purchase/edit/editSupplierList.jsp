<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        <span aria-hidden="true">&times;</span>
    </button>
    <h4 class="modal-title" id="myModalLabel">供货商修改</h4>
</div>
<div class="modal-body">
    <form>
        <div class="row">
            <div class="form-group col-lg-6">
                <label for="editName">供货商名称</label>
                <input type="text" class="form-control" id="editName" value="${supplier.supplierName}">
            </div>
            <div class="form-group col-lg-6">
                <label for="editType">供货商类别</label>
                <select class="form-control" id="editType">
                    <c:forEach items="${supplierTypeList}" var="type" varStatus="status">
                        <option value="${type.id}">${type.name}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-lg-6">
                <label for="editAddr">供货商地址</label>
                <input type="text" class="form-control" id="editAddr" value="${supplier.supplierAddress}">
            </div>
            <div class="form-group col-lg-6">
                <label for="editContact">联系方式</label>
                <input type="text" class="form-control" id="editContact" value="${supplier.telephone}" >
            </div>
        </div>
        <div class="form-group">
            <label for="editRemark">备注</label>
            <input type="text" class="form-control" id="editRemark" value="${supplier.remark}" >
        </div>
    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-success" id="editSubmit">提交</button>
    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
</div>
<script>
    $(document).ready(function () {
        $("#editType").value=${supplier.supplierTypeId};
    });

    $("#editSubmit").click(function(){
        var editName = $("#editName").val();
        var editType = $("#editType").select().val();
        var editAddr = $("#editAddr").val();
        var editContact = $("#editContact").val();
        var editRemark = $("#editRemark").val();
        $.ajax({
            type:"post",
            url:_ajax.url.purchase.suppList.update,
            dataType:"json",
            data:{
                id:${supplier.id},
                supplierName:editName,
                supplierTypeId:editType,
                supplierAddress:editAddr,
                telephone:editContact,
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
