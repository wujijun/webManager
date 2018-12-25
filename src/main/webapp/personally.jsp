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
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        html body{
            background-image: url("img/114.jpeg");
            background-position: center center;
            background-size: cover;
            background-repeat: no-repeat;
            width: 100vw;        /*这个设置容器宽度为浏览器宽度*/
            height: 100vh;
        }
        div{
            width: 150px;
            height: 100%;
            padding: 5px;
            list-style: none;
        }
        #img{
            width: 100%;
            height: 200px;
            overflow: hidden;
        }
        #img #imgimg{
            width: 150px;
            height: 150px;
            border-radius: 50%;
            overflow: hidden;
        }
        #text{
            width: 100%;
            height: 80px;
            font-family: 新宋体;
        }
        li{
            width: 100%;
            height: 50px;

        }
        li:hover{
            background-color: red;
            cursor: pointer;
        }
        span{
            font-family: 微软雅黑;
            color: black;
            font-size: 25px;
            line-height: 50px;
            margin-left: 20px;
        }
        #SignOut{
            width: 100%;
            height: 50px;
            background-color: red;
            cursor: pointer;
        }
    </style>
</head>
<body>
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
        <div id="text">
               姓名：张三<br>
               年龄：18<br>
               性别: 女<br>
               级别：中士
        </div>
        <li><span>教育背景</span></li>
        <li><span>个人经历</span></li>
        <li><span>家庭住址</span></li>
        <li><span>历史成绩</span></li>
        <input type="button" name="SignOut" id="SignOut" value="退出登录">
    </div>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#SignOut").click(function () {
                window.location.href="login";

            })

        });
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

</body>


</html>
