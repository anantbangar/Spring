<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.util.List"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>
	<h1>this is help page called by controller</h1>

	<%
	/* String name=(String)request.getAttribute("name");
	String city=(String)request.getAttribute("city");

	List<String> listFriends=(List)request.getAttribute("listFriends");

	LocalDateTime localDateTime=(LocalDateTime)request.getAttribute("time"); */
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
		Friends lis is
		<%-- <%=listFriends%> --%>
		${listFriends}
	</h3>

	<h3>
		Date and Time is
		<%-- <%=localDateTime%> --%>
		${time}
	</h3>
	
	<c:forEach var="friends" items="${listFriends}">
		<h3>${friends}</h3>
	</c:forEach>
</body>
</html>