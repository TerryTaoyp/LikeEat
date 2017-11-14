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
    <h4 class="modal-title" id="myModalLabel">用户编辑</h4>
</div>
<div class="modal-body">
    <form>
        <div class="row">
            <div class="form-group col-lg-6">
                <label for="editRealName">姓名</label>
                <input type="text" class="form-control" id="editRealName" value="${user.realName}">
            </div>
            <div class="form-group col-lg-6">
                <label for="editUserName">用户名</label>
                <input type="text" class="form-control" id="editUserName" value="${user.username}">
            </div>
        </div>
        <div class="row">
            <div class="form-group col-lg-6">
                <label for="editPhone">电话</label>
                <input type="text" class="form-control" id="editPhone" value="${user.phone}">
            </div>
            <div class="form-group col-lg-6">
                <label for="editIdCard">身份证号</label>
                <input type="text" class="form-control" id="editIdCard" value="${user.idCard}">
            </div>
        </div>
        <div class="form-group">
            <label>角色</label>
            <div>
                <div class="radio3 radio-check radio-inline">
                    <input type="radio" id="editRadio1" name="editRole" value="1">
                    <label for="editRadio1">
                        超级管理员
                    </label>
                </div>
                <div class="radio3 radio-check radio-inline">
                    <input type="radio" id="editRadio2" name="editRole" value="2">
                    <label for="editRadio2">
                        管理员
                    </label>
                </div>
                <div class="radio3 radio-check radio-inline">
                    <input type="radio" id="editRadio3" name="editRole" value="3">
                    <label for="editRadio3">
                        经理
                    </label>
                </div>
                <div class="radio3 radio-check radio-inline">
                    <input type="radio" id="editRadio4" name="editRole" value="4">
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
        $("#editRadio${user.roleId}").attr('checked', true);
    });

    $("#editSubmit").click(function () {
        var editRealName = $("#editRealName").val();
        var editUserName = $("#editUserName").val();
        var editPhone = $("#editPhone").val();
        var editRole = $("[name='editRole']").filter(":checked").val();
        var editIdCard = $("#editIdCard").val();
        $.ajax({
            type: "post",
            url: _ajax.url.system.user.update,
            dataType: "json",
            data: {
                id: ${user.id},
                username: editUserName,
                realName: editRealName,
                idCard: editIdCard,
                phone: editPhone,
                roleId: editRole,
            },
            success: function (data) {
                if (data.code) {
                    // 提示信息
                    alert('修改成功');
                    location.reload(true);
                }
                else {
                    alert('修改失败');
                }
            },
            error: function () {
                console.log("获取JSON数据异常");
            }
        })
    });
</script>