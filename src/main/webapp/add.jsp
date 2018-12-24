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
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        html body{
            background-image: url("img/115.jpg");
            background-position: center center;
            background-size: cover;
            background-repeat: no-repeat;
            width: 100vw;        /*这个设置容器宽度为浏览器宽度*/
            height: 100vh;

        }
        form{
            width: 193px;
            margin: auto;
            opacity: 0.8;
            background-color: #1161ee;
        }
        input{
            padding: 10px;
        }
    </style>
</head>
<body>
    <form action="doAdd" method="post" enctype="multipart/form-data">

        姓名：<input type="text" name="name"><br>
        年龄：<input type="text" name="age"><br>
        图片：<input type="file" name="file"><br>
        地址：<input type="text" name="address"><br>
        单位：<input type="text" name="unit"><br>
        级别：<input type="text" name="rank"><br>
        <input type="submit" name="submit" value="确认添加">
    </form>

</body>
</html>
