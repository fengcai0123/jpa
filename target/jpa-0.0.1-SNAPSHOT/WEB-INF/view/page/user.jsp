<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yonghuo.chen
  Date: 17/6/7
  Time: 上午10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form class="form" action="/user/user" method="get">
        <div class="form-control form-inline">
        <input type="text" name="id" value="">
        <input type="submit" value="查询">
        </div>
    </form>
 <div>
     <div>Id:${user.id}</div>
     <div>用户名:${user.username}</div>
     <div>密码:${user.password}</div>
     <div>nickName:${user.nickName}</div>
</div>
</body>
</html>
