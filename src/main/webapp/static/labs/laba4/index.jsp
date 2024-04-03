<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Actors</title>
</head>
<body>
<h1>Список Акторів і Фильмів</h1>
<ul>
    Актори
    <c:forEach var="actor" items="${actors}">
        <li>${actor.name}</li>
        <ul>
            <c:forEach var="movie" items="${actor.movies}">
                <li>${movie.title}</li>
            </c:forEach>
        </ul>
    </c:forEach>
</ul>
<ul>
    Фільми
    <c:forEach var="movie" items="${movies}">
        <li>${movie.title}</li>
        <ul>
            <c:forEach var="actor" items="${movie.actors}">
                <li>${actor.name}</li>
            </c:forEach>
        </ul>
    </c:forEach>
</ul>
</body>
</html>
