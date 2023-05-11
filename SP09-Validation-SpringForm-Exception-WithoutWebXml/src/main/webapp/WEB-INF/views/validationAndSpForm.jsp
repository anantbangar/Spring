<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.error{
		color: red
	}
</style>
</head>
<body>
	<form:form action="validationAndSpFormSubmit" modelAttribute="emp">
		UserName : <form:input path="name"/><br>
		Password : <form:password path="password"/>
		<form:errors path="password" cssClass="error"/><br>
		Age : <form:input path="age"/>
		<form:errors path="age" cssClass="error"/><br>
		<input type="submit" value="Submit" />
	</form:form>
		
</body>
</html>