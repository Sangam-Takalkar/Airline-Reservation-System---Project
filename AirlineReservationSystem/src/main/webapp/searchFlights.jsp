<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<table>
    <thead>
        <tr>
            <th>Flight Number</th>
            <th>Airline</th>
            <th>Departure Time</th>
            <th>Arrival Time</th>
            <th>Price</th>
            <th>Availability</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="flight" items="${flights}">
            <tr>
                <td>${flight.flightNumber}</td>
                <td>${flight.airline}</td>
                <td>${flight.departureTime}</td>
                <td>${flight.arrivalTime}</td>
                <td>${flight.price}</td>
                <td>${flight.availability}</td>
                <td><a href="bookFlight.jsp?flightId=${flight.id}">Book</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>

    