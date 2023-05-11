<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact3 Page</title>
</head>
<body>
	<h1>This is Contact3 Page </h1>
	<h1>Using @RequestParam and Model Class in Controller </h1>
	
	<form action="processContact3" method="post">
		
		<input type="email" name="email" placeholder="Enter email id"/><br>
		<input type="text" name="userName" placeholder="Enter user name" /><br>
		<input type="password" name="password" placeholder="Enter password" /> <br>
		<input type="submit" name="submit" value="Submit" /><br>
		
	</form>
</body>
</html>