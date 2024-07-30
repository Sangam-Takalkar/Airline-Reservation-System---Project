<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<form action="confirmBooking" method="post">
    <input type="hidden" name="flightId" value="${flight.id}">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required>
    <label for="phone">Phone:</label>
    <input type="text" id="phone" name="phone" required>
    <label for="payment">Payment Information:</label>
    <input type="text" id="payment" name="payment" required>
    <button type="submit">Confirm Booking</button>
</form>
