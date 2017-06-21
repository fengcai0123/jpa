<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yonghuo.chen
  Date: 17/6/7
  Time: 上午11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="/WEB-INF/assets/css/main.css">
    <style>
        .main_title{
            padding-top: 3rem;
            height: 6.5rem;;
            padding-bottom: 3px;
            text-align: center;
            background: #e7eaec;
        }
    </style>
    <script src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="main_title">
        <span class=" h2">Amazon数据分析中心</span>
    </div>
    <div class="row">
        <div class="col-lg-2">
            <ul class="nav nav-pills nav-stacked">
                <li><a href="#">关 键 词</a></li>
                <li><a href="#">搜索排名</a></li>
                <li><a href="#">潜力新品</a></li>
                <li><a href="#">评价情况</a></li>
            </ul>
        </div>
        <div class="col-lg-10 ">
            <table class="table table-striped table-bordered">
                <thead>
                    <tr>
                        <th>表头


                        </th>
                        <th>表头</th>
                        <th>表头</th>
                        <th>表头</th>
                        <th>表头</th>
                        <th>表头</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>数据</td>
                        <td>数据</td>
                        <td>数据</td>
                        <td>数据</td>
                        <td>数据</td>
                        <td>数据</td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>2</td>
                        <td>3</td>
                        <td>4</td>
                        <td>5</td>
                        <td>6</td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>2</td>
                        <td>3</td>
                        <td>4</td>
                        <td>5</td>
                        <td>6</td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>2</td>
                        <td>3</td>
                        <td>4</td>
                        <td>5</td>
                        <td>6</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
    <div id="wrapper">
        <nav class="navbar-default navbar-static-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav metismenu" id="side-menu">
                    <li class="nav-header text-center">
                        <div class="dropdown profile-element">
                            <a data-toggle="dropdown" class="dropdown-toggle" href="javascript:">
                            <span class="clear">
                                <span class="m-t-xs font-bold text-danger">
                                    <img src="/inspinia/img/flags/16/United-States.png">&nbsp;美国站
                                </span>
                                <span class="text-muted text-xs small">[切换站点]</span>
                            </span>
                            </a>
                            <ul id="switch-market-dropdown-menu" class="dropdown-menu animated fadeInRight m-t-xs">
                                <li>
                                    <a href="http://datartery.com/dashboard/amz-us" data-market="amz-us" data-event-name="SwitchToAmzUs">
                                        <img src="/inspinia/img/flags/16/United-States.png">&nbsp;美国站
                                    </a>
                                </li>
                                <li>
                                    <a href="http://datartery.com/dashboard/amz-uk" data-market="amz-us" data-event-name="SwitchToAmzUk">
                                        <img src="/inspinia/img/flags/16/United-Kingdom.png">&nbsp;英国站
                                    </a>
                                </li>
                                <li>
                                    <a href="http://datartery.com/dashboard/amz-jp" data-market="amz-us" data-event-name="SwitchToAmzJp">
                                        <img src="/inspinia/img/flags/16/Japan.png">&nbsp;日本站
                                    </a>
                                </li>
                                <li>
                                    <a href="http://datartery.com/dashboard/amz-de" data-market="amz-us" data-event-name="SwitchToAmzDe">
                                        <img src="/inspinia/img/flags/16/Germany.png">&nbsp;德国站
                                    </a>
                                </li>
                                <li>
                                    <a href="http://datartery.com/dashboard/amz-fr" data-market="amz-us" data-event-name="SwitchToAmzFr">
                                        <img src="/inspinia/img/flags/16/France.png">&nbsp;法国站
                                    </a>
                                </li>
                                <li>
                                    <a href="http://datartery.com/dashboard/amz-it" data-market="amz-us" data-event-name="SwitchToAmzIt">
                                        <img src="/inspinia/img/flags/16/Italy.png">&nbsp;意大利站
                                    </a>
                                </li>
                                <li>
                                    <a href="http://datartery.com/dashboard/amz-es" data-market="amz-us" data-event-name="SwitchToAmzEs">
                                        <img src="/inspinia/img/flags/16/Spain.png">&nbsp;西班牙站
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </li>
                    <li class="divider"></li>
                    <li class="user-service-item">
                        <a class="nav-label user-service-button" href="http://datartery.com/dashboard/amz-us/user-service">
                            <i class="fa fa-plus"></i> <span class="">添加功能插件</span>
                        </a>
                    </li>
                    <li class="divider"></li>
                    <li class="">
                        <a href="http://datartery.com/dashboard/amz-us"><i class="iconfont"></i> <span class="nav-label"> 美国站首页 </span></a>
                    </li>

                    <li class="divider"></li>
                    <li class="">
                        <span class="nav-label service-category">选品开发</span>
                        <ul class="nav nav-second-level collapse in">
                            <li class="">
                                <a href="http://datartery.com/dashboard/amz-us/amz-us-growing-bs">
                                    <i class="iconfont"></i>
                                    潜力新品
                                </a>
                            </li>
                            <li class="">
                                <a href="http://datartery.com/dashboard/amz-us/amz-us-sales-trends">
                                    <i class="iconfont"></i>
                                    销售趋势透视
                                </a>
                            </li>
                            <li class=" active ">
                                <a href="http://datartery.com/dashboard/amz-us/amz-us-keyword-insight">
                                    <i class="iconfont"></i>
                                    关键词商机
                                </a>
                            </li>
                            <li class="">
                                <a href="http://datartery.com/dashboard/amz-us/amz-us-category-overview">
                                    <i class="iconfont"></i>
                                    品类大盘
                                </a>
                            </li>
                            <li class="">
                                <a href="http://datartery.com/dashboard/amz-us/amz-us-review-research">
                                    <i class="iconfont"></i>
                                    评论痛点挖掘
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li class="divider"></li>
                    <li class="">
                        <span class="nav-label service-category">监控中心</span>
                        <ul class="nav nav-second-level collapse in">
                            <li class="">
                                <a href="http://datartery.com/dashboard/amz-us/amz-us-product-monitor">
                                    <i class="iconfont"></i>
                                    竞品监控
                                </a>
                            </li>
                            <li class="">
                                <a href="http://datartery.com/dashboard/amz-us/amz-us-keyword-ranking-monitor">
                                    <i class="iconfont"></i>
                                    搜索排名监控
                                </a>
                            </li>
                            <li class="">
                                <a href="http://datartery.com/dashboard/amz-us/amz-us-review-monitor">
                                    <i class="iconfont"></i>
                                    差评监控
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li class="divider"></li>
                    <li class="">
                        <span class="nav-label service-category">流量提升</span>
                        <ul class="nav nav-second-level collapse in">
                            <li class="">
                                <a href="http://datartery.com/dashboard/amz-us/amz-us-keyword-digging">
                                    <i class="iconfont"></i>
                                    关键词挖掘
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li class="divider"></li>
                    <li class="">
                        <span class="nav-label service-category">小工具</span>
                        <ul class="nav nav-second-level collapse in">
                            <li class="">
                                <a href="http://datartery.com/dashboard/amz-us/amz-us-free-keyword-digging">
                                    <i class="iconfont"></i>
                                    长尾词工具
                                </a>
                            </li>
                            <li class="">
                                <a href="http://datartery.com/dashboard/amz-us/amz-us-fee-calculator">
                                    <i class="iconfont"></i>
                                    成本利润计算器
                                </a>
                            </li>
                            <li class="">
                                <a href="http://datartery.com/dashboard/amz-us/amz-us-trademark-search">
                                    <i class="iconfont"></i>
                                    商标查询器
                                </a>
                            </li>
                            <li class="">
                                <a href="http://datartery.com/dashboard/amz-us/amz-us-visual-editor">
                                    <i class="iconfont"></i>
                                    可视化编辑器
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <span class="nav-label service-category">定制服务</span>
                        <ul class="nav nav-second-level collapse in">
                            <li class="">
                                <a href="http://datartery.com/dashboard/amz-us/custom-service">
                                    <i class="iconfont"></i>定制服务市场
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <span class="nav-label service-category">账号设置</span>
                        <ul class="nav nav-second-level collapse in">
                            <li class="">
                                <a href="http://datartery.com/dashboard/amz-us/setting/billing/recharge">
                                    <i class="iconfont"></i>充值及消费记录
                                </a>
                            </li>
                            <li class="">
                                <a href="http://datartery.com/dashboard/amz-us/setting/password">
                                    <i class="iconfont"></i>密码修改
                                </a>
                            </li>
                            <li class="">
                                <a href="http://datartery.com/dashboard/amz-us/setting/sub-account">
                                    <i class="iconfont"></i>子账号管理
                                </a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
        <div id="page-wrapper" class="gray-bg" style="min-height: 1264px;">

            <div class="row border-bottom">
                <nav class="navbar navbar-static-top white-bg" role="navigation">
                    <div class="navbar-header">
                        <a class="navbar-minimalize minimalize-styl-2 btn btn-outline btn-primary text-info" href="#">
                            <i class="fa fa-bars"></i>
                        </a>
                        <img src="/img/logo-dashboard-dark.png" class="img-responsive dashboard-logo">
                    </div>

                    <ul class="nav navbar-top-links navbar-right">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                <i class="iconfont"></i>
                                帮助
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a class="qq" target="_blank" href="http://wpa.qq.com/msgrd?v=3&amp;uin=2071893194&amp;site=qq&amp;menu=yes">
                                        <i class="fa fa-qq"></i> QQ 客服
                                    </a>
                                </li>
                                <li><a href="http://datartery.com/dashboard/amz-us/help"> 5分钟入门数据脉 </a></li>
                            </ul>
                        </li>

                        <li>
                            <span class="m-r-sm"> <i class="iconfont"></i> 点: 174</span>
                        </li>

                        <li>
                            <button class="btn btn-primary btn-xs" onclick="location.href='http://datartery.com/dashboard/amz-us/setting/billing/recharge';"> 充值 </button>
                        </li>

                        <li style="margin-right: 12px;">
                            <button class="btn btn-primary btn-outline btn-xs" onclick="location.href='http://datartery.com/dashboard/amz-us/setting/billing/reward';"> 免费获取 </button>
                        </li>

                        <li class="dropdown" style="margin-right: 0;">
                            <a class="dropdown-toggle count-info" data-toggle="dropdown" href="#">
                                <i class="fa fa-bell"></i>
                                <span class="label label-danger notification-count">5</span>
                            </a>
                            <ul class="dropdown-menu dropdown-alerts">
                                <li>
                                    <div class="text-right">
                                        <a id="mark-all-notification-read" href="javascript:">
                                            全部设为已读
                                        </a>
                                    </div>
                                </li>
                                <li class="divider"></li>
                                <li class="notification">
                                    <a href="http://datartery.com/dashboard/amz-us/notification/46d8d0fc-009e-4bf0-85fb-65a98da5d69f">
                                        <div style="color: #404040;">
                                            评论痛点挖掘功能已更新，新增具体评论内容展示及意见占比展示，点我体验&gt;&gt;&gt;
                                            <br>
                                            <span class="small">2017-05-26 16:13:35</span>
                                        </div>
                                    </a>
                                </li>
                                <li class="divider notification"></li>
                                <li class="notification">
                                    <a href="http://datartery.com/dashboard/amz-us/notification/9859665a-1bce-4678-8005-848713130875">
                                        <div style="color: #404040;">
                                            德国、法国、意大利、西班牙四大站点的竞品监控、关键词排名监控、差评监控功能全面上线！点击左上角切换站点体验
                                            <br>
                                            <span class="small">2017-05-11 15:54:46</span>
                                        </div>
                                    </a>
                                </li>
                                <li class="divider notification"></li>
                                <li class="notification">
                                    <a href="http://datartery.com/dashboard/amz-us/notification/daffe9a8-3c8f-4737-b825-76cdf11f5377">
                                        <div style="color: #404040;">
                                            关注微信并转发朋友圈，免费获赠 50 M点！点我查看详情 》》
                                            <br>
                                            <span class="small">2017-05-05 12:41:13</span>
                                        </div>
                                    </a>
                                </li>
                                <li class="divider notification"></li>
                                <li class="notification">
                                    <a href="http://datartery.com/dashboard/amz-us/notification/42a513dd-071b-4ddf-a3cc-928e9f381cce">
                                        <div style="color: #404040;">
                                            潜力新品功能新增了商品的「潜力指数」，数字越大，代表这个商品越值得关注！点我体验》》
                                            <br>
                                            <span class="small">2017-05-04 17:37:00</span>
                                        </div>
                                    </a>
                                </li>
                                <li class="divider notification"></li>
                                <li class="notification">
                                    <a href="http://datartery.com/dashboard/amz-us/notification/5452544d-fce9-4d0a-91cc-9554884b4039">
                                        <div style="color: #404040;">
                                            现在打开微信搜索公众号 shujumai 并关注，第一时间获取由数据脉专业分析师发布的美亚爆款痛点分析报告、品类爆款排名跟踪报告！
                                            <br>
                                            <span class="small">2017-05-03 16:42:39</span>
                                        </div>
                                    </a>
                                </li>
                                <li class="divider notification"></li>
                                <li>
                                    <div class="text-center link-block">
                                        <a href="http://datartery.com/dashboard/amz-us/notification" target="_blank">
                                            查看所有消息
                                            <i class="fa fa-angle-right"></i>
                                        </a>
                                    </div>
                                </li>
                            </ul>
                        </li>

                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                13728756596
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="http://datartery.com/dashboard/amz-us/setting/billing/recharge"> 充值及消费记录</a></li>
                                <li><a href="http://datartery.com/dashboard/amz-us/setting/sub-account"> 子账号管理</a></li>
                                <li><a href="http://datartery.com/dashboard/amz-us/setting/password" class="a"> 密码修改</a></li>
                                <li class="divider"></li>
                                <li>
                                    <a href="javascript:;" onclick="event.preventDefault();
                                             document.getElementById('logout-form').submit();">
                                        <i class="fa fa-sign-out"></i> 退出
                                    </a>
                                    <form id="logout-form" action="http://datartery.com/logout" method="POST" style="display: none;">
                                        <input type="hidden" name="_token" value="WVJ3eJRAsDGcgbeCEEevCqvhIIundOmgrButKj1L">
                                    </form>
                                </li>
                            </ul>
                        </li>
                    </ul>

                </nav>
            </div>

            <div class="row wrapper border-bottom white-bg page-heading">
                <div class="col-sm-4">
                    <h2> 关键词商机 </h2>
                    <ol class="breadcrumb">
                        <li>
                            <a href="http://datartery.com/dashboard/amz-us">首页</a>
                        </li>
                        <li>
                            选品开发
                        </li>
                        <li class="active">
                            <strong>关键词商机</strong>
                        </li>
                    </ol>
                </div>
                <div class="col-sm-8">
                    <div class="title-action">
                        <a href="/guide/keyword-insight.html" class="btn btn-primary" target="_blank"><i class="fa fa-lightbulb-o"></i> 使用教程 </a>
                    </div>
                </div>
            </div>

            <div id="amz-us-keyword-insight" class="wrapper wrapper-content animated fadeInRight"><!----> <div class="ibox float-e-margins"><div class="ibox-content"><div><a href="javascript:;" class="btn btn-primary"><i class="fa fa-plus"></i>&nbsp;新建分析任务
            </a> <strong>&nbsp;&nbsp;什么是关键词商机？关键词商机功能是指通过爬虫抓取某个关键词在亚马逊的搜索结果，然后将数据结果分析汇总，最终帮助卖家了解此关键词对应的销售机会。</strong> <hr></div> <div class="table-responsive"><table class="table table-striped"><thead><tr><th class="text-center">关键词</th> <th class="text-center">商机评级</th> <th class="text-center">任务状态</th> <th class="text-center">完成时间</th> <th class="text-center">消费</th> <th class="text-center">操作</th></tr></thead> <tbody><tr class="text-center"><td>bluetooth speakers</td> <td><span><i class="fa fa-star text-warning"></i><i class="fa fa-star text-warning"></i><i class="fa fa-star-half-o text-warning"></i></span></td> <td><span class="text-success"><i class="fa fa-check-circle"></i> 成功
                                </span></td> <td><span>2017-06-03 11:26:22</span></td> <td><span>30</span>
                M 点
            </td> <td><div role="toolbar" class="btn-toolbar"><div role="group" class="btn-group" style="float: none;"><a href="/dashboard/amz-us/amz-us-keyword-insight/545" target="_blank" class="btn btn-sm btn-primary">查看详情</a></div></div></td></tr></tbody></table></div> <!----></div> <div class="row"><div class="col-md-12"></div></div></div></div>

            <div class="footer">
                <div class="pull-right">
                    <strong></strong>
                </div>
                <div>
                    © 2016 Datartery &nbsp; | &nbsp; 数据脉 &nbsp; | &nbsp; 厦门数析信息科技有限公司
                </div>
            </div>
        </div>
    </div>
</body>
</html>
