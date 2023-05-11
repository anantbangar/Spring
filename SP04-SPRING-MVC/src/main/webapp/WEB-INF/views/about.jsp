<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.util.List"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>about page</title>
</head>
<body>
	<h1>this is about page called by Controller</h1>

	<%
		/* String name = (String) request.getAttribute("name");
		String city = (String) request.getAttribute("city");

		List<String> listFriends = (List<String>) request.getAttribute("listFriends"); */
	%>

	<h3>
		Name is
		<%-- <%=name%> --%>
		${name}
	</h3>
	<h3>
		City is
		<%-- <%=city%> --%>
		${city}
	</h3>

	<h3>
		Friends list is
		<%-- <%=listFriends%> --%>
		${listFriends}
	</h3>
	
	<%-- <% for(String s : listFriends){ 
	%>
	<h3><%=s %></h3>
	<%} %> --%>
	
	<c:forEach items="${listFriends}" var="friends" >
		<h3>${friends}</h3>
	</c:forEach>
	
	
</body>
</html>