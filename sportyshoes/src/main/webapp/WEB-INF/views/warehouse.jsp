<%@page import="com.sportyshoes.basepackage.model.ShoeData"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.sportyshoes.basepackage.controller.WareHouseController" %>
<%@ page import="java.util.*" %>
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
<!--	<jsp:useBean id="allShoes" type="java.util.List" scope="request"></jsp:useBean> -->
	<!--<%
		for(Iterator it = allShoes.iterator(); it.hasNext();){
			ShoeData shoe = (ShoeData) it.next();
	%>
	
	<%= shoe.getId() %>
	<%= shoe.getColor() %>
	
	<%} %>  -->

 	<c:forEach var="item" items="${allShoes}"> 

 			<tr>
				<td>${item.id}</td>
				<td>${item.color}</td>
				<td>${item.description}</td>
				<td>${item.price}</td>
				<td>${item.shoename}</td>
				<td>${item.size}</td>
				<td>${item.usergroup}</td>				
			</tr>
		</c:forEach>

		
		
		
	</table>
</body>
</html>