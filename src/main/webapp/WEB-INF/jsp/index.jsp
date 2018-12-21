<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h1>${content}</h1>
<h2>${name}</h2>
<form>
    <table border="1" width="700">
        <tr align="center">
            <td>编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
            <td>邮件</td>
        </tr>




    <c:forEach items="${userList}" var="stu">
        <tr align="center"></tr>
        <td>${stu.uid}</td>
        <td>${stu.username}</td>
        <td>${stu.gender}</td>
        <td>${stu.age}</td>
        <td>${stu.email}</td>

    </c:forEach>
    </table>
</form>
</body>
</html>