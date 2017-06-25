<%--
  Created by IntelliJ IDEA.
  User: yonghuo.chen
  Date: 17/6/1
  Time: 下午2:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<head>
    <%
        String path = request.getContextPath();
    %>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/competitorCss.css">
    <script src="${pageContext.request.contextPath}/assets/js/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
    <script>
        function add() {

            var asin = $("#asin").val();
            var brank = $("#brank").val();
            var disPatching = $("#disPatching").val();
            var imgUrl = $("#imgUrl").val();
            var name = $("#name").val();
            var rankNum = $("#rankNum").val();
            var sellerName = $("#sellerName").val();
            var size = $("#size").val();
            var totalSellNum = $("#totalSellNum").val();
            var weight = $("#weight").val();
            var transportWeight = $("#transportWeight").val();
            var bsrNum = $("#bsrNum").val();
            var commentScore = $("#commentScore").val();
            var totalCommentNum = $("#totalCommentNum").val();
            var fiveStar = $("#fiveStar").val();
            var fourStar = $("#fourStar").val();
            var threeStar = $("#threeStar").val();
            var twoStar = $("#twoStar").val();
            var oneStar = $("#oneStar").val();
            var inventoryNum = $("#inventoryNum").val();
            var sellPrice = $("#sellPrice").val();
            var shopPrice = $("#shopPrice").val();
            var sellNum = $("#sellNum").val();
            var saleTime = $("#saleTime").val();
            var standard = $("#standard").val();
            var color = $("#color").val();
            var answerNum = $("#answerNum").val();

            var result_ = {
                "asin": asin,
                "brank": brank,
                "disPatching": disPatching,
                "imgUrl": imgUrl,
                "name": name,
                "rankNum": rankNum,
                "sellerName": sellerName,
                "size": size,
                "totalSellNum": totalSellNum,
                "weight": weight,
                "transportWeight": transportWeight,
                "bsrNum": bsrNum,
                "commentScore": commentScore,
                "totalCommentNum": totalCommentNum,
                "fiveStar": fiveStar,
                "fourStar": fourStar,
                "threeStar": threeStar,
                "twoStar": twoStar,
                "oneStar": oneStar,
                "inventoryNum": inventoryNum,
                "sellPrice": sellPrice,
                "shopPrice": shopPrice,
                "sellNum": sellNum,
                "saleTime": saleTime,
                "standard": standard,
                "color": color,
                "answerNum": answerNum
            };

            var resultList_ = [{
                "asin": asin,
                "brank": brank,
                "disPatching": disPatching,
                "imgUrl": imgUrl,
                "name": name,
                "rankNum": rankNum,
                "sellerName": sellerName,
                "size": size,
                "totalSellNum": totalSellNum,
                "weight": weight,
                "transportWeight": transportWeight,
                "bsrNum": bsrNum,
                "commentScore": commentScore,
                "totalCommentNum": totalCommentNum,
                "fiveStar": fiveStar,
                "fourStar": fourStar,
                "threeStar": threeStar,
                "twoStar": twoStar,
                "oneStar": oneStar,
                "inventoryNum": inventoryNum,
                "sellPrice": sellPrice,
                "shopPrice": shopPrice,
                "sellNum": sellNum,
                "saleTime": saleTime,
                "standard": standard,
                "color": color,
                "answerNum": answerNum
            },
                {
                    "asin": asin,
                    "brank": brank,
                    "disPatching": disPatching,
                    "imgUrl": imgUrl,
                    "name": name,
                    "rankNum": rankNum,
                    "sellerName": sellerName,
                    "size": size,
                    "totalSellNum": totalSellNum,
                    "weight": weight,
                    "transportWeight": transportWeight,
                    "bsrNum": bsrNum,
                    "commentScore": commentScore,
                    "totalCommentNum": totalCommentNum,
                    "fiveStar": fiveStar,
                    "fourStar": fourStar,
                    "threeStar": threeStar,
                    "twoStar": twoStar,
                    "oneStar": oneStar,
                    "inventoryNum": inventoryNum,
                    "sellPrice": sellPrice,
                    "shopPrice": shopPrice,
                    "sellNum": sellNum,
                    "saleTime": saleTime,
                    "standard": standard,
                    "color": color,
                    "answerNum": answerNum
                },
                {
                    "asin": asin,
                    "brank": brank,
                    "disPatching": disPatching,
                    "imgUrl": imgUrl,
                    "name": name,
                    "rankNum": rankNum,
                    "sellerName": sellerName,
                    "size": size,
                    "totalSellNum": totalSellNum,
                    "weight": weight,
                    "transportWeight": transportWeight,
                    "bsrNum": bsrNum,
                    "commentScore": commentScore,
                    "totalCommentNum": totalCommentNum,
                    "fiveStar": fiveStar,
                    "fourStar": fourStar,
                    "threeStar": threeStar,
                    "twoStar": twoStar,
                    "oneStar": oneStar,
                    "inventoryNum": inventoryNum,
                    "sellPrice": sellPrice,
                    "shopPrice": shopPrice,
                    "sellNum": sellNum,
                    "saleTime": saleTime,
                    "standard": standard,
                    "color": color,
                    "answerNum": answerNum
                },
                {
                    "asin": asin,
                    "brank": brank,
                    "disPatching": disPatching,
                    "imgUrl": imgUrl,
                    "name": name,
                    "rankNum": rankNum,
                    "sellerName": sellerName,
                    "size": size,
                    "totalSellNum": totalSellNum,
                    "weight": weight,
                    "transportWeight": transportWeight,
                    "bsrNum": bsrNum,
                    "commentScore": commentScore,
                    "totalCommentNum": totalCommentNum,
                    "fiveStar": fiveStar,
                    "fourStar": fourStar,
                    "threeStar": threeStar,
                    "twoStar": twoStar,
                    "oneStar": oneStar,
                    "inventoryNum": inventoryNum,
                    "sellPrice": sellPrice,
                    "shopPrice": shopPrice,
                    "sellNum": sellNum,
                    "saleTime": saleTime,
                    "standard": standard,
                    "color": color,
                    "answerNum": answerNum
                },
                {
                    "asin": asin,
                    "brank": brank,
                    "disPatching": disPatching,
                    "imgUrl": imgUrl,
                    "name": name,
                    "rankNum": rankNum,
                    "sellerName": sellerName,
                    "size": size,
                    "totalSellNum": totalSellNum,
                    "weight": weight,
                    "transportWeight": transportWeight,
                    "bsrNum": bsrNum,
                    "commentScore": commentScore,
                    "totalCommentNum": totalCommentNum,
                    "fiveStar": fiveStar,
                    "fourStar": fourStar,
                    "threeStar": threeStar,
                    "twoStar": twoStar,
                    "oneStar": oneStar,
                    "inventoryNum": inventoryNum,
                    "sellPrice": sellPrice,
                    "shopPrice": shopPrice,
                    "sellNum": sellNum,
                    "saleTime": saleTime,
                    "standard": standard,
                    "color": color,
                    "answerNum": answerNum
                }];
            $.ajax({
                type: "POST",
                url: '${pageContext.request.contextPath}/data/addJson',
                dataType: 'text',
                contentType: 'application/json;charset=UTF-8',
                /*data:JSON.stringify(result_),*/
                data: JSON.stringify(result_),
                success: function (data) {

                },
                error: function (textStatus, errorThrown) {
                    alert(textStatus);
                }

            })

        }
    </script>
</head>
<body>
<div id="wrapper">
    <nav class="navbar-default navbar-static-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav metismenu" id="side-menu">
                <li class="nav-header">
                    <div class=" profile-element">
                    		<span>
                            	<%--<img alt="image" class="img-circle" src="/oldriver/api/v1/user/getAvatar" width="48">--%>
                             </span>
                        <a class="dropdown-toggle" href="#" aria-expanded="false">
	                            <span class="clear">
	                            	<span class="block m-t-xs">
	                            		<strong class="font-bold">Amazon数据分析</strong>
	                             	</span>
	                             	<span class="text-muted text-xs block">

	                             	 </span>
	                            </span>
                        </a>
                    </div>

                </li>
                <li>
                    <a href="#"><i class="fa fa-home"></i> <span class="nav-label">首页</span></a>
                </li>


                <li class="active">
                    <a href="${pageContext.request.contextPath}/data/competitor"><i class="fa fa-bullseye"></i>
                        <span class="nav-label">竞品监控</span></a>
                </li>


                <li>
                    <a href="#"><i class="fa fa-line-chart"></i> <span class="nav-label">关键字分析</span></a>
                </li>


                <li>
                    <a href="javascript:;"><i class="fa fa-envelope"></i> <span class="nav-label">潜力新品</span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="#">客服邮件</a></li>
                        <li><a href="#">管理邮件模板</a></li>
                        <li><a href="#">管理邮件账号</a></li>
                    </ul>
                </li>


                <li>
                    <a href="javascript:;"><i class="fa fa-shopping-cart"></i> <span class="nav-label">评论痛点</span>

                    </a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="#">账户总览</a></li>
                        <li><a href="#">产品订购


                        </a></li>
                        <li><a href="#">账单查询</a></li>
                    </ul>
                </li>

                <li>
                    <a href="javascript:;"><i class="fa fa-edit"></i> <span class="nav-label">Amazon账号管理</span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="#">添加账号</a></li>
                        <li><a href="#">管理账号</a></li>
                    </ul>
                </li>
                <!-- 推广管理 -->



            </ul>
        </div>
    </nav>
    <div class="gray-bg "id="page-wrapper">
    <div class="row wrapper border-bottom white-bg page-heading">
        <div class="col-sm-12">
            <h2> 竞品监控 </h2>
            <ol class="breadcrumb">
                <li>
                    <a href="${pageContext.request.contextPath}/data/competitor">首页</a>
                </li>
                <li>
                    竞品监控
                </li>
            </ol>
        </div>

    </div>

        <div class="row wrapper border-bottom white-bg page-heading">
        <div class="col-md-12">
            <a   >
                <button class="btn btn-primary"  data-toggle="modal" data-target="#myModal"> <i class="fa fa-plus"></i>添加竞品</button></a>
        </div>
    </div>

        <%--弹出框,添加竞品--%>
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                        <h4 class="modal-title" id="myModalLabel">添加竞品</h4>
                    </div>
                    <div class="modal-body form-group">
                        <textarea   placeholder="请输入要添加的ASIN, 多个ASIN请用回车分隔，每次最多输入10个ASIN" rows="8"
                                  class="form-control">
                        </textarea>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                        <button type="button" class="btn btn-primary">确定</button>
                    </div>
                </div>
            </div>
        </div>
    <%--<div>
        <form class="form" action="${pageContext.request.contextPath}/data/findAsin">
            <span class="label-info">输入Asin:</span>
            <input type="text" name="asin"/>
            <input type="submit" value="查询"/>
        </form>
    </div>--%>


    <%--<div>
        <form class="form  form-inline " action="" method="post">
            第:<input type="text" name="pageNum">页
                <input type="submit" value="查询">
        </form>
    </div>--%>
    <div class="main_content">
        <div class="row_content">
            <div class="row">
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
                                <br><a href="#"
                                       target="_blank" class="btn btn-primary btn-xs btn-outline m-t-sm">${item.asin}</a></br>
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
            </div>
        </div>

    </div>
    </div>
</div>
</body>
</html>
