<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>SSM Demo</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <meta charset="UTF-8">
</head>
<body>

<h2 class="page-header"> User表显示所有字段 </h2>

<table>
    <tr>
        <td><button type="button" class="btn btn-primary" onclick="window.location.href='addPage'">添加</button></td>
        <td><button type="button" class="btn btn-success" onclick="window.location.href='deletePage'">删除</button></td>
    </tr>
</table>

<table class="table table-hover table-striped">
    <tr>
        <th>编号</th>
        <th>名字</th>
        <th>年龄</th>
        <th>地址</th>
    </tr>
    <c:forEach var="user" items='${userList}'>
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>${user.address}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>