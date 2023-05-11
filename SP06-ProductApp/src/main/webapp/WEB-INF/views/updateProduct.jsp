<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Update Product Page</h1>
	<form action="${pageContext.request.contextPath}/saveOrUpdateProduct" method="post">
		<label>Product Name</label>
		<input type="text" name="name" value="${product.name }"/><br>
		<label>Description</label>
		<input type="text" name="description" value="${product.description }"/><br>
		<label>Price</label>
		<input type="text" name="price" value="${product.price }"/><br>
		<input type="hidden" name="id" value="${product.id }"/><br>
		<input type="submit" name="submit" value="Update" />
	</form>
</body>
</html>