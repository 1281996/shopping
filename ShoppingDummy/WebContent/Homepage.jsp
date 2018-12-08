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
<header class="head">
<image src="Desert.jpg" alt="Product1"   height=100 width=100>
	<h1 align=center>Welcome to ShoppingCart</h1>

	<center>
		<form ><!-- <div class="search">
  Search:
  <input type="search" name="googlesearch">
  <input type="submit" value="search">
  </div> -->
  <select class="seach">
    <option value="volvo">Categories</option>
  <option value="volvo">Mobile</option>
  <option value="saab">Laptop</option>
  <option value="mercedes">Pendrive</option>
  <option value="audi">Watches</option>
</select>
  
</form>
		<nav>
		<pre>
			<a href="#">Home</a>			<a href="#">About</a>			<a href="login.jsp">Login</a>			<a
				href="registration.jsp">Register</a>                <a href="Cart.jsp">Cart</a>
		</pre></nav>
	</center>
	<hr>
	</header>

	
	
	

	<center>
	<table height="100%" width="100%" >
		<tr class="product1">
			<td><image src="pics/2.jpg" alt="Iphone" height=100 width=100></td>
			<td><a href="desc.html">Iphone</a><br>Price:40000<br></td>
			<!-- <td><input type="button" name="Add to cart" value="Add to cart"></td> -->
		</tr>
		<tr class="product2">
			<td><image src="pics/3.jpg" alt="Redmi" height=100 width=100></td>
			<td><a href="desc2.html">Redmi</a><br>Price:30000<br></td>
			
		</tr>
		<tr class="product1">
			<td><image src="pics/4.jpg" alt="HONOR" height=100 width=100></td>
			<td><a href="desc3.html">HONOR</a><br>Price:60000<br></td>
			
		</tr>
				<tr class="product2">
			<td><image src="pics/5.jpg" alt=" OPPO " height=100 width=100></td>
			<td><a href="desc4.html">OPPO</a><br>Price:20000<br></td>
			
		</tr>
				<tr class="product1">
			<td><image src="pics/6.jpg"alt="MI" height=100 width=100></td>
			<td><a href="#">MI</a><br>Price:4000<br></td>
			
		</tr>
				

	</table>
	</center>
<a href="Homepage2.jsp">	<input type="button" name="next" value="Next" align="right"></a>
<footer>
<hr>
<center><h2>Thank you for shopping</h2></center>
</footer>
</body>
</html>