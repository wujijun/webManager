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
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        html body{
            background-image: url("img/111.jpg");
            background-position: center center;
            background-size: cover;
            background-repeat: no-repeat;

            width: 100vw;        /*这个设置容器宽度为浏览器宽度*/
            height: 100vh;
        }
        table{
            border: black 1px solid;
            border-collapse: collapse;
            margin: auto;
        }
        thead tr th,tbody tr td {
            border:black 1px solid;
            padding: 5px;
        }
        tbody tr:nth-child(odd){
            background-color: aquamarine;
        }
        div{
            width: 180px;
            margin: auto;
        }
        ul{
            display: flex;
            list-style: none;
        }
        li{
            padding: 5px;
            text-decoration: none;
        }

    </style>
</head>
<body>
    <form  method="post">
        <input type="text" name="text">
        <input type="submit" name="search">
    </form>

    <table>
        <div>
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
    <div>
        <a href="add"><h2>添加入伍人员</h2></a>

    </div>

</table>

<ul>
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
    </body>

</html>
