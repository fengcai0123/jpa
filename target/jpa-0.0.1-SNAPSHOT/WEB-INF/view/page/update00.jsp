<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: yonghuo.chen
  Date: 17/6/7
  Time: 下午2:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/assets/js/jquery-3.2.1.min.js"/>
    <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"/>
</head>
<body>
<form action="/user/update"  method="post">
    <input type="text" name="ID" value="${user.id}" >
    <table>
        <tr>
            <th>账号</th>
            <td><input type="text" name="NAME" value="${user.username}" ></td>
        </tr>
        <tr>

            <th>密码</th>
            <td><input type="text" name="PASSWORD" value="${user.password}" ></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="修改"> </td>
        </tr>
    </table>
</form>
<%--<div>
        <div>
            <sf:form method="post" modelAttribute="user" action="update">
                用户名:<sf:input path="username"/><sf:errors path="username"/></sf:errors>
                密码:<sf:input path="password"/><sf:errors path="password"/></sf:errors>
                用户名:<sf:input path="username"/><sf:errors path="username"/></sf:errors>
                用户名:<sf:input path="username"/><sf:errors path="username"/></sf:errors>
            </sf:form>
        </div>
    <form class="form" >
        <div class="form-group form-inline">
            用户名:<input class="form-control" type="text" name="username" placeholder="${user.username}">
            密码:<input class="form-control" type="text" name="password" value="${user.password}">
         </div>
        <div>
            手机:<input class="form-control" type="text" name="mobile" value="${user.mobile}">
            nickName:<input class="form-control" type="text" name="nickName" value="${user.nickName}">
        </div>
        <input type="submit" name="" value="修改">
    </form>
    </div>
阿萨德弗兰克静安寺登录--%>
</body>
</html>
