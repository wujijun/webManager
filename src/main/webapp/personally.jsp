<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/24 0024
  Time: 18:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/backgroundStyle.css" type="text/css">
    <style>

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
        <form  method="post" action="list">
            <li class="S_menu">
                <input type="submit" class="select_button" name="1" value="士兵管理">
                <ul class="tag1">
                    <li>
                        <input type="submit" class="select_button1" name="10" value="新兵">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="11" value="老兵">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="12" value="下士">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="13" value="中士">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="14" value="上士">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="15" value="四级军士长">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="16" value="三级军士长">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="17" value="二级军士长">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="18" value="一级军士长">
                    </li>
                </ul>
            </li>
        </form>
        <%--干部管理--%>
        <form  method="post" action="">
            <li class="S_menu">
                <input type="submit" class="select_button" name="1" value="干部管理">
                <ul class="tag1">
                    <li>
                        <input type="submit" class="select_button1" name="10" value="学员">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="11" value="中尉">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="12" value="上尉">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="13" value="少校">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="14" value="中校">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="15" value="上校">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="16" value="大校">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="17" value="将军">
                    </li>
                </ul>
            </li>
        </form>
        <%--单位管理--%>
        <form  method="post" action="">
            <li class="S_menu">
                <input type="submit" class="select_button" name="1" value="单位管理">
                <ul class="tag1">
                    <li>
                        <input type="submit" class="select_button1" name="10" value="机关">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="11" value="指挥营">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="12" value="一营">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="13" value="二营">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="14" value="三营">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="15" value="四营">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="16" value="五营">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="17" value="榴炮营">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="18" value="汽车营">
                    </li>
                    <li>
                        <input type="submit" class="select_button1" name="19" value="卫生队">
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
    <div>
        <div id="img">
            <form action="img" method="post" enctype="multipart/form-data">
                <div id="imgimg">
                    <img id="img1" width="180px" height="180px" >
                </div>
                <input type="file"  name="file" onchange="Change(this)">
                <input type="submit" name="submit">
            </form>
        </div>
        <li><span>教育背景</span></li>
        <li><span>个人经历</span></li>
        <li><span>家庭住址</span></li>
        <li><span>历史成绩</span></li>

    </div>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        /*图片显示*/
        function Change(obj) {
            console.log(obj);
            var reader = new FileReader();
            reader.onload=function (ev) {
                var img = document.getElementById("img1");
                img.src = ev.target.result;
            };
            reader.readAsDataURL(obj.files[0])
        }
    </script>
    </div>
</div>
</body>


</html>
