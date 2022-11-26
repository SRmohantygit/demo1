<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search flights</title>
</head>
<body>
<h2 style="color:maroon" >Find Flights</h2>
<form action="FindFlights" method="post">
from:<input style="color:maroon" type="text"name="from"/>
to:<input style="color:maroon" type ="text"name ="to"/>
departure date:<input style="color:maroon" type ="text" name="departureDate"/>
<input style="color:maroon" type ="submit" value="Search"/>

</form>
</body>
</html>