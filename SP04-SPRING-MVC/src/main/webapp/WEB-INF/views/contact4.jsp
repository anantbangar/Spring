<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact4 Page</title>
</head>
<body>
	<h1>This is Contact4 Page </h1>
	<h1>Using @ModelAttribute in Controller </h1>
	
	<form action="processContact4" method="post">
		
		<input type="email" name="email" placeholder="Enter email id"/><br>
		<input type="text" name="userName" placeholder="Enter user name" /><br>
		<input type="password" name="password" placeholder="Enter password" /> <br>
		<input type="submit" name="submit" value="Submit" /><br>
		
	</form>
</body>
</html>