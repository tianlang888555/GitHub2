<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/2
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath=request.getScheme()+"://"+request.getServerName()
        +":"+request.getServerPort()+request.getContextPath()+"/";%>
<html>
<head>
    <title>学生主界面</title>
    <base href="<%=basePath%>">
</head>
<body>
<h5>欢迎您"${sessionScope.student.name}"同学</h5>
<br>
<br><br>
<div style="color: aquamarine" >
<ul>个人信息
    <li><a href="jsp/stuInfo.jsp">信息查看</a></li>
    <li><a href="student/drop">登出系统
    </a></li>
</ul>
<ul>考试信息
    <li><a href="paper/stu.do">开始考试</a></li>
    <li>错题记录</li>
    <li><a href="score/stufind">成绩统计</a></li>
</ul>
<ul>
    <li>教师信息</li>
    <li>考生建议</li>
</ul>
</div>
</body>
</html>
