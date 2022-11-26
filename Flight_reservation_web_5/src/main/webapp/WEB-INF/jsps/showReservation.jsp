<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation</title>
</head>
<body>

<h2 style="color:blue"> Flight </h2>
FlightNumber:${flight.flightNumber }<br>
OperationgAirlines:${flight.operatingAirlines }<br>
DepartureCity:${flight.departureCity }<br>
ArrivalCity:${flight.arrivalCity }<br>
DateOfdeparture:${flight.dateOfDeparture }<br>
EstimatedDepartureTime:${flight.estimatedDepartureTime }<br>

        <h2 style="color:navy">Passenger Details</h2>
	    <form action="ConfirmReservation" method="post">
	    <pre>
		First Name<input type="text" name="firstName"/>
		last Name<input type="text" name="lastName"/>
		Middle Name<input type="text" name="middleName"/>
		Email<input type="text" name="email"/>
		Phone<input type="text" name="phone"/>
		<input type="hidden" name="flightId" value="${flight.id }"/>	
	    <h2 style="color:navy">Enter the card details</h2>
		Card Number<input type="text" /><br/>
		CVV<input type="text"/><br/>
		Expiry Date<input type="text" /><br/>
		Amount<input type="text"/><br/>
	 <input type="submit" value="complete reservation">
	</pre>
	</form>
	</body>
	</html>
	