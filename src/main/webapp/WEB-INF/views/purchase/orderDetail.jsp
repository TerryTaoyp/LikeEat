<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        <span aria-hidden="true">&times;</span>
    </button>
    <h4 class="modal-title" id="myModalLabel">采购订单详情</h4>
</div>
<div class="modal-body">
    <form id="addOrder">
        <div class="form-group">
            <label for="order">订单号</label>
            <p id="order">201501233</p>
        </div>
        <div class="form-group">
            <label for="supplier">供货商</label>
            <p id="supplier">水果之家</p>
        </div>
        <div class="form-group">
            <label for="items">进货清单</label>
            <table class="table table-bordered table-striped" id="items">
                <tbody>
                <tr>
                    <th scope="row">商品名称</th>
                    <td><strong>商品进价</strong></td>
                    <td><strong>进货数量</strong></td>
                </tr>
                <tr>
                    <th scope="row">苹果</th>
                    <td>6元/斤</td>
                    <td>2斤</td>
                </tr>
                <tr>
                    <th scope="row">橘子</th>
                    <td>3元/斤</td>
                    <td>5斤</td>
                </tr>
                <tr>
                    <th scope="row">香蕉</th>
                    <td>7元/斤</td>
                    <td>10斤</td>
                </tr>
                <tr>
                    <th scope="row">梨</th>
                    <td>8元/斤</td>
                    <td>7斤</td>
                </tr>
                <tr>
                    <th scope="row">桃子</th>
                    <td>3元/斤</td>
                    <td>20斤</td>
                </tr>
                </tbody>
            </table>
        </div>
    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-success">导出</button>
    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
</div>