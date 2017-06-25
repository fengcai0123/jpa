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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css">
    <script src="${pageContext.request.contextPath}/assets/js/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
    <script>
        function add() {

            var asin=$("#asin").val();
            var brank=$("#brank").val();
            var disPatching=$("#disPatching").val();
            var imgUrl=$("#imgUrl").val();
            var name=$("#name").val();
            var rankNum=$("#rankNum").val();
            var sellerName=$("#sellerName").val();
            var size=$("#size").val();
            var totalSellNum=$("#totalSellNum").val();
            var weight=$("#weight").val();
            var transportWeight=$("#transportWeight").val();
            var bsrNum=$("#bsrNum").val();
            var commentScore=$("#commentScore").val();
            var totalCommentNum=$("#totalCommentNum").val();
            var fiveStar=$("#fiveStar").val();
            var fourStar=$("#fourStar").val();
            var threeStar=$("#threeStar").val();
            var twoStar=$("#twoStar").val();
            var oneStar=$("#oneStar").val();
            var inventoryNum=$("#inventoryNum").val();
            var sellPrice=$("#sellPrice").val();
            var shopPrice=$("#shopPrice").val();
            var sellNum=$("#sellNum").val();
            var saleTime=$("#saleTime").val();
            var standard=$("#standard").val();
            var color=$("#color").val();
            var answerNum=$("#answerNum").val();

            var result_={"asin":asin ,"brank":brank ,"disPatching":disPatching ,"imgUrl": imgUrl,"name": name,
            "rankNum":rankNum ,"sellerName": sellerName,"size":size ,"totalSellNum":totalSellNum ,"weight":weight,
                "transportWeight": transportWeight,"bsrNum":bsrNum ,"commentScore":commentScore ,"totalCommentNum": totalCommentNum,
                "fiveStar":fiveStar ,"fourStar":fourStar ,"threeStar":threeStar ,"twoStar": twoStar,"oneStar":oneStar ,
                "inventoryNum":inventoryNum ,"sellPrice": sellPrice, "shopPrice":shopPrice  ,"sellNum":sellNum,
                "saleTime":saleTime,"standard":standard,"color":color,"answerNum":answerNum};

            var resultList_=[{"asin":asin ,"brank":brank ,"disPatching":disPatching ,"imgUrl": imgUrl,"name": name,
            "rankNum":rankNum ,"sellerName": sellerName,"size":size ,"totalSellNum":totalSellNum ,"weight":weight,
                "transportWeight": transportWeight,"bsrNum":bsrNum ,"commentScore":commentScore ,"totalCommentNum": totalCommentNum,
                "fiveStar":fiveStar ,"fourStar":fourStar ,"threeStar":threeStar ,"twoStar": twoStar,"oneStar":oneStar ,
                "inventoryNum":inventoryNum ,"sellPrice": sellPrice, "shopPrice":shopPrice  ,"sellNum":sellNum,
                "saleTime":saleTime,"standard":standard,"color":color,"answerNum":answerNum},
                {"asin":asin ,"brank":brank ,"disPatching":disPatching ,"imgUrl": imgUrl,"name": name,
            "rankNum":rankNum ,"sellerName": sellerName,"size":size ,"totalSellNum":totalSellNum ,"weight":weight,
                "transportWeight": transportWeight,"bsrNum":bsrNum ,"commentScore":commentScore ,"totalCommentNum": totalCommentNum,
                "fiveStar":fiveStar ,"fourStar":fourStar ,"threeStar":threeStar ,"twoStar": twoStar,"oneStar":oneStar ,
                "inventoryNum":inventoryNum ,"sellPrice": sellPrice, "shopPrice":shopPrice  ,"sellNum":sellNum,
                    "saleTime":saleTime,"standard":standard,"color":color,"answerNum":answerNum},
                {"asin":asin ,"brank":brank ,"disPatching":disPatching ,"imgUrl": imgUrl,"name": name,
            "rankNum":rankNum ,"sellerName": sellerName,"size":size ,"totalSellNum":totalSellNum ,"weight":weight,
                "transportWeight": transportWeight,"bsrNum":bsrNum ,"commentScore":commentScore ,"totalCommentNum": totalCommentNum,
                "fiveStar":fiveStar ,"fourStar":fourStar ,"threeStar":threeStar ,"twoStar": twoStar,"oneStar":oneStar ,
                "inventoryNum":inventoryNum ,"sellPrice": sellPrice, "shopPrice":shopPrice  ,"sellNum":sellNum,
                    "saleTime":saleTime,"standard":standard,"color":color,"answerNum":answerNum},
                {"asin":asin ,"brank":brank ,"disPatching":disPatching ,"imgUrl": imgUrl,"name": name,
            "rankNum":rankNum ,"sellerName": sellerName,"size":size ,"totalSellNum":totalSellNum ,"weight":weight,
                "transportWeight": transportWeight,"bsrNum":bsrNum ,"commentScore":commentScore ,"totalCommentNum": totalCommentNum,
                "fiveStar":fiveStar ,"fourStar":fourStar ,"threeStar":threeStar ,"twoStar": twoStar,"oneStar":oneStar ,
                "inventoryNum":inventoryNum ,"sellPrice": sellPrice, "shopPrice":shopPrice  ,"sellNum":sellNum,
                    "saleTime":saleTime,"standard":standard,"color":color,"answerNum":answerNum},
                {"asin":asin ,"brank":brank ,"disPatching":disPatching ,"imgUrl": imgUrl,"name": name,
            "rankNum":rankNum ,"sellerName": sellerName,"size":size ,"totalSellNum":totalSellNum ,"weight":weight,
                "transportWeight": transportWeight,"bsrNum":bsrNum ,"commentScore":commentScore ,"totalCommentNum": totalCommentNum,
                "fiveStar":fiveStar ,"fourStar":fourStar ,"threeStar":threeStar ,"twoStar": twoStar,"oneStar":oneStar ,
                "inventoryNum":inventoryNum ,"sellPrice": sellPrice, "shopPrice":shopPrice  ,"sellNum":sellNum,
                    "saleTime":saleTime,"standard":standard,"color":color,"answerNum":answerNum}];
            $.ajax({
                type:"POST",
                url:'${pageContext.request.contextPath}/data/addJson',
                dataType:'text',
                contentType:'application/json;charset=UTF-8',
                /*data:JSON.stringify(result_),*/
                data:JSON.stringify(result_),
                success:function (data) {

                },
                error:function (textStatus,errorThrown) {
                    alert(textStatus);
                }

            })

        }
    </script>
</head>
<body>
    <div class="main">
        <div class="h2 text-left ">先根据Asin判断,如果返回0,说明数据库没有改商品,进行首次添加,如果返回其他数字,说明已有,则进行日常商品更新</div>
        <div><form class="form" action="${pageContext.request.contextPath}/data/findAsin">
            <span class="label-info" >输入Asin:</span>
            <input type="text" name="asin" />
            <input type="submit" value="查询"/>
        </form>
        </div>
        <div class="h1"></div>
        <div><span class="h1 title">首次添加商品</span></div>
        <div class="h1"></div>
        <div class="table-bordered input-group-addon ">
            <%--<form class="form " action="${pageContext.request.contextPath}/data/add" method="post">--%>
            <form class="form " action="${pageContext.request.contextPath}/data/addJson" method="post">
                <div class="form-group  form-inline">
                    Asin:<input type="text" id="asin" name="asin">
                    品牌:<input type="text" id="brank" name="brank">
                    配送:<input type="text" id="disPatching" name="disPatching">
                    图片url:<input type="text" id="imgUrl" name="imgUrl">
                    规格:<input type="text" id="standard" name="standard">
                </div>
                <div class="form-group   form-inline">
                    标题:<input type="text" id="name" name="name">
                    排名:<input type="text" id="rankNum" name="rankNum">
                    店家:<input type="text" id="sellerName" name="sellerName">
                    尺寸:<input type="text" id="size" name="size">
                    颜色:<input type="text" id="color" name="color">
                </div>
                <div class="form-group   form-inline">
                    总销量:<input type="text" id="totalSellNum" name="totalSellNum">
                    重量:<input type="text"   id="weight" name="weight">
                    运输重量:<input type="text" id="transportWeight" name="transportWeight">
                    上架时间:<input type="text" id="saleTime" name="saleTime">
                    问题回答数:<input type="text" id="answerNum" name="answerNum">
                </div>

                <div class="form-group  form-inline">
                    BSR:<input type="text" id="bsrNum" name="bsrNum">
                    评分:<input type="text" id="commentScore" name="commentScore">
                    总评论数:<input type="text" id="totalCommentNum" name="totalCommentNum">
                    五星:<input type="text" id="fiveStar" name="fiveStar">
                </div>
                <div class="form-group   form-inline">
                    四星:<input type="text" id="fourStar" name="fourStar">
                    三星:<input type="text" id="threeStar" name="threeStar">
                    两星:<input type="text" id="twoStar" name="twoStar">
                    一星:<input type="text" id="oneStar" name="oneStar">
                </div>
                <div class="form-group   form-inline">
                    库存数:<input type="text" id="inventoryNum" name="inventoryNum">
                    促销价:<input type="text" id="sellPrice" name="sellPrice">
                    原价:<input type="text" id="shopPrice" name="shopPrice">
                    销量:<input type="text" id="sellNum" name="sellNum">
                </div>
                <%--<input type="submit" value="添加"--%>>
                <div><a href="javascript:add()">添加商品</a></div>
            </form>
        </div>
        <div class="h1"></div>
        <div class="update">
            <div><span class="h1 title">日常更新商品销量/库存/价格/排名等信息</span></div>
            <div class="h1"></div>
            <div class="table-bordered input-group-addon ">
                <form class="form " action="/data/update" method="post">
                    <div class="form-group  form-inline">
                        Asin:<input type="text" name="asin">
                        自然排名:<input type="text" name="rankNum">
                        总销量:<input type="text" name="totalSellNum">
                        BSR:<input type="text" name="bsrNum">
                    </div>
                    <div class="form-group form-inline">
                        评分:<input type="text" name="commentScore">
                        总评论数:<input type="text" name="totalCommentNum">
                        五星:<input type="text" name="fiveStar">
                    </div>
                    <div class="form-group   form-inline">
                        四星:<input type="text" name="fourStar">
                        三星:<input type="text" name="threeStar">
                        两星:<input type="text" name="twoStar">
                        一星:<input type="text" name="oneStar">
                    </div>
                    <div class="form-group   form-inline">
                        库存数:<input type="text" name="inventoryNum">
                        促销价:<input type="text" name="sellPrice">
                        原价:<input type="text" name="shopPrice">
                        销量:<input type="text" name="sellNum">
                    </div>
                    <input type="submit" value="更新">
                </form>
            </div>
        </div>
        <div class="h1"></div>

        <%--<div>
            <form class="form  form-inline " action="" method="post">
                第:<input type="text" name="pageNum">页
                    <input type="submit" value="查询">
            </form>
        </div>--%>

        <table class="table table-responsive table-bordered table-striped">
            <thead>
                <th>图片</th>
                <th>商品信息</th>
                <th>昨日销量</th>
                <th>BSR</th>
                <th>监控的卖家</th>
                <th>操作</th>
            </thead>
            <tbody>
            <c:forEach items="${goodList}" var="item" varStatus="status">
                <tr>
                    <td>${item.imgUrl}</td>
                    <td>
                        <br>${item.asin}</br>
                            ${item.name}
                    </td>
                    <td>${item.rankNum}</td>
                    <td>${item.sellerName}</td>
                    <td>${item.size}</td>
                    <td><a href="${pageContext.request.contextPath}/data/competitorDetail?asin=${item.asin}">查看详情</a></td>
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
