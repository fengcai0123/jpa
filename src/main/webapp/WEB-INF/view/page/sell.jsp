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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css">
    <script src="${pageContext.request.contextPath}/assets/js/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="main">
        <div><span class="h1 title">根据商品Asin查销量</span></div>

        <div><form class="form" action="/sell/list"><span class="label-info" >输入Asin:</span><input type="text" name="asin" /> <input type="submit" value="查询"/></form></div>
        <table class="table table-responsive table-bordered">
            <thead>
                <th>序号</th>
                <th>日期</th>
                <th>销量</th>
            </thead>
            <tbody>
            <c:forEach items="${sellList}" var="item" varStatus="status">
                <tr>
                    <td>${status.index+1}</td>
                    <td>${item.date}</td>
                    <td>${item.sellNum}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </div>
</body>
</html>
