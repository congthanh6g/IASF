<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<h1>Index</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Wage</th>
    </tr>
    <c:forEach var = "p" items = "${listP}">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.wage}</td>
        </tr>
    </c:forEach>
</table>

<h1><a href = "signup">Add an employee</a></h1>


</body>
</html>