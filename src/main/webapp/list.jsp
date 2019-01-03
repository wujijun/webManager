<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="pojo.Soldiers" %>
<%--
  Created by IntelliJ IDEA.
  User:wujijun
  Date: 2018/12/22 0022
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/backgroundStyle.css" type="text/css">
   <style>
       .pages{
           list-style: none;
           margin-left: 405px;
           margin-top: 200px;
       }
       .pages li{
           float: left;
           height: 30px;
           width: 30px;
           line-height: 30px;
           text-align: center;
           border: solid 1px #000;
       }
       .pages li a{
           text-decoration: none;
           color: #000;
           display: block;
       }
       .pages .page{
           width: 80px;
           height: 30px;
       }
       .pages li:hover{
           cursor: pointer;
       }
   </style>
</head>
<body>
<div id="big">
    <div id="left">
        <div id="left_img">
            <img src="img/1113.jpeg" width=100% height=100%>
        </div>
        <%--个人信息--%>
        <form  method="post" action="personally">
                <li class="S_menu" >
                   <input type="submit" class="select_button" name="1" value="个人信息">
                   <ul class="tag1">
                       <li>
                           <input type="submit" class="select_button1" name="10" value="入伍信息">
                       </li>
                       <li>
                           <input type="submit" class="select_button1" name="11" value="配属单位">
                       </li>
                       <li>
                           <input type="submit" class="select_button1" name="12" value="装备配备">
                       </li>
                       <li>
                           <input type="submit" class="select_button1" name="13" value="考核成绩">
                       </li>
                   </ul>
             </li>
        </form>
        <%--士兵管理--%>
        <form  method="post" action="soldiersM">
            <li class="S_menu">
                <input type="submit" class="select_button" name="rank" value="士兵管理">
                <ul class="tag1">

                    <li>
                        <input type="submit" class="select_button1" name="rank" value="新兵">
                    </li>

                    <li>
                        <input type="submit" class="select_button1" name="rank" value="老兵">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="rank" value="下士">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="rank" value="中士">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="rank" value="上士">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="rank" value="四级军士长">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="rank" value="三级军士长">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="rank" value="二级军士长">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="rank" value="兵王">
                    </li>
                </ul>
            </li>
        </form>
        <%--干部管理--%>
        <form  method="post" action="soldiersM">
            <li class="S_menu">
                <input type="submit" class="select_button" name="rank" value="干部管理">
                <ul class="tag1">
                    <li>
                        <input type="submit" class="select_button1" name="rank" value="学员">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="rank" value="中尉">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="rank" value="上尉">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="rank" value="少校">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="rank" value="中校">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="rank" value="上校">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="rank" value="大校">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="rank" value="少将">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="rank" value="中将">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="rank" value="上将">
                    </li>
                </ul>
            </li>
        </form>
        <%--单位管理--%>
        <form  method="post" action="unitM">
            <li class="S_menu">
                <input type="submit" class="select_button" name="1" value="单位管理">
                <ul class="tag1">
                    <li>
                        <input type="submit" class="select_button1" name="unit" value="机关">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="unit" value="指挥营">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="unit" value="一营">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="unit" value="二营">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="unit" value="三营">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="unit" value="四营">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="unit" value="五营">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="unit" value="塔克营">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="unit" value="汽车营">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="unit" value="卫生队">
                    </li>
                </ul>
            </li>
        </form>
        <%--退出登录--%>
        <form  method="post" action="out">
            <li class="S_menu">
                <input type="submit" class="select_button" name="1" value="退出登录">
            </li>
        </form>
    </div>

    <div id="top">
        欢迎登陆陆军管理系统
        <div id="logo">
            <img src="img/111.jpg" width="160px" height="160px">
        </div>
    </div>

    <div id="right">
<%--模糊查询--%>
        <form  id="search" method="get">
            <input type="text" name="text" value="${text}">
            <input type="submit" name="search" value="查询">
        </form>

        <table>
            <div class="tag">
                <h2>英雄花名册</h2>
            </div>

        <thead>
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>头像</th>
            <th>地址</th>
            <th>单位</th>
            <th>级别</th>
            <th>删除</th>
            <th>修改</th>
        </tr>
        </thead>
        <tbody>

            <%--<c:forEach items="${data.lists}" var="s">--%>
            <c:forEach items="${data.lists}" var="s">
            <tr>
                <td>${s.id}</td>
                <td>${s.name}</td>
                <td>${s.age}</td>
                <td><img src="${s.img}" width="40px" height="40px"> </td>
                <td>${s.address}</td>
                <td>${s.unit}</td>
                <td>${s.rank}</td>
                <td><a href="delete?id=${s.id}">删除</a> </td>
                <td><a href="update?id=${s.id}">修改</a> </td>
            </tr>
            </c:forEach>
        </tbody>

        <div class="tag">
            <a href="add"><h2>添加入伍人员</h2></a>

        </div>

        </table>

         <ul class="pages">
             ${data.pageView}

     <%--   <li class="page"><a href="list?pageNo=1">首页</a></li>
        <li class="page"><a href="list?pageNo=1">下一页</a></li>
        <li class="page"><a href="list?pageNo=2">2</a></li>
        <li class="page"><a href="list?pageNo=3">3</a></li>
        <li class="page"><a href="list?pageNo=4">4</a></li>
        <li class="page"><a href="list?pageNo=5">5</a></li>
        <li class="page"><a href="list?pageNo=5">上一页</a></li>
        <li class="page"><a href="list?pageNo=5">尾页</a></li>--%>
        </ul>
    </div>
</div>
</body>

</html>
