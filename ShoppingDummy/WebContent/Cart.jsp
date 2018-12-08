<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="home.css">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="Cart1">
<header class="head">
<image src="Desert.jpg" alt="Product1"   height=100 width=100>
	<h1 align=center>Welcome to ShoppingCart</h1>
	<center>
		<nav>
		<pre>
			<a href="Homepage.jsp">Home</a>			<a href="#">About</a>			<a href="login.jsp">Login</a>			<a
				href="registration.jsp">Register</a>                <a href="Cart.jsp">Cart</a>
		</pre></nav>
	</center>
	<hr>
	</header>





<center>
	<table height="100%" width="100%" >
		<tr class="product1">
			<td><image src="" alt="Iphone" height=100 width=100></td>
			<td><a href="#">Iphone</a><br>Price:40000<br></td>
			<td><input type="button" name="Cancle" value="Cancle"></td>
			<td>  <input type="number" name="quantity" min="0" max="100" step="1" value="1"></td>
		</tr>
		<tr class="product2">
			<td><image src="Desert.jpg" alt="SANDISK" height=100 width=100></td>
			<td><a href="#">SANDISK</a><br>Price:2000<br></td>
			<td><input type="button" name="Cancle" value="Cancle"></td>
			<td>  <input type="number" name="Quantity" min="0" max="100" step="1" value="1"></td>
		</tr>
		<tr class="product1">
			<td><image src="Desert.jpg" alt="HP" height=100 width=100></td>
			<td><a href="#">HP</a><br>Price:9000<br></td>
			<td><input type="button" name="Cancle" value="Cancle"></td>
			<td>  <input type="number" name="Quantity" min="0" max="100" step="1" value="1"></td>
		</tr>
		<tr class="product2">
			<td><image src="Desert.jpg" alt="SONY" height=100 width=100></td>
			<td><a href="#">SONY</a><br>Price:12000<br></td>
			<td><input type="button" name="Cancle" value="Cancle"></td>
			<td>  <input type="number" name="Quantity" min="0" max="100" step="1" value="1"></td>
		</tr>
				<tr class="product1">
			<td><image src="Desert.jpg" alt="SONY" height=100 width=100></td>
			<td><a href="#">SONY</a><br>Price:120000<br></td>
			<td><input type="button" name="Cancle" value="Cancle"></td>
			<td>  <input type="number" name="Quantity" min="0" max="100" step="1" value="1"></td>
		</tr>
	</table>
	
	Total Amount:<input type="text" name="TotalAmount">
	<br>
	<br>
<a href="Delivery.jsp"><input type="button"  value="Procede to Checkout"></a></center>













<footer>
<hr>
<center><h2>Thank you for shopping</h2></center>
</footer>
</form>
</body>
</html>