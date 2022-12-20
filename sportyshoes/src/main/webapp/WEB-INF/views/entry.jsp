<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shoes warehouse</title>
</head>
<body>

	<h2>${message}</h2>
	
	<h3>To add an Item:</h3>
	<form action="additem" method="get">
		Enter Color  name: <input type="text" name="color"><br>
		Enter Description: <input type="text" name="description"><br>
		Enter Price: <input type="number" name="price"><br>
		Enter Shoe Name: <input type="text" name="shoename"><br>
		Enter Size: <input type="text" name="size"><br>
		Enter User Group: <input type="text" name="usergroup"><br>
		<button>Submit</button>
	</form>
	
	<h3>To delete an Item:</h3>
	<form action="" method="get">
		Enter Shoe name: <input type="text" name="shoename"><br>
		<button>Submit</button>
	</form>
	
	<h3>To view an Item by name:</h3>
	<form action="" method="get">
		Enter Shoe name: <input type="text" name="shoename"><br>
		<button>Submit</button>
	</form>
	
	<a href="getallitem" name="getallitem">View all items</a>
	
</body>
</html>