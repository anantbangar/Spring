<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Product Page</h1>
	<form action="saveOrUpdateProduct" method="post">
		<label>Product Name</label>
		<input type="text" name="name" /><br>
		<label>Description</label>
		<input type="text" name="description" /><br>
		<label>Price</label>
		<input type="text" name="price" /><br>
		<input type="submit" name="submit" value="Save" />
	</form>
</body>
</html>