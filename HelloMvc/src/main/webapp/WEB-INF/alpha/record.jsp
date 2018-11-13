<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:forEach  items="${list}" var="l">
<a href="http://google.com"><c:out value="${l}"/></a>
</c:forEach>

<select name="list">
<c:forEach  items="${list}" var="l">
<option value="${l}}">${l}</option>
</c:forEach>
</select>


</body>
</html>