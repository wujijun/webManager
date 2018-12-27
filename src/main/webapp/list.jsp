<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="main.java.pojo.Soldiers" %>
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

        *{
            margin: 0;
            padding: 0;
            list-style: none;

        }
        #big{
            width: 1600px;
            height: 980px;
            margin: auto;
            background-color:cornflowerblue;
            /* display: flex;*/

        }

        #big #left{
            width: 299px;
            height: 100%;
            float: left;
            border-right: white solid 1px;

        }
        #top{
            width: 1300px;
            height: 149px;
            float: right;
            border-bottom: white solid 1px;
            font-family: 楷体;
            font-size: 45px;
            text-align: center;
            line-height: 149px;
        }
        #logo{
            width: 150px;
            height: 100%;
            float: right;
            overflow: hidden;
        }
        #big #right{
            width: 1300px;
            height: 830px;
            float: right;
        }
        #left_img{
            width: 290px;
            height: 290px;
            border-radius: 50%;
            overflow: hidden;
        }

        .S_menu{
            width: 100%;
            height: 100px;
        }
        .tag1{
            position: relative;
            left: 299px;
            bottom: 0px;
            width: 150px;
            height: 830px;
        }
        .select_button{
            width: 100%;
            height: 100px;
            font-size: 35px;
            border-bottom: #aaaaaa solid 1px;
        }





        input:hover{
            background-color: red;
        }





        table{
            border: black 1px solid;
            border-collapse: collapse;
            margin: auto;
        }
        thead tr th,tbody tr td {
            border:black 1px solid;
            padding: 15px;
        }
        tbody tr:nth-child(odd){
            background-color: aquamarine;
        }
        tbody tr:hover{
            background-color: red;
        }
        .tag{
            width: 180px;
            margin: auto;
            font-size: large;
        }
        ul{
            display: flex;
            list-style: none;
        }
        li{
            padding: 15px;
            text-decoration: none;
        }

    </style>
</head>
<body>
<div id="big">
    <div id="left">
        <div id="left_img">
            <img src="img/1113.jpeg" width=100% height=100%>
        </div>

        <form id="sele" method="get">
                <li class="S_menu">
                    <input type="submit" class="select_button" name="1" value="士兵管理">
                    <ul class="tag1">
                        <li>
                            <input type="submit" class="select_button" name="10" value="新兵">
                        </li>
                        <li>
                            <input type="submit" class="select_button" name="11" value="老兵">
                        </li>
                        <li>
                            <input type="submit" class="select_button" name="12" value="下士">
                        </li>
                        <li>
                            <input type="submit" class="select_button" name="13" value="中士">
                        </li>
                        <li>
                            <input type="submit" class="select_button" name="14" value="上士">
                        </li>
                        <li>
                            <input type="submit" class="select_button" name="15" value="四级军士长">
                        </li>
                        <li>
                            <input type="submit" class="select_button" name="16" value="三级军士长">
                        </li>
                        <li>
                            <input type="submit" class="select_button" name="17" value="二级军士长">
                        </li>
                        <li>
                            <input type="submit" class="select_button" name="18" value="一级军士长">
                        </li>
                    </ul>
                </li>
                <li class="S_menu">
                    <input type="submit" class="select_button" name="1" value="干部管理">

                </li>
                <li class="S_menu">
                    <input type="submit" class="select_button" name="1" value="单位管理">
                </li>
                <li class="S_menu">
                    <input type="submit" class="select_button" name="1" value="个人信息">
                </li>


            <%--<input type="submit" class="select_button" name="1" value="士兵管理">
            <input type="submit" class="select_button" name="1" value="干部管理">
            <input type="submit" class="select_button" name="1" value="单位管理">
            <input type="submit" class="select_button" name="1" value="个人信息">--%>
        </form>


    </div>
    <div id="top">

        欢迎登陆陆军管理系统
        <div id="logo">
            <img src="img/111.jpg" width="160px" height="160px">
        </div>
    </div>
    <div id="right">

        <form  method="post">
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
            <c:forEach items="${list}" var="s">
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

         <ul>
   <%-- ${data.pageView}--%>


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
