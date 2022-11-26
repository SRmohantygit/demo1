<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>save location</title>
</head>
<body>
	<h2>save location here...</h2>
	<a href="getalllocation" >see all locations</a>
	<form action="locationsave" method="post">
	<pre>
	id:<input type ="text" name="id"/>
	code:<input type ="text" name="code"/>
	name:<input type ="text" name="name"/>
	type:Urban<input type ="radio" name="type" value="urban"/>
	Rural<input type ="radio" name="type" value="rural"/>
	<input type ="submit"  value="save"/>
	</pre>
	</form>
	${msg}
</body>
</html>