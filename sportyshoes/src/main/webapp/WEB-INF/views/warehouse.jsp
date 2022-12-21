<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>warehouse</title>
</head>
<body>
	<table>
		<th>Id</th>
		<th>Color</th>
		<th>Description</th>
		<th>Price</th>
		<th>Shoe name</th>
		<th>Size</th>
		<th>User Group</th>


 	<c:forEach var="item" items="${totalShoes}"> 

 			<tr>
				<td>${item.id}</td>
				<td>${item.color}</td>
				<td>${item.description}</td>
				<td>${item.price}</td>
				<td>${item.shoeName}</td>
				<td>${item.size}</td>
				<td>${item.userGroup}</td>				
			</tr>
			
	</c:forEach>

<a href="<c:url value="/entry.html"/>">Return to the warehouse</a>		
		
		
	</table>
</body>
</html>