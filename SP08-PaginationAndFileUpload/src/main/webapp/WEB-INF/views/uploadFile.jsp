<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Upload File from here</h1>
	
	<h3 style="color:red">${fileSuccess}</h3>
	<h3 style="color:red">${fileName}</h3>
	
	<form action="saveFile" method="post" enctype="multipart/form-data">
		<label for="image">Choose Image</label>
		<input type="file" name="file" /><br>
		<input type="submit" value="Upload" />
	</form>
	
	<br>
	
	<img alt="image" src="<c:url value="/resources/images/${fileName}"/>"/>
		
</body>
</html>