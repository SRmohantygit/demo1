<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Registration</title>
</head>
<body>
<h2 style="color:fushsia">Create New Account</h2>
<form action="saveReg"method="post">
<pre>
first name<input style="color:fushsia" type="text"name="firstName" placeholder="Enter firstName"/>
last name<input style="color:fushsia" type="text"name ="lastName" placeholder="Enter lastName"/>
email<input style="color:fushsia" type="text"name ="email" placeholder="Enter email"/>
password<input style="color:fushsia" type="text" name ="password" placeholder="Enter password"/>
<input style="color:fushsia" type="submit" value="save"/>
</pre>
</form>
</body>
</html>