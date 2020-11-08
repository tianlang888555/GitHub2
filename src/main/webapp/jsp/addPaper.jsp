<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/2
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath=request.getScheme()+"://"+request.getServerName()
        +":"+request.getServerPort()+request.getContextPath()+"/";%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>">
</head>
<body>
    <h3 align="center">试题添加模块</h3>
<table  align="center"  style="color: burlywood" height="100px">
    <form action="paper/add.do" method="post">
        <tr>
            <td>题目： </td>
            <td><input type="text"  size="50px" name="title"></td>
        </tr>
        <tr>
            <td>A：</td>
            <td><input type="text" name="ra"></td>
        </tr>
        <tr>
            <td>B：</td>
            <td><input type="text" name="rb"></td>
        </tr>
        <tr>
            <td>C：</td>
            <td><input type="text" name="rc"></td>
        </tr>
        <tr>
            <td>D：</td>
            <td><input type="text" name="rd"></td>
        </tr>
        <tr>
            <td>答案：</td>
            <td>
                A:<input type="radio" name="right" value="A">
                B:<input type="radio" name="right" value="B">
                C:<input type="radio" name="right" value="C">
                D:<input type="radio" name="right" value="D">
            </td>
        </tr>
        <tr>
            <td><input type="reset" value="清空"></td>
            <td><input type="submit" value="提交"></td>
        </tr>
    </form>
</table>
<h4 align="center">${sta}</h4>
    <div align="center"><h4><a href="quit/tea">退出</a></h4></div>
</body>
</html>
