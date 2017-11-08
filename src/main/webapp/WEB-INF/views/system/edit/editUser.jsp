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
                <label for="editUserName">姓名</label>
                <input type="text" class="form-control" id="editUserName" placeholder="请输入用户姓名">
            </div>
            <div class="form-group col-lg-6">
                <label for="editPhone">电话</label>
                <input type="text" class="form-control" id="editPhone" placeholder="请输入电话号码">
            </div>
        </div>
        <div class="row">
            <div class="form-group col-lg-4">
                <label for="oldPassword">原密码</label>
                <input type="password" class="form-control" id="oldPassword" placeholder="请输入原密码">
            </div>
            <div class="form-group col-lg-4">
                <label for="editPassword">新密码</label>
                <input type="password" class="form-control" id="editPassword" placeholder="请输入新密码">
            </div>
            <div class="form-group col-lg-4">
                <label for="re-editPassword">重复密码</label>
                <input type="password" class="form-control" id="re-editPassword" placeholder="请再一次输入新密码">
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
    $("#editSubmit").click(function () {

        var editUserName = $("#editUserName").val();
        var editPhone = $("#editPhone").val();
        var oldPassword = $("#oldPassword").val();
        var editPassword = $("#editPassword").val();
        var re_editPassword = $("#re-editPassword").val();
        var editRole = $("[name='editRole']").filter(":checked").val();
        alert(editUserName + "+" + editPhone + "+" + oldPassword + "+" + editPassword + "+" + re_editPassword + "+" + editRole);
    });
</script>