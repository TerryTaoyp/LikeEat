<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="side-menu sidebar-inverse">
    <nav class="navbar navbar-default" role="navigation">
        <div class="side-menu-container">
            <div class="navbar-header">
                <a class="navbar-brand" href="/views/index.html">
                    <div class="icon fa fa-paper-plane"></div>
                    <div class="title">爱&nbsp;吃&nbsp;网</div>
                </a>
                <button type="button" class="navbar-expand-toggle pull-right visible-xs">
                    <i class="fa fa-times icon"></i>
                </button>
            </div>
            <ul class="nav navbar-nav">
                <li class="panel panel-default dropdown">
                    <a data-toggle="collapse" href="#dropdown-element">
                        <span class="icon glyphicon glyphicon-home"></span><span class="title">系统管理</span>
                    </a>
                    <!-- Dropdown level 1 -->
                    <div id="dropdown-element" class="panel-collapse collapse">
                        <div class="panel-body">
                            <ul class="nav navbar-nav">
                                <li><a href="#">数据库导入</a>
                                </li>
                                <li><a href="#">数据库导出</a>
                                </li>
                                <li><a href="${website}/role/list">角色管理</a>
                                </li>
                                <li><a href="${website}/user/list">用户管理</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>
                <li class="panel panel-default dropdown">
                    <a data-toggle="collapse" href="#dropdown-table">
                        <span class="icon glyphicon glyphicon-th-large"></span><span class="title">商品管理</span>
                    </a>
                    <!-- Dropdown level 1 -->
                    <div id="dropdown-table" class="panel-collapse collapse">
                        <div class="panel-body">
                            <ul class="nav navbar-nav">
                                <li><a href="${website}/goods/type/list">商品类别列表</a>
                                </li>
                                <li><a href="${website}/goods/list">商品基本信息</a>
                                </li>
                                <li><a href="${website}/price/list">商品价格参数</a>
                                </li>
                                <li><a href="${website}/goods/price/dto/list">商品价格信息</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>
                <li class="panel panel-default dropdown">
                    <a data-toggle="collapse" href="#dropdown-form">
                        <span class="icon glyphicon glyphicon-gift"></span><span class="title">采购管理</span>
                    </a>
                    <!-- Dropdown level 1 -->
                    <div id="dropdown-form" class="panel-collapse collapse">
                        <div class="panel-body">
                            <ul class="nav navbar-nav">
                                <li><a href="${website}/supplier/type/list">供货商家类别管理</a>
                                </li>
                                <li><a href="${website}/supplier/list">供货商家信息管理</a>
                                </li>
                                <li><a href="/views/purchase/purchaseOrderList.html">采购订单管理</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>

                <!-- Dropdown-->
                <li class="panel panel-default dropdown">
                    <a data-toggle="collapse" href="#component-example">
                        <span class="icon glyphicon glyphicon-usd"></span><span class="title">销售管理</span>
                    </a>
                    <!-- Dropdown level 1 -->
                    <div id="component-example" class="panel-collapse collapse">
                        <div class="panel-body">
                            <ul class="nav navbar-nav">
                                <li><a href="/views/sales/customer/customerType.html">客户类别信息管理</a>
                                </li>
                                <li><a href="/views/sales/customer/customerList.html">客户基本信息管理</a>
                                </li>
                                <li><a href="/views/sales/salesOrderList.html">销售订单管理</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>
                <!-- Dropdown-->
                <li class="panel panel-default dropdown">
                    <a data-toggle="collapse" href="#dropdown-example">
                        <span class="icon glyphicon glyphicon-search"></span><span class="title">查询管理</span>
                    </a>
                    <!-- Dropdown level 1 -->
                    <div id="dropdown-example" class="panel-collapse collapse">
                        <div class="panel-body">
                            <ul class="nav navbar-nav">
                                <li><a href="/views/query/inQuery.html">入库查询</a>
                                </li>
                                <li><a href="/views/query/outQuery.html">出库查询</a>
                                </li>
                                <li><a href="/views/query/stockQuery.html">库存查询</a>
                                </li>
                                <li><a href="/views/query/profitsQuery.html#">利润查询</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </nav>
</div>