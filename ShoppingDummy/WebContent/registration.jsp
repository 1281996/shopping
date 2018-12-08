<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="login.css">
</head>
<body>
<h1>Registration Page</h1>
<form method="POST" action="ValidReg">
<div class="container">

<label for="uname"><b>Firstname</b></label>
<input type="text"  placeholder="Enter First Name" name="firstName" required>
<label for="uname"><b>Lastname</b></label>
<input type="text" placeholder="Enter Last Name" name="lastName">
 <label for="email"><b>Email Id:</b></label>
<input type="email" placeholder="Enter EmailId" name="email">
<label for="phone"><b>Phone No: </b></label>
<input type="text" placeholder="Enter Phone No."  name="phone" required>
<label for="psw"><b>New Password</b></label>
<input type="password"placeholder="Enter Password."  name="password" required><br><br>

<input type="submit" value="submit">

  </div>
  <div class="container" style="background-color:#f1f1f1">

    <span class="login"><a href="login.jsp">Login</a></span>
  </div>
</form>
</body>
</html>