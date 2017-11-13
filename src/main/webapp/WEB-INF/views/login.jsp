<%--
  Created by IntelliJ IDEA.
  User: 石昊
  Date: 2017/11/8
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <title>登录页面</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Fonts -->
    <jsp:include page="common/link.jsp"/>
</head>

<body class="flat-green">
<div class="pen-title">
    <h2>爱吃网管理系统</h2>
</div>
<!-- Form Module-->
<div class="module form-module">
    <div class="form">
        <form action="${website}/login" method="post">
            <div  class="form-group">
                <label for="username">用户名</label>
                <input type="text" class="form-control" name="username" id="username" placeholder="请输入用户名" />
            </div>
            <div class="form-group">
                <label for="password">密码</label>
                <input type="password" class="form-control" name="password" id="password" placeholder="请输入密码" />
            </div>
            <button role="button" class="btn btn-success" id="submit">登录</button>
        </form>
        <div>${msg}</div>
    </div>
    <div class="cta">
        <p>忘记密码请联系管理员</p>
    </div>
</div>
<jsp:include page="common/script.jsp"/>
<script type="text/javascript" src="../resources/js/user/login.js"></script>
</body>

</html>
