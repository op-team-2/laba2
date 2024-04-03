<%@ page import="com.labs.labs.lab4.Actor" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>OP Team №2</title>
    </head>
    <body>
        <h1>OP Team №2</h1>
        <p><a href="static/pages/arsaide.jsp">Kirill Murahovskiy</a></p>
        <p><a href="static/pages/guntyk.jsp">Daniil Mashyn</a></p>
        <p><a href="static/pages/octopus.jsp">Kunda Andrii</a></p>
        <p><a href="static/pages/iryna.jsp">Iryna Martyshenko</a></p>

        <h3>Our labs</h3>
        <ul>
            <li><a href="static/labs/laba2">Laba 2</a></li>
            <li><a href="static/labs/laba3">Laba 3</a></li>
            <li><a href="${pageContext.request.contextPath}/main">Laba 4</a></li>
        </ul>

        <img src="static/images/dancing-cat-6.gif" alt="Dancing cat yopta">
    </body>
</html>