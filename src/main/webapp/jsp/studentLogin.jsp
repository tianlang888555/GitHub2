<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath=request.getScheme()+"://"+request.getServerName()
        +":"+request.getServerPort()+request.getContextPath()+"/";%>
<head>
    <meta charset="UTF-8">
    <title>学生登录入口</title>
    <base href="<%=basePath%>">
</head>
<body>
<h2 align="center">学生登录入口</h2><br>
<div align="center">
    <form action="student/login.do" method="post">
        用户名：<input type="text" name="id"><br>
        &nbsp;&nbsp;密码:&nbsp; &nbsp;&nbsp;<input type="password" name="pswd"><br><br>
        <input type="reset" value="清空"> <input type="submit" value="登录">
    </form>
    <button><a href="jsp/studentRegister.jsp">注册</a></button>
</div>
<div align="center"><h5>${state}</h5></div>
</body>
</html>