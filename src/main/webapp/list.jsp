<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    </style>
</head>
<body>
<table>
    <div>
        <h2>java英雄花名册</h2>
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

        <c:forEach items="${list}" var="s">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.age}</td>
            <td>${s.img}</td>
            <td>${s.address}</td>
            <td>${s.unit}</td>
            <td>${s.rank}</td>
            <td><a href="delete?id=${s.id}">删除</a> </td>
            <td><a href="update?id=${s.id}">修改</a> </td>
        </tr>
        </c:forEach>

    </body>
    <div>
        <a href="add"><h2>添加入伍人员</h2></a>
    </div>
</html>
