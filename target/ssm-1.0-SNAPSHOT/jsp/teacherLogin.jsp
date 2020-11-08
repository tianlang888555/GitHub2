<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath=request.getScheme()+"://"+request.getServerName()
        +":"+request.getServerPort()+request.getContextPath()+"/";%>
<head>
    <meta charset="UTF-8">
    <base href="<%=basePath%>">
    <title>教师机登录入口</title>
</head>
<body>
<h3 align="center">教师登录入口</h3>
<div align="center">
<form action="teacher/login" method="post">
    用户名：<input type="text" name="teacherId"><br>
    &nbsp;&nbsp;密码:&nbsp; &nbsp;&nbsp;<input type="password" name="tpswd"><br><br>
    &nbsp;&nbsp;<input type="reset" value="清空"> <input type="submit" value="登录">
</form>
</div>
<div align="center" style="color: red"><h4>${loginRes}</h4></div>
</body>
</html>