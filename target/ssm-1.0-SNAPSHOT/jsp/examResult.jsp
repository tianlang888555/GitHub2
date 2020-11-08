<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/3
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath=request.getScheme()+"://"+request.getServerName()
        +":"+request.getServerPort()+request.getContextPath()+"/";%>
<html>
<head>
    <title>考试结果</title>
    <base href="<%=basePath%>">
</head>
<body>
<h3 align="center">考试结果</h3>
<h4 align="center">${res}</h4>
<br>
<div align="center"><h4><a href="quit/stu">退出</a></h4></div>
</body>
</html>
