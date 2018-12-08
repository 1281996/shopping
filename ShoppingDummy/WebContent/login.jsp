


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" type="text/css" href="login.css">
<title>Insert title here</title>

</head>
<body>
<h1>Login Page</h1>
<form name="form" method="POST" action="ValidLogin">
 <div class="imgcontainer">
   
  </div>
 <div class="container">
    <label for="uname"><b>Username</b></label>
<input type="text" placeholder="Enter Username/FirstName"  name="userName" size="30">
<label for="psw"><b>Password</b></label>
<input type="password" placeholder="Enter Password" name="password" maxlength="15" min="6">
<input type="submit"  value="submit" name="submit" >
 </div>
 
 <div class="container" style="background-color:#f1f1f1">

    <span class="reg"><a href="registration.jsp">registration</a></span>
  </div>

</form>
</body>
</html>