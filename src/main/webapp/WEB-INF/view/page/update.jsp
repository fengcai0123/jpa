<%--
  Created by IntelliJ IDEA.
  User: yonghuo.chen
  Date: 17/6/7
  Time: 下午2:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

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
    <div>
        <span class="h1">修改用户信息</span>
        <%--<sf:form method="post" modelAttribute="user" action="update">
        用户名:<sf:input path="username"/><sf:errors path="username"/>
        密码:<sf:input path="password"/><sf:errors path="password"/>
        手机:<sf:input path="mobile"/><sf:errors path="mobile"/>
        nickName:<sf:input path="nickName"/><sf:errors path="nickName"/>
        </sf:form>--%>
    </div>
    <form class="form" action="/user/update" method="post">
        <div class="form-group form-inline">
            用户名:<input class="form-control" hidden="hidden" type="text" name="id" value="${user.id}">
            用户名:<input class="form-control" type="text" name="username" value="${user.username}">
            密码:<input class="form-control" type="text" name="password" value="${user.password}">
        </div>
        <div class="form-group form-inline">
            手机:<input class="form-control" type="text" name="mobile" value="${user.mobile}">
            nickName:<input class="form-control" type="text" name="nickName" value="${user.nickName}">
        </div>
        <input type="submit" name="" value="修改">
    </form>
</div>
</div>
</body>
</html>
