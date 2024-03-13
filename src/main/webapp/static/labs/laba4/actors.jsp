<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Список акторів</title>
    </head>
    <body>
        <p><a href="../../../index.jsp">Go Home</a></p>
        <h1>Список акторів</h1>
        <a href="movies.jsp">Список фільмів</a>
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
