<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Лаба 4</title>
    </head>
    <body>
    <a href="../../../index.jsp">Home Page</a>
    <h1>Laba 4</h1>
    <ul>
        <jsp:useBean id="actors" scope="request" type="com.labs.labs.MainServlet"/>
        <c:if test="${not empty actors}">
            <c:forEach var="actor" items="${actors}">
                <li>${actor.name}</li>
            </c:forEach>
        </c:if>
        <c:if test="${empty actors}">
            <li>Немає акторів</li>
        </c:if>
    </ul>
    </body>
</html>
