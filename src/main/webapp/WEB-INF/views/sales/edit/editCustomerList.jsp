<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        <span aria-hidden="true">&times;</span>
    </button>
    <h4 class="modal-title" id="myModalLabel">客户编辑</h4>
</div>
<div class="modal-body">
    <form>
        <div class="row">
            <div class="form-group col-lg-6">
                <label for="editName">客户姓名</label>
                <input type="text" class="form-control" id="editName" placeholder="请输入客户姓名">
            </div>
            <div class="form-group col-lg-6">
                <label for="editTypeId">客户类别</label>
                <select class="form-control" id="editTypeId">
                    <option>代理商</option>
                    <option>销售商</option>
                    <option>会员</option>
                    <option>普通客户</option>
                </select>
            </div>
        </div>
        <div class="hidden" id="editVipInfo">
            <div class="row">
                <div class="form-group col-lg-3">
                    <label for="editLevel">会员等级</label>
                    <select class="form-control" id="editLevel">
                        <option>青铜会员</option>
                        <option>白银会员</option>
                        <option>黄金会员</option>
                        <option>白金会员</option>
                        <option>钻石会员</option>
                        <option>至尊会员</option>
                    </select>
                </div>
                <div class="form-group col-lg-3">
                    <label for="editSex">性别</label>
                    <input type="text" class="form-control" id="editSex" placeholder="请输入会员性别">
                </div>
                <div class="form-group col-lg-6">
                    <label for="editCardId">会员卡号</label>
                    <input type="text" class="form-control" id="editCardId" placeholder="请输入会员卡号">
                </div>
            </div>
            <div class="row">
                <div class="form-group col-lg-6">
                    <label for="editBirth">出生日期</label>
                    <input type="date" class="form-control" id="editBirth" placeholder="请输入会员出生日期">
                </div>
                <div class="form-group col-lg-6">
                    <label for="editIdNumber">身份证号</label>
                    <input type="text" class="form-control" id="editIdNumber" placeholder="请输入会员身份证号">
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-lg-6">
                <label for="editCompany">客户单位名称</label>
                <input type="text" class="form-control" id="editCompany" placeholder="请输入客户单位名称">
            </div>
            <div class="form-group col-lg-6">
                <label for="editAddr">配送地址</label>
                <input type="text" class="form-control" id="editAddr" placeholder="请输入配送地址">
            </div>
        </div>
        <div class="row">
            <div class="form-group col-lg-6">
                <label for="editPhone">联系电话</label>
                <input type="text" class="form-control" id="editPhone" placeholder="请输入客户联系电话">
            </div>
            <div class="form-group col-lg-6">
                <label for="editAliPay">支付宝账号</label>
                <input type="text" class="form-control" id="editAliPay" placeholder="请输入客户支付宝账号">
            </div>
        </div>
        <div class="form-group">
            <label for="editRemark">备注</label>
            <input type="text" class="form-control" id="editRemark" placeholder="请输入客户备注">
        </div>
        <div class="form-group">
            <a class="btn btn-link" role="button" id="toEditBankInfo">
                <span class="fa fa-bank"></span> 编辑银行信息</a>
        </div>
        <div class="row hidden" id="editBankInfo">
            <div class="form-group col-lg-6">
                <label for="editAccount">银行卡号</label>
                <input type="text" class="form-control" id="editAccount" placeholder="请输入客户银行卡号">
            </div>
            <div class="form-group col-lg-6">
                <label for="editBank">银行名称</label>
                <input type="text" class="form-control" id="editBank" placeholder="请输入客户银行卡所在银行名称">
            </div>
        </div>
        <div class="form-group">
            <a class="btn btn-link" role="button" id="toEditContact">
                <span class="fa fa-phone"></span> 编辑其他联系信息</a>
        </div>
        <div class="row hidden" id="editContact">
            <div class="form-group col-lg-4">
                <label for="editQq">QQ号</label>
                <input type="text" class="form-control" id="editQq" placeholder="请输入客户QQ号">
            </div>
            <div class="form-group col-lg-4">
                <label for="editWeChat">微信号</label>
                <input type="text" class="form-control" id="editWeChat" placeholder="请输入客户微信号">
            </div>
            <div class="form-group col-lg-4">
                <label for="editMail">邮箱</label>
                <input type="text" class="form-control" id="editMail" placeholder="请输入客户邮箱">
            </div>
        </div>
    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-success" id="editSubmit">提交</button>
    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
</div>
<script>
    var editVipDisplay = false;
    var editBankInfoDisplay = false;
    var editContactDisplay = false;
    $("#editTypeId").change(function () {
        if ($("#editTypeId").select().val() == "会员" && editVipDisplay == false) {
            $("#editVipInfo").removeClass('hidden');
            editVipDisplay = true;
        } else if ($("#editTypeId").select().val() != "会员" && editVipDisplay == true) {
            $("#editVipInfo").addClass('hidden');
            editVipDisplay = false;
        }
    });

    $("#toEditBankInfo").click(function () {
        if (editBankInfoDisplay == false) {
            $("#editBankInfo").removeClass('hidden');
            editBankInfoDisplay = true;
        } else {
            $("#editBankInfo").addClass('hidden');
            editBankInfoDisplay = false;
        }
    });

    $("#toEditContact").click(function () {
        if (editContactDisplay == false) {
            $("#editContact").removeClass('hidden');
            editContactDisplay = true;
        } else {
            $("#editContact").addClass('hidden');
            editContactDisplay = false;
        }
    })

    $("#editSubmit").click(function () {
        var editName = $("#editName").val();
        var editTypeId = $("#editTypeId").select().val();
        var editCompany = $("#editCompany").val();
        var editAddr = $("#editAddr").val();
        var editPhone = $("#editPhone").val();
        var editAliPay = $("#editAliPay").val();
        var editRemark = $("#editRemark").val();
        var editLevel = $("#editLevel").select().val();
        var editSex = $("#editSex").val();
        var editCardId = $("#editCardId").val();
        var editBirth = $("#editBirth").val();
        var editIdNumber = $("#editIdNumber").val();
        var editAccount = $("#editAccount").val();
        var editBank = $("#editBank").val();
        var editQq = $("#editQq").val();
        var editWeChat = $("#editWeChat").val();
        var editMail = $("#editMail").val();
        alert(editName + editTypeId + editCompany + editAddr + editPhone + editAliPay + editRemark + editLevel + editSex + editCardId + editBirth + editIdNumber + editAccount + editBank + editQq + editWeChat + editMail);
    });
</script>