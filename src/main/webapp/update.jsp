<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/25 0025
  Time: 2:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>

<form action="doUpdate" method="post" enctype="multipart/form-data">
    <input type="text" name="id" hidden="hidden" value="${s.id}"><br>
    姓名：<input type="text" name="name" value=${s.name}><br>
    年龄：<input type="text" name="age"><br>
    图片：<input type="file" name="file"><br>
    地址：<input type="text" name="address"><br>
    单位：<input type="text" name="unit"><br>
    级别：<input type="text" name="rank"><br>
    <input type="submit" name="submit" value="确认修改">

</form>

</body>
</html>
