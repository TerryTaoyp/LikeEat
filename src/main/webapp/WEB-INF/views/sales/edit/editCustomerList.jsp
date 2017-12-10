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
                <input type="text" class="form-control" id="editName" value="${customer.customerName}">
            </div>
            <div class="form-group col-lg-6">
                <label for="editTypeId">客户类别</label>
                <select class="form-control" id="editTypeId">
                    <option value="1">普通客户</option>
                    <option value="2">会员</option>
                    <option value="3">销售商</option>
                    <option value="4">代理商</option>
                </select>
            </div>
        </div>
        <div class="hidden" id="editSellerInfo">
            <div class="form-group">
                <label for="editSellerType">销售商类别</label>
                <select class="form-control" id="editSellerType">
                    <option>青铜会员</option>
                    <option>白银会员</option>
                    <option>黄金会员</option>
                    <option>白金会员</option>
                    <option>钻石会员</option>
                    <option>至尊会员</option>
                </select>
            </div>
        </div>
        <div class="hidden" id="editAgentInfo">
            <div class="form-group">
                <label for="editAgentType">销售商类别</label>
                <select class="form-control" id="editAgentType">
                    <option>青铜会员</option>
                    <option>白银会员</option>
                    <option>黄金会员</option>
                    <option>白金会员</option>
                    <option>钻石会员</option>
                    <option>至尊会员</option>
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
                <input type="text" class="form-control" id="editCompany" value="${customer.unitAddress}">
            </div>
            <div class="form-group col-lg-6">
                <label for="editAddr1">配送地址1</label>
                <input type="text" class="form-control" id="editAddr1" value="${customer.deliveryAddress1}" >
            </div>
        </div>
        <div class="row">
            <div class="form-group col-lg-6">
                <label for="editAddr2">配送地址2</label>
                <input type="text" class="form-control" id="editAddr2" value="${customer.deliveryAddress2}" >
            </div>
            <div class="form-group col-lg-6">
                <label for="editAddr3">配送地址3</label>
                <input type="text" class="form-control" id="editAddr3" value="${customer.deliveryAddress3}" >
            </div>
        </div>
        <div class="row">
            <div class="form-group col-lg-6">
                <label for="aliPay">支付宝账号</label>
                <input type="text" class="form-control" id="aliPay" value="${customer.alipay}" >
            </div>
            <div class="form-group col-lg-6">
                <label for="editPhone1">联系电话1</label>
                <input type="text" class="form-control" id="editPhone1" value="${customer.telephone1}">
            </div>
        </div>
        <div class="row">
            <div class="form-group col-lg-6">
                <label for="editPhone2">联系电话2</label>
                <input type="text" class="form-control" id="editPhone2" value="${customer.telephone2}" >
            </div>
            <div class="form-group col-lg-6">
                <label for="editPhone3">联系电话3</label>
                <input type="text" class="form-control" id="editPhone3" value="${customer.telephone3}" >
            </div>
        </div>
        <div class="form-group">
            <label for="editRemark">备注</label>
            <input type="text" class="form-control" id="editRemark" value="${customer.remark}">
        </div>
        <div class="form-group">
            <a class="btn btn-link" role="button" id="toEditBankInfo">
                <span class="fa fa-bank"></span> 编辑银行信息</a>
        </div>
        <div class="row hidden" id="editBankInfo">
            <div class="form-group col-lg-6">
                <label for="editAccount">银行卡号</label>
                <input type="text" class="form-control" id="editAccount" value="${customer.bankNum}">
            </div>
            <div class="form-group col-lg-6">
                <label for="editBank">银行名称</label>
                <input type="text" class="form-control" id="editBank" value="${customer.bankName}">
            </div>
        </div>
        <div class="form-group">
            <a class="btn btn-link" role="button" id="toEditContact">
                <span class="fa fa-phone"></span> 编辑其他联系信息</a>
        </div>
        <div class="hidden" id="contact">
            <div class="row">
                <div class="form-group col-lg-6">
                    <label for="editQq">QQ号</label>
                    <input type="text" class="form-control" id="editQq" value="${customer.qq}" >
                </div>
                <div class="form-group col-lg-6">
                    <label for="editWeChat">微信号</label>
                    <input type="text" class="form-control" id="editWeChat" value="${customer.weChat}">
                </div>
            </div>
            <div class="row">
                <div class="form-group col-lg-6">
                    <label for="editMail1">邮箱1</label>
                    <input type="text" class="form-control" id="editMail1" value="${customer.email1}" >
                </div>
                <div class="form-group col-lg-6">
                    <label for="editMail2">邮箱2</label>
                    <input type="text" class="form-control" id="editMail2" value="${customer.email2}" >
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
    var editVipDisplay = false;
    var editBankInfoDisplay = false;
    var editContactDisplay = false;
    var editSellerDisplay = false;
    var editAgentDisplay = false;
    $("#editTypeId").change(function () {
        if($("#editTypeId").select().val()=="2"&&editVipDisplay==false){
            $("#editVipInfo").removeClass('hidden');
            editVipDisplay=true;
            if(editSellerDisplay==true){
                $("#editSellerInfo").addClass('hidden');
                editSellerDisplay=false;
            }
            if(editAgentDisplay==true){
                $("#agentInfo").addClass('hidden');
                editAgentDisplay=false;
            }
        }else if($("#typeId").select().val()!="3"&&editSellerDisplay==false){
            $("#editSellerInfo").removeClass('hidden');
            editSellerDisplay=true;
            if(editVipDisplay==true){
                $("#vipInfo").addClass('hidden');
                editVipDisplay=false;
            }
            if(editAgentDisplay==true){
                $("#agentInfo").addClass('hidden');
                editAgentDisplay=false;
            }
        }else if($("#typeId").select().val()!="4"&&editAgentDisplay==false){
            $("#agentInfo").removeClass('hidden');
            editAgentDisplay=true;
            if(editVipDisplay==true){
                $("#vipInfo").addClass('hidden');
                editVipDisplay=false;
            }
            if(editSellerDisplay==true){
                $("#agentInfo").addClass('hidden');
                editSellerDisplay=false;
            }
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
    });

    $("#editSubmit").click(function () {
        var editName = $("#editName").val();
        var editTypeId = $("#editTypeId").select().val();
        var editCompany = $("#editCompany").val();
        var editAddr1 = $("#editAddr1").val();
        var editAddr2 = $("#editAddr2").val();
        var editAddr3 = $("#editAddr3").val();
        var editPhone1 = $("#editPhone1").val();
        var editPhone2 = $("#editPhone2").val();
        var editPhone3 = $("#editPhone3").val();
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
        var editMail1 = $("#editMail1").val();
        var editMail2 = $("#editMail2").val();
        if(editVipDisplay==true){
            var editTypeId2 = $("#editLevel");
        }else if(editAgentDisplay==true){
            var editTypeId2 = $("#editAgentType");
        }else if(editSellerDisplay==true){
            var editTypeId2 = $("#editSellerType");
        }else{
            var editTypeId2 = -1;
        }
        $.ajax({
            type:"post",
            url:_ajax.url.sale.customerList.update,
            dataType:"json",
            data:{
                id:${customer.id},
                customerName:editName,
                customerType:editTypeId,
                unitAddress:editCompany,
                deliveryAddress1:editAddr1,
                deliveryAddress2:editAddr2,
                deliveryAddress3:editAddr3,
                telephone1:editPhone1,
                telephone2:editPhone2,
                telephone3:editPhone3,
                qq:editQq,
                wechat:editWeChat,
                alipay:editAliPay,
                bankName:editBank,
                bankNum:editAccount,
                email1:editMail1,
                email2:editMail2,
                customerTypeId2:editTypeId2,
                remark:editRemark,
                level:editLevel,
                sex:editSex,
                cardId:editCardId,
                birth:editBirth,
                idNumber:editIdNumber
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