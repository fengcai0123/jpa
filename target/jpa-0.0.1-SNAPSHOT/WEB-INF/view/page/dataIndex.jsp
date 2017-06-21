<%--
  Created by IntelliJ IDEA.
  User: yonghuo.chen
  Date: 17/6/1
  Time: 下午2:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<head>
    <%
        String path=request.getContextPath();
    %>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/assets/js/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
</head>
<body>
    <div>
        <div>
            <form class="form  form-inline " action="/data/good" method="post">
                Asin:<input type="text" name="asin">
                品牌:<input type="text" name="brank">
                商品名称:<input type="text" name="name">
                <input type="submit" value="添加">
            </form>
        </div>
        <div>
            <form class="form  form-inline " action="" method="post">
                第:<input type="text" name="pageNum">页
                    <input type="submit" value="查询">
            </form>
        </div>
        <table class="table table-responsive table-bordered">
            <thead>
                <th>序号</th>
                <th>Asin</th>
                <th>产品名称</th>
                <th>价格</th>
                <th>店名</th>
                <th>评论数</th>
                <th>广告数</th>
                <th>畅销数</th>
            </thead>
            <tbody>
            <c:forEach items="${dataList}" var="item" varStatus="status">
                <tr>
                    <td>${status.index+1}</td>
                    <td>${item.asin}</td>
                    <td>${item.titleStr}</td>
                    <td>${item.price}</td>
                    <td>${item.sellerName}</td>
                    <td>${item.customerReviews}</td>
                    <td>${item.adNum}</td>
                    <td>${item.bestNum}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </div>
        <%--<table border="1" cellpadding="10" cellspacing="0">

            <tr>
                &lt;%&ndash;<th>用户ID</th>&ndash;%&gt;
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
        </table>--%>
</body>
</html>
