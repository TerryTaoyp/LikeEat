<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        <span aria-hidden="true">&times;</span>
    </button>
    <h4 class="modal-title" id="myModalLabel">角色修改</h4>
</div>
<div class="modal-body">
    <form>
        <div class="form-group">
            <label for="editRoleName">角色名称</label>
            <input type="text" class="form-control" id="editRoleName" name="role" value="${role.role}">
        </div>
        <div class="form-group">
            <label>角色权限</label>
            <div>
                <div class="radio3 radio-check radio-inline">
                    <input type="radio" id="editRadio1" name="editPower" value="1">
                    <label for="editRadio1">
                        超级管理员
                    </label>
                </div>
                <div class="radio3 radio-check radio-inline">
                    <input type="radio" id="editRadio2" name="editPower" value="2">
                    <label for="editRadio2">
                        管理员
                    </label>
                </div>
                <div class="radio3 radio-check radio-inline">
                    <input type="radio" id="editRadio3" name="editPower" value="3">
                    <label for="editRadio3">
                        经理
                    </label>
                </div>
                <div class="radio3 radio-check radio-inline">
                    <input type="radio" id="editRadio4" name="editPower" value="4">
                    <label for="editRadio4">
                        员工
                    </label>
                </div>
            </div>
        </div>
    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-success" id="editSubmit">提交</button>
    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
</div>
<script>
    $(document).ready(function () {
        $("#editRadio${role.powerId}").attr('checked','true');
    });
    $("#editSubmit").click(function () {
        var editRoleId=${role.id};
        var editRoleName = $("#editRoleName").val();
        var editPower = $("[name='editPower']").filter(":checked").val();
        $.ajax({
            type: "post",
            url: _ajax.url.system.role.update,
            dataType: "json",
            data: {
                id: editRoleId,
                role: editRoleName,
                power: editPower,
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