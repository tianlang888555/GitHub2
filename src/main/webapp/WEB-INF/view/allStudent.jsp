<%@ page import="com.cdlg.exam.proj.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/2
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath=request.getScheme()+"://"+request.getServerName()
        +":"+request.getServerPort()+request.getContextPath()+"/";%>
<html>
<head>
    <title>该老师的全部学生</title>
</head>
<body>
<h4 align="center">${sessionScope.teacher.teacherName}的学生信息</h4>
<div align="center">
<table border="1px" width="500px" height="100px">
    <tr style="color: cornflowerblue">
        <td>学号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
        <td>成绩单链接</td>
    </tr>
    <%
        for ( Student student :(List<Student>)request.getAttribute("students")
             ) {%>
           <tr style="color: aqua">
               <td><%=student.getId()%></td>
               <td><%=student.getName()%></td>
               <td><%=student.getAge()%></td>
               <td><%=student.getSex()%></td>
               <td><a>查看</a></td>
           </tr>
    <%}%>

</table>
</div>
</body>
</html>
