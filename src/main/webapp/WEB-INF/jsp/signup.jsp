<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
    <style>

    </style>
</head>
<body>
<h1>Index</h1>

<form action = "signup" method="post">
    Enter name : <input type="text" name ="name" required="true">
    Enter wage : <input type="text" name = "wage" required="true">
    <input type = "submit" value = "Submit">
</form>
</body>
</html>