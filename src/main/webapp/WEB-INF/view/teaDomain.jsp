<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/2
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath=request.getScheme()+"://"+request.getServerName()+
":" +request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>">
</head>
<body>
<h4 align="center">考试系统欢迎${sessionScope.teacher.teacherName}老师登录</h4>
<div style="color: cornflowerblue">
<ul>
    <li>学生信息
        <ol>
            <li><a href="student/allstudent.do">查询全部</a></li>
            <li><a href="jsp/addStudent.jsp">添加学生</a></li>
            <li>学生建议</li>
        </ol>
    </li>
</ul>
<ul>
    <li>考试安排
        <ol>
            <li><a href="paper/allPaper">查询试题</a></li>
            <li><a href="jsp/addPaper.jsp">添加试题</a></li>
        </ol>
    </li>
</ul>
<ul>
    <li>成绩打印
        <ol>
            <li>学生成绩统计</li>
        </ol>
    </li>
</ul>
    </div>
</body>
</html>
