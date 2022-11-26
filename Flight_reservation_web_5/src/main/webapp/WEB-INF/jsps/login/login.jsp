<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h2 Style="color:purple">Login here</h2>
<form action="verifyLogin"method="post">
email id<input Style="color:gray" type ="text" name="emailid">
password<input Style="color:gray" type="password" name="password">
<input Style="color:gray" type="submit" value ="login">
</form>
</body>
${msg}
</html>