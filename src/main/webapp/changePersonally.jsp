<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/1 0001
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/backgroundStyle.css" type="text/css">
    <style>
        #right_center{
            width: 400px;
            height: 600px;
            margin: auto;
            margin-top: 50px;
            font-size: 25px;
        }
        #right_center >input{
            height: 40px;
            width: 70%;
            font-size: 25px;
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
        <form  method="post" action="login">
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
        <form id="right_center" method="post" action="doChange" enctype="multipart/form-data">
            <div id="imgImg">
                <img src="${u.img}" width="250px" height="250px" ><br>
                <input type="file"  name="file" >
            </div>
            <input type="text" name="id" hidden="hidden" value="${u.id}"><br>
            姓名：<br><input type="text" name="name" value="${u.name}"><br>
            密码：<br><input type="text" name="password" value="${u.password}"><br>
           电子邮箱：<br><input type="text" name="email" value="${u.email}"><br>
            <br><input type="submit" name="submit" value="确认修改">

        </form>

        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript">

        </script>
    </div>
</div>
</body>
</html>
