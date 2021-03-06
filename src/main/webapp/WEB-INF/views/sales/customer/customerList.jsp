<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>

<head>
    <title>客户基本信息管理</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Fonts -->
    <jsp:include page="../../common/link.jsp"/>
</head>

<body class="flat-green">
<div class="app-container expanded">
    <div class="row content-container">
        <jsp:include page="../../common/header.jsp"/>
        <jsp:include page="../../common/sidebar.jsp"/>
        <!-- Main Content -->
        <div class="container-fluid">
            <div class="side-body padding-top">
                <div class="row">
                    <div class="col-xs-12">
                        <div class="card">
                            <div class="card-header">
                                <div class="card-title">
                                    <div class="title">客户基本信息管理</div>
                                </div>
                            </div>
                            <div class="card-body">
                                <table class="datatable table table-striped" cellspacing="0" width="100%" id="list">
                                    <thead>
                                    <tr>
                                        <th>序号</th>
                                        <th>一级类别</th>
                                        <th>二级类别</th>
                                        <th>客户姓名</th>
                                        <th>客户单位名称</th>
                                        <th>联系方式</th>
                                        <th>备注</th>
                                        <th>操作</th>
                                        <th class="hidden"></th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${customerList}" var="cust" varStatus="statusC">
                                        <c:if test="${cust.customerTypeId == 1}">
                                            <tr>
                                                <td>${statusC.index+1}</td>
                                                <td>${customerTypeList[1].name}</td>
                                                <td>无</td>
                                                <td id="custName">${cust.customerName}</td>
                                                <td>${cust.unitAddress}</td>
                                                <td>${cust.telephone1}</td>
                                                <td>${cust.remark}</td>
                                                <td>
                                                    <button type="button" class="btn btn-success edit">修改</button>
                                                    <button type="button" class="btn btn-danger del">删除</button>
                                                </td>
                                                <td class="hidden" id="custId">${cust.id}</td>
                                            </tr>
                                        </c:if>
                                        <c:if test="${cust.customerTypeId == 2}">
                                            <c:forEach items="${vipList}" var="vip" varStatus="statusV">
                                                <c:if test="${cust.customerTypeId2 == vip.id}">
                                                    <tr>
                                                        <td>${statusC.index+1}</td>
                                                        <td>${customerTypeList[2].name}</td>
                                                        <td>${vip.name}</td>
                                                        <td id="custName">${cust.customerName}</td>
                                                        <td>${cust.unitAddress}</td>
                                                        <td>${cust.telephone1}</td>
                                                        <td>${cust.remark}</td>
                                                        <td>
                                                            <button type="button" class="btn btn-success edit">修改
                                                            </button>
                                                            <button type="button" class="btn btn-danger del">删除</button>
                                                        </td>
                                                        <td class="hidden" id="custId">${cust.id}</td>
                                                    </tr>
                                                </c:if>
                                            </c:forEach>
                                        </c:if>
                                        <c:if test="${cust.customerTypeId == 3}">
                                            <c:forEach items="${sellerList}" var="seller" varStatus="statusS">
                                                <c:if test="${cust.customerTypeId2 == seller.id}">
                                                    <tr>
                                                        <td>${statusC.index+1}</td>
                                                        <td>${customerTypeList[3].name}</td>
                                                        <td>${seller.name}</td>
                                                        <td id="custName">${cust.customerName}</td>
                                                        <td>${cust.unitAddress}</td>
                                                        <td>${cust.telephone1}</td>
                                                        <td>${cust.remark}</td>
                                                        <td>
                                                            <button type="button" class="btn btn-success edit">修改
                                                            </button>
                                                            <button type="button" class="btn btn-danger del">删除</button>
                                                        </td>
                                                        <td class="hidden" id="custId">${cust.id}</td>
                                                    </tr>
                                                </c:if>
                                            </c:forEach>
                                        </c:if>
                                        <c:if test="${cust.customerTypeId == 4}">
                                            <c:forEach items="${agentList}" var="agent" varStatus="statusA">
                                                <c:if test="${cust.customerTypeId2 == agent.id}">
                                                    <tr>
                                                        <td>${statusC.index+1}</td>
                                                        <td>${customerTypeList[4].name}</td>
                                                        <td>${agent.name}</td>
                                                        <td id="custName">${cust.customerName}</td>
                                                        <td>${cust.unitAddress}</td>
                                                        <td>${cust.telephone1}</td>
                                                        <td>${cust.remark}</td>
                                                        <td>
                                                            <button type="button" class="btn btn-success edit">修改
                                                            </button>
                                                            <button type="button" class="btn btn-danger del">删除</button>
                                                        </td>
                                                        <td class="hidden" id="custId">${cust.id}</td>
                                                    </tr>
                                                </c:if>
                                            </c:forEach>
                                        </c:if>
                                    </c:forEach>
                                    </tbody>
                                    <tfoot>
                                    <tr>
                                        <th>序号</th>
                                        <th>客户类别</th>
                                        <th>客户姓名</th>
                                        <th>客户单位名称</th>
                                        <th>联系方式</th>
                                        <th>备注</th>
                                        <th>操作</th>
                                        <th class="hidden"></th>
                                    </tr>
                                    </tfoot>
                                </table>
                            </div>
                        </div>
                        <a class="btn btn-success btn-add" data-toggle="modal" data-target="#modalAddCust"
                           role="button"> 添加</a>
                    </div>
                </div>
            </div>
            <jsp:include page="../../common/footer.jsp"/>
        </div>
    </div>
</div>
<div class="modal fade" id="modalAddCust" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">客户添加</h4>
            </div>
            <div class="modal-body">
                <form id="addCust">
                    <div class="row">
                        <div class="form-group col-lg-6">
                            <label for="name">客户姓名</label>
                            <input type="text" class="form-control" id="name" placeholder="请输入客户姓名">
                        </div>
                        <div class="form-group col-lg-6">
                            <label for="typeId">客户类别</label>
                            <select class="form-control" id="typeId">
                                <option value="1">普通客户</option>
                                <option value="2">会员</option>
                                <option value="3">销售商</option>
                                <option value="4">代理商</option>
                            </select>
                        </div>
                    </div>
                    <div class="hidden" id="sellerInfo">
                        <div class="form-group">
                            <label for="sellerType">销售商类别</label>
                            <select class="form-control" id="sellerType">
                                <option>青铜会员</option>
                                <option>白银会员</option>
                                <option>黄金会员</option>
                                <option>白金会员</option>
                                <option>钻石会员</option>
                                <option>至尊会员</option>
                            </select>
                        </div>
                    </div>
                    <div class="hidden" id="agentInfo">
                        <div class="form-group">
                            <label for="agentType">销售商类别</label>
                            <select class="form-control" id="agentType">
                                <option>青铜会员</option>
                                <option>白银会员</option>
                                <option>黄金会员</option>
                                <option>白金会员</option>
                                <option>钻石会员</option>
                                <option>至尊会员</option>
                            </select>
                        </div>
                    </div>
                    <div class="hidden" id="vipInfo">
                        <div class="row">
                            <div class="form-group col-lg-3">
                                <label for="level">会员等级</label>
                                <select class="form-control" id="level">
                                    <option>青铜会员</option>
                                    <option>白银会员</option>
                                    <option>黄金会员</option>
                                    <option>白金会员</option>
                                    <option>钻石会员</option>
                                    <option>至尊会员</option>
                                </select>
                            </div>
                            <div class="form-group col-lg-3">
                                <label for="sex">性别</label>
                                <input type="text" class="form-control" id="sex" placeholder="请输入会员性别">
                            </div>
                            <div class="form-group col-lg-6">
                                <label for="cardId">会员卡号</label>
                                <input type="text" class="form-control" id="cardId" placeholder="请输入会员卡号">
                            </div>
                        </div>
                        <div class="row">
                            <div class="form-group col-lg-6">
                                <label for="birth">出生日期</label>
                                <input type="date" class="form-control" id="birth" placeholder="请输入会员出生日期">
                            </div>
                            <div class="form-group col-lg-6">
                                <label for="idNumber">身份证号</label>
                                <input type="text" class="form-control" id="idNumber" placeholder="请输入会员身份证号">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-lg-6">
                            <label for="company">客户单位名称</label>
                            <input type="text" class="form-control" id="company" placeholder="请输入客户单位名称">
                        </div>
                        <div class="form-group col-lg-6">
                            <label for="addr1">配送地址1</label>
                            <input type="text" class="form-control" id="addr1" placeholder="请输入配送地址">
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-lg-6">
                            <label for="addr2">配送地址2</label>
                            <input type="text" class="form-control" id="addr2" placeholder="请输入客户单位名称">
                        </div>
                        <div class="form-group col-lg-6">
                            <label for="addr3">配送地址3</label>
                            <input type="text" class="form-control" id="addr3" placeholder="请输入配送地址">
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-lg-6">
                            <label for="aliPay">支付宝账号</label>
                            <input type="text" class="form-control" id="aliPay" placeholder="请输入客户支付宝账号">
                        </div>
                        <div class="form-group col-lg-6">
                            <label for="phone1">联系电话1</label>
                            <input type="text" class="form-control" id="phone1" placeholder="请输入客户联系电话">
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-lg-6">
                            <label for="phone2">联系电话2</label>
                            <input type="text" class="form-control" id="phone2" placeholder="请输入客户联系电话">
                        </div>
                        <div class="form-group col-lg-6">
                            <label for="phone3">联系电话3</label>
                            <input type="text" class="form-control" id="phone3" placeholder="请输入客户联系电话">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="remark">备注</label>
                        <input type="text" class="form-control" id="remark" placeholder="请输入客户备注">
                    </div>
                    <div class="form-group">
                        <a class="btn btn-link" role="button" id="addBankInfo">
                            <span class="fa fa-bank"></span> 添加银行信息</a>
                    </div>
                    <div class="row hidden" id="bankInfo">
                        <div class="form-group col-lg-6">
                            <label for="account">银行卡号</label>
                            <input type="text" class="form-control" id="account" placeholder="请输入客户银行卡号">
                        </div>
                        <div class="form-group col-lg-6">
                            <label for="bank">银行名称</label>
                            <input type="text" class="form-control" id="bank" placeholder="请输入客户银行卡所在银行名称">
                        </div>
                    </div>
                    <div class="form-group">
                        <a class="btn btn-link" role="button" id="addContact">
                            <span class="fa fa-phone"></span> 添加其他联系信息</a>
                    </div>
                    <div class="hidden" id="contact">
                        <div class="row">
                            <div class="form-group col-lg-6">
                                <label for="qq">QQ号</label>
                                <input type="text" class="form-control" id="qq" placeholder="请输入客户QQ号">
                            </div>
                            <div class="form-group col-lg-6">
                                <label for="weChat">微信号</label>
                                <input type="text" class="form-control" id="weChat" placeholder="请输入客户微信号">
                            </div>
                        </div>
                        <div class="row">
                            <div class="form-group col-lg-6">
                                <label for="mail1">邮箱1</label>
                                <input type="text" class="form-control" id="mail1" placeholder="请输入客户邮箱">
                            </div>
                            <div class="form-group col-lg-6">
                                <label for="mail2">邮箱2</label>
                                <input type="text" class="form-control" id="mail2" placeholder="请输入客户邮箱">
                            </div>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-success" id="addSubmit">提交</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="modalEditCust" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
        </div>
    </div>
</div>
<jsp:include page="../../common/script.jsp"/>
<script type="text/javascript" src="${staticWebsite}/js/sales/customerList.js"></script>
</body>

</html>