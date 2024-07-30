<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.List" %>
<%@ page import="com.airline.model.Flight" %>


<!DOCTYPE html>
<html>
<head>
    <title>Flight Results</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h1>Available Flights</h1>
    <table border="1">
        <tr>
            <th>Flight Number</th>
            <th>Airline</th>
            <th>Origin</th>
            <th>Destination</th>
            <th>Departure</th>
            <th>Arrival</th>
            <th>Seats</th>
            <th>Price</th>
            <th>Action</th>
        </tr>
        <c:forEach var="flight" items="${flights}">
            <tr>
                <td>${flight.flightNumber}</td>
                <td>${flight.airline}</td>
                <td>${flight.origin}</td>
                <td>${flight.destination}</td>
                <td>${flight.departureTime}</td>
                <td>${flight.arrivalTime}</td>
                <td>${flight.availableSeats}</td>
                <td>${flight.price}</td>
                <td><a href="bookFlight.jsp?flightId=${flight.flightId}">Book</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
