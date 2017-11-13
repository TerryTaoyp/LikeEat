<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header>
    <nav class="navbar navbar-default navbar-fixed-top navbar-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-expand-toggle fa-rotate-90">
                    <i class="fa fa-bars icon"></i>
                </button>
                <ol class="breadcrumb navbar-breadcrumb">
                    <li class="active"></li>
                </ol>
                <button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
                    <i class="fa fa-th icon"></i>
                </button>
            </div>
            <ul class="nav navbar-nav navbar-right">
                <button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
                    <i class="fa fa-times icon"></i>
                </button>
                <li class="dropdown profile">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">您好：石昊 <span class="caret"></span></a>
                    <ul class="dropdown-menu animated fadeInDown">
                        <li>
                            <div class="profile-info">
                                <h4 class="username">${sessionScope.username}</h4>
                                <p>${sessionScope.role}</p>
                                <div class="btn-group margin-bottom-2x" role="group">
                                    <a role="button" class="btn btn-default" href="${website}/logout"><i class="fa fa-sign-out"></i> 退出登录</a>
                                </div>
                            </div>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
</header>
