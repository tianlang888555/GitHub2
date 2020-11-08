<%@ page import="com.cdlg.exam.proj.Paper" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/3
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath=request.getScheme()+"://"+request.getServerName()
        +":"+request.getServerPort()+request.getContextPath()+"/";%>
<html>
<head>
    <title>exam</title>
    <base href="<%=basePath%>">
</head>
<body>
<h4>开始考试，${sessionScope.student.name}同学</h4>
<form action="paper/mark">
<table align="center" border="1px">
    <tr>
        <th>序号</th>
        <th>题号</th>
        <th>题目</th>
        <th>A</th>
        <th>B</th>
        <th>C</th>
        <th>D</th>
        <th>答案</th>
    </tr>
    <%Map<Integer,String> res=new HashMap();int i=0; %>
    <% for (Paper paper:(List<Paper>)request.getAttribute("papers")
            ) {
    %>
    <tr>
        <td><%=++i%></td>
        <td><%=paper.getPaperId()%> </td>
        <td><%=paper.getTitle()%></td>
        <td><%=paper.getRa()%></td>
        <td><%=paper.getRb()%></td>
        <td><%=paper.getRc()%></td>
        <td><%=paper.getRd()%></td>
        <%String right="right"+paper.getPaperId();
          Integer paperId=paper.getPaperId();
        %>
        <td><input type="hidden" name="<%=paperId%>" value="<%=paperId%>">
            A:<input type="radio" name="<%=right%>" value="A">
            B:<input type="radio" name="<%=right%>" value="B">
            C:<input type="radio" name="<%=right%>" value="C">
            D:<input type="radio" name="<%=right%>" value="D">
        </td>
    </tr>
    <%res.put(paperId,right);%>
    <%}%>
    <%request.getSession().setAttribute("res",res);%>
</table>
<div align="center"><h><input type="submit" value="交卷"></h></div>
</form>
<div align="center"><h4><a href="quit/stu">退出</a></h4></div>

</body>
</html>
