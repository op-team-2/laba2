<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Список фільмів</title>
    </head>
    <body>
        <p><a href="../../../index.jsp">Go Home</a></p>
        <h1>Список фільмів</h1>
        <a href="actors.jsp">Список акторів</a>
        <ul>
            <jsp:useBean id="movies" scope="request" type="com.labs.labs.MainServlet"/>
            <c:if test="${not empty movies}">
                <c:forEach var="movie" items="${movies}">
                    <li>${movie.title}</li>
                </c:forEach>
            </c:if>
            <c:if test="${empty movies}">
                <li>Немає фільмів</li>
            </c:if>
        </ul>
    </body>
</html>
