<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yonghuo.chen
  Date: 17/6/7
  Time: 上午11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
list<div>
    <c:forEach items="${users}" var="user">
    <div>${user.username}</div>
    </c:forEach>
</body>
</html>
