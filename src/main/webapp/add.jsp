<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/23 0023
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="css/backgroundStyle.css" rel="stylesheet" type="text/css">
    <style>

        #right >form{
            width: 100px;
            margin-left: 450px;
            opacity: 0.8;
            margin-top: 50px;
        }
        #right >form input{
            padding: 10px;
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
        <form action="doAdd" method="post" enctype="multipart/form-data">

            姓名：<input type="text" name="name"><br>
            年龄：<input type="text" name="age"><br>
            图片：<input type="file" name="file"><br>
            地址：<input type="text" name="address"><br>
            单位：<input type="text" name="unit"><br>
            级别：<input type="text" name="rank"><br>
            <input type="submit" name="submit" value="确认添加">
        </form>
    </div>
</div>


</body>
</html>
