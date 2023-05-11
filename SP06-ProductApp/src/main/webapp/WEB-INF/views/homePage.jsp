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
		
	<div style="text-align:center;">
		<h1>this is a home page</h1>
		<h1>Add Product</h1>
		
		<form action="addProduct" method="post">
			<table>
				<tr>
					<th>Id</th>
					<th>Product Name</th>
					<th>Description</th>
					<th>Price</th>
				</tr>
				
				<c:forEach items="${products }" var="p">
					<tr>
						<td>${p.id}</td>
						<td>${p.name}</td>
						<td>${p.description}</td>
						<td>${p.price}</td>
						
						<td><a href="deleteProduct/${p.id}">Delete</a></td>
						<td><a href="updateProduct/${p.id}">Update</a></td>
						
						
						
					</tr>
				</c:forEach>
				
				<tr>
					<td><input type="submit" name="submit" value="Add" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>