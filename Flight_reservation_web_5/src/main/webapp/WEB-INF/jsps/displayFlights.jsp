<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Flights</title>
</head>
<body>
<h2 style ="color:green">Show Flight Result</h2>

<h2 style ="color:Blue">List of Flights</h2>

<table border="1">
<tr>
	<tr style="color:maroon">
	<th style="color:red">Airlines</th>
	<th style="color:red">Departure City</th>
	<th style="color:red">Arrival City</th>
	<th style="color:red">Departure Time</th>
	<th style="color:red">Select Flight</th>
</tr>
<c:forEach items="${findFlights}" var="findFlights">
	
		<tr style="color:maroon">
			<td style="color:maroon">${findFlights.operatingAirlines}</td>
			<td style="color:maroon">${findFlights.departureCity}</td>
			<td style="color:maroon">${findFlights.arrivalCity}</td>
			<td style="color:maroon">${findFlights.estimatedDepartureTime}</td>
		<td style="color:green"><a href ="showCompleteReservation?flightId=${findFlights.id }" >select</a></td>
		</tr>

</c:forEach>
</table>
</body>
</html>