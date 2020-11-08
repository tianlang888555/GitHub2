<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/2
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath=request.getScheme()+"://"+request.getServerName()
        +":"+request.getServerPort()+request.getContextPath()+"/";%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>">
</head>
<body>
<%--教师机增加学生--%>
<div align="center">
    <form action="student/add" method="post">
        姓名:<input type="text" name="name"><br>
        密码:<input type="password" name="spswd"><br>
        年龄:<input type="number" name="age"><br>
        性别:<input type="radio" name="sex" value="男">男
        <input type="radio" name="sex" value="女">女<br>
        教师姓名：<input type="text" name="teacherName"
                    value="${sessionScope.teacher.teacherName}"><br>
        教师编号:<input type="text" name="teacherId"
                    value="${sessionScope.teacher.teacherId}"><br>
        <input type="reset" value="清空">&nbsp;<input type="submit" value="加入">
    </form>
    <div align="center"><h5>${state}</h5></div>
</div>
<div align="center"><h4><a href="quit/stu"></a></h4></div>
</body>
</html>
