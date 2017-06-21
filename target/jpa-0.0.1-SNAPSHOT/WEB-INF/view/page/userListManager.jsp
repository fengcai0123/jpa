<%--
  Created by IntelliJ IDEA.
  User: yonghuo.chen
  Date: 17/6/1
  Time: 下午2:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<head>
    <title>Title</title>
</head>
<body>
        <table border="1" cellpadding="10" cellspacing="0">

            <tr>
                <%--<th>用户ID</th>--%>
                <th>用户名</th>
                <th>密 码</th>
                <th>手机号</th>
                <th>nicekName</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${userList}" var="user">
                <tr>

                    <td>${user.username}</td>
                    <td>${user.password}</td>
                    <td>${user.mobile}</td>
                    <td>${user.nickName}</td>
                    <td>
                        <a href="/user/${user.id}/edit">编辑</a>
                        <a href="/user/delete?id=${user.id}">删除</a>
                        <a href="/user/input">添加用户</a>
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="8">
                    共 ${page.totalElements} 条记录
                    共 ${page.totalPages} 页
                    当前 ${page.number + 1 } 页
                    <a href="?pageNo=${page.number + 1 - 1}">上一页</a>
                    <a href="?pageNo=${page.number + 1 + 1}">下一页</a>
                </td>
            </tr>
        </table>
</body>
</html>
