
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.util.List"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
	<h2>Hello World!</h2>
	<h1>I am Anant Bangar</h1>
	<h1>this is Home page called by Controller</h1>

	<%
		/* String name = (String) request.getAttribute("name");
		String city = (String) request.getAttribute("city");

		List<String> listFriends = (List) request.getAttribute("listFriends"); */
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
	
	<c:forEach var="friends" items="${listFriends}">
		<h3>${friends}</h3>
	</c:forEach>

</body>
</html>
