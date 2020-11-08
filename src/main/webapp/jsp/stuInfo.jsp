<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/4
  Time: 8:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath=request.getScheme()+"://"+request.getServerName()
        +":"+request.getServerPort()+request.getContextPath()+"/";%>
<html>
<head>
    <title>学生信息查看</title>
    <base href="<%=basePath%>">
</head>
<body>
<h3 align="center">${sessionScope.student.name}同学的个人信息</h3>
<div align="center">
    <table border="1px" style="color: #860303">
        <tr>
            <td>姓名：</td>
            <td>${sessionScope.student.name}</td>
            <td>年龄：</td>
            <td>${sessionScope.student.age}岁</td>
            <td>性别</td>
            <td>${sessionScope.student.sex}</td>
        </tr>
        <tr>
            <td>教师信息：</td>
            <td>${sessionScope.student.teacherName}老师</td>
            <td>教师编号：</td>
            <td>${sessionScope.student.teacherId}</td>
            <td>学号</td>
            <td>${sessionScope.student.id}</td>
        </tr>
    </table>

</div><h5 align="center"><a>修改信息</a></h5>
<div align="center"><h4><a href="quit/stu">退出</a></h4></div>
</body>
</html>
