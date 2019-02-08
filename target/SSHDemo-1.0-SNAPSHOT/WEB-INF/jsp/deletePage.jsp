<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>SSM Demo</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <meta charset="UTF-8">
</head>
<body>

    <h2 class="page-header"> User表删除字段 </h2>

    <form action="delete" method="post">
        <div class="form-group">
            <label>id</label>
            <input name="id" type="text" class="form-control" placeholder="id">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
    </form>

</body>
</html>