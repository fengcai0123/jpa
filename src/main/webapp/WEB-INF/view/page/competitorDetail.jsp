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
	                            		<strong class="font-bold">数据分析</strong>
	                             	</span>
	                             	<span class="text-muted text-xs block">
                                        data
	                             	 </span>
	                            </span>
                        </a>
                    </div>

                </li>
                <li>
                    <a href="#"><i class="fa fa-home"></i> <span class="nav-label">首页</span></a>
                </li>


                <li class="active">
                    <a href="${pageContext.request.contextPath}/data/competitor"><i class="fa fa-bullseye"></i> <span class="nav-label">竞品监控</span></a>
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
    <div class="gray-bg "id="page-wrapper"">


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
                <div class="col-sm-5">
                    <div class="product-images">
                        <div><img src="https://images-na.ssl-images-amazon.com/images/I/417uSixppTL._UY300_.jpg"
                                  alt="暂无图片"
                                  class="img-responsive" style="height: 300px; margin: auto; text-align: center;">
                        </div>
                    </div>
                    <div class="text-center m-t-xl">
                        ASIN: <span>${good.asin}</span>
                    </div>
                </div>

                <div class="col-sm-7">
                    <table class="table table-responsive table-bordered table-striped">
                        <tr>
                            <td  colspan="4">${good.name}</td>
                        </tr>
                        <tr>
                            <td>价格</td>
                            <td>${price.sellPrice}</td>
                            <td>监控的卖家</td>
                            <td>${good.sellerName}</td>
                        </tr>
                        <tr>
                            <td>品牌</td>
                            <td>${good.brank}</td>
                            <td>尺寸</td>
                            <td>${good.size}</td>
                        </tr>
                        <tr>
                            <td>品类</td>
                            <td>暂无</td>
                            <td>重量</td>
                            <td>${good.weight}</td>
                        </tr>
                        <tr>
                            <td>BSR</td>
                            <td>${bsr.bsrNum}</td>
                            <td>配送</td>
                            <td>${good.disPatching}</td>
                        </tr>
                        <tr>
                            <td>评论总量</td>
                            <td>${comment.totalCommentNum}</td>
                            <td>上架时间</td>
                            <td>${good.saleTime}</td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
        <div class="row_content_bottom">
            <div class="row">
                <div class="col-lg-6">
                    <div class="ibox">
                        <div class="ibox-title">
                            <h5>BSR趋势<span data-toggle="tooltip" data-placement="top" title=""
                                  data-original-title="商品的历史 Best Sellers Rank 排名趋势">
                                <i aria-hidden="true"class="fa fa-info-circle"></i></span>
                            </h5>
                        </div>
                        <div class="ibox-content">
                        <table class="table table-bordered table-responsive">
                            <thead>
                            <tr>
                                <th class="text-center" style="width: 50%;">日期</th>
                                <th class="text-center" style="width: 50%;">当日库存</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${inventoryList}" var="inventory">
                            <tr class="text-center">
                                <td><span>${inventory.date}</span></td>
                                <td><span class="text-muted">${inventory.inventoryNum}</span></td>
                            </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                        </div>
                    </div>
                </div>

                <div class="col-lg-6">
                    <div class="ibox float-e-margins">
                        <div class="ibox-title">
                            <h5>销量趋势<span data-toggle="tooltip" data-placement="top" title=""
                                           data-original-title="商品的历史 Best Sellers Rank 排名趋势">
                                <i aria-hidden="true"class="fa fa-info-circle"></i></span>
                            </h5>
                        </div>
                        <div class="ibox-content">
                            <table class="table table-bordered table-responsive">
                                <thead>
                                <tr>
                                    <th class="text-center" style="width: 50%;">日期</th>
                                    <th class="text-center" style="width: 50%;">当日库存</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${sellList}" var="sell">
                                <tr class="text-center">
                                    <td><span>${sell.date}</span></td>
                                    <td><span class="text-muted">${sell.sellNum}</span></td>
                                </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-lg-6">
                    <div class="ibox">
                        <div class="ibox-title">
                            <h5>BSR趋势<span data-toggle="tooltip" data-placement="top" title=""
                                           data-original-title="商品的历史 Best Sellers Rank 排名趋势">
                                    <i aria-hidden="true"class="fa fa-info-circle"></i></span>
                            </h5>
                        </div>
                        <div class="ibox-content">
                            <table class="table table-bordered table-responsive">
                                <thead>
                                <tr>
                                    <th class="text-center" style="width: 50%;">日期</th>
                                    <th class="text-center" style="width: 50%;">当日库存</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${bsrList}" var="bsr">
                                <tr class="text-center">
                                    <td><span>${good.updateTime}</span></td>
                                    <td><span class="text-muted">${bsr.bsrNum}</span></td>
                                </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>

                <div class="col-lg-6">
                    <div class="ibox float-e-margins">
                        <div class="ibox-title">
                            <h5>价格趋势<span data-toggle="tooltip" data-placement="top" title=""
                                           data-original-title="商品的历史 Best Sellers Rank 排名趋势">
                                    <i aria-hidden="true"class="fa fa-info-circle"></i></span>
                            </h5>
                        </div>
                        <div class="ibox-content">
                            <table class="table table-bordered table-responsive">
                                <thead>
                                <tr>
                                    <th class="text-center" style="width: 50%;">日期</th>
                                    <th class="text-center" style="width: 50%;">当日价格</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${priceList}" var="price">
                                <tr class="text-center">
                                    <td><span>${price.date}</span></td>
                                    <td><span class="text-muted">${price.sellPrice}</span></td>
                                </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-lg-6">
                    <div class="ibox">
                        <div class="ibox-title">
                            <h5>评分趋势<span data-toggle="tooltip" data-placement="top" title=""
                                           data-original-title="商品的历史 Best Sellers Rank 排名趋势">
                                        <i aria-hidden="true"class="fa fa-info-circle"></i></span>
                            </h5>
                        </div>
                        <div class="ibox-content">
                            <table class="table table-bordered table-responsive">
                                <thead>
                                <tr>
                                    <th class="text-center" style="width: 50%;">日期</th>
                                    <th class="text-center" style="width: 50%;">当日评分</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${commentList}" var="comment">
                                <tr class="text-center">
                                    <td><span>${comment.date}</span></td>
                                    <td><span class="text-muted">${comment.commentScore}</span></td>
                                </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>

                <div class="col-lg-6">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>评论数趋势<span data-toggle="tooltip" data-placement="top" title=""
                                       data-original-title="商品的历史 Best Sellers Rank 排名趋势">
                                    <i aria-hidden="true"class="fa fa-info-circle"></i></span>
                        </h5>
                    </div>
                    <div class="ibox-content">
                        <table class="table table-bordered table-responsive">
                            <thead>
                            <tr>
                                <th class="text-center" style="width: 50%;">日期</th>
                                <th class="text-center" style="width: 50%;">评论数</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${commentList}" var="comment">
                            <tr class="text-center">
                                <td><span>${comment.commentScore}</span></td>
                                <td><span class="text-muted">${comment.totalCommentNum}</span></td>
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
    </div>
</div>
</body>
</html>
