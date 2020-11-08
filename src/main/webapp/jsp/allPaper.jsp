<%@ page import="com.cdlg.exam.proj.Paper" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/4
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>全部试题</title>
</head>
<body>
<h4>全部试题</h4>
    <table align="center" border="1px">
        <tr>
            <th>题号</th>
            <th>题目</th>
            <th>A</th>
            <th>B</th>
            <th>C</th>
            <th>D</th>
            <th>答案</th>
        </tr>
        <% for (Paper paper:(List<Paper>)request.getAttribute("papers")
        ) {
        %>
        <tr>
            <td><%=paper.getPaperId()%> </td>
            <td><%=paper.getTitle()%></td>
            <td><%=paper.getRa()%></td>
            <td><%=paper.getRb()%></td>
            <td><%=paper.getRc()%></td>
            <td><%=paper.getRd()%></td>
            <td><%=paper.getRight()%></td>
        </tr>
        <%}%>
    </table>
</body>
</html>
