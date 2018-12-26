<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/26 0026
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

    <%
    String path = "";
    if (request.getServerPort()==8080){
        path = request.getScheme()+"://"+request.getServerName()+request.getContextPath();
    }else {
        path = request.getScheme()+"://"+request.getServerName()+":"+request.getContextPath();
    }
    pageContext.setAttribute("path",path);


    %>


