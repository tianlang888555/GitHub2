<%@ page import="com.cdlg.exam.proj.Score" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/4
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath=request.getScheme()+"://"+request.getServerName()
        +":"+request.getServerPort()+request.getContextPath()+"/";%>
<html>
<head>
    <title>学生成绩</title>
    <base href="<%=basePath%>">
</head>
<body>
<h3 align="center">${sessionScope.student.name}同学的平均成绩：${avg}</h3>
<div align="center">评价
    <table border="1px">
        <tr>
            <td>次数:</td>
            <td>学号：</td>
            <td>姓名：</td>
            <td>时间：</td>
            <td>分数：</td>
        </tr>
        <% int i=0;
            for (Score score:(List<Score>)request.getAttribute("scores")
                 ) {i++; %>
                <tr>
                    <td>第<%=i%>次</td>
                    <td><%=score.getStudentId()%></td>
                    <td><%=score.getStudentName()%></td>
                    <% long time=score.getDate().getTime();
                        Date date =new Date(time);
                        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd " +
                                "HH:mm:ss");
                        String examTimes=sdf.format(date);
                    %>
                    <td><%=examTimes%></td>
                    <td><%=score.getGrade()%></td>
                </tr>
            <%}%>
    </table>
</div>
<div align="center"><h4><a href="quit/stu">退出</a></h4></div>
</body>
</html>
