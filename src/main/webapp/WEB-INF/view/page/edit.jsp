<%--
  Created by IntelliJ IDEA.
  User: yonghuo.chen
  Date: 17/6/7
  Time: 下午2:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        String path=request.getContextPath();
    %>
    <title>Title</title>
    <%--<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
   --%>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css">

    <script src="${pageContext.request.contextPath}/assets/js/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>

    <%--<script src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
        <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    --%>
    <script type="text/javascript">
        function addUser() {
            var form=document.getElementById("add_form");
            form.action="/user/add";
            form.method="post";
            form.submit();
        }
    </script>
</head>
<body>
<div>
    <span class="h1">添加用户</span>
</div>
<div>
    <form class="form" action="" id="add_form">
        <div class="form-group form-inline">
            用户名:<input type="text" name="username" >
            密码:<input type="text" name="password" >
        </div>
        <div class="form-group form-inline">
            手机号:<input type="text" name="mobile" >
            nicekName:<input type="text" name="nicekName" >
        </div>
        <div class="form-group">
            <input type="button" value="添加" onclick="addUser()"></input>
        </div>
    </form>
</div>
</body>
</html>
