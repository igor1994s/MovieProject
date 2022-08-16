
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test="${empty film.title}">
        <title>Add</title>
    </c:if>
    <c:if test="${!empty film.title}">
        <title>Edit</title>
    </c:if>
</head>
<body>
<c:if test="${empty film.title}">
    <form action="${pageContext.request.contextPath}/add" method="POST">
        <label for="title">Title</label>
        <input type="text" name="title" id="title">
        <label for="year">Year</label>
        <input type="text" name="year" id="year">
        <label for="genre">Genre</label>
        <input type="text" name="genre" id="genre">
        <label for="watched">Watched</label>
        <input type="text" name="watched" id="watched">
        <input type="submit" value="Add film">
    </form>
</c:if>
<c:if test="${!empty film.title}">
    <form action="${pageContext.request.contextPath}/edit" method="POST">
        <input type="hidden" name="id" value="${film.id}">
        <label for="title">Title</label>
        <input type="text" name="title" id="title" value="${film.title}">
        <label for="year">Year</label>
        <input type="text" name="year" id="year"value="${film.year}">
        <label for="genre">Genre</label>
        <input type="text" name="genre" id="genre"value="${film.genre}">
        <label for="watched">Watched</label>
        <input type="text" name="watched" id="watched"value="${film.watched}">
        <input type="submit" value="Edit film">
    </form>
</c:if>

</body>
</html>
