<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Product Page</h1>
	
	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>DESCRIPTION</th>
			<th>PRICE</th>
		</tr>
		<c:forEach items="${products}" var="p">
			<tr>
				<td>${p.id}</td>
				<td>${p.name}</td>
				<td>${p.description}</td>
				<td>${p.price}</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="${pageContext.request.contextPath}/${using}/1">1</a>
	<a href="${pageContext.request.contextPath}/${using}/2">2</a>
	<a href="${pageContext.request.contextPath}/${using}/3">3</a>
	<a href="${pageContext.request.contextPath}/${using}/4">4</a>
	<a href="${pageContext.request.contextPath}/${using}/5">5</a>
	
</body>
</html>