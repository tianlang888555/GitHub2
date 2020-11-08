<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath=request.getScheme()+"://"+request.getServerName()
        +":"+request.getServerPort()+request.getContextPath()+"/";%>
<head>
    <meta charset="UTF-8">
    <title>html5</title>
    <base href="<%=basePath%>">
</head>
<body>
<h4 align="center">注册界面</h4><br>
<div align="center">
    <form action="student/regist" method="post">
        姓名： <input type="text" name="name"><br>
        密码: <input type="password" name="spswd"><br>
        年龄:<input type="number" name="age"><br>
        性别：<input type="radio" name="sex" value="男">男
             <input type="radio" name="sex" value="女">女<br>
        教师姓名：<input type="text" name="teacherName"><br>
        教师编号:<input type="text" name="teacherId"><br>
        <input type="reset" value="清空">&nbsp;<input type="submit" value="提交">
    </form>
    <div align="center"><h5>${state}</h5></div>
</div>
</body>
</html>