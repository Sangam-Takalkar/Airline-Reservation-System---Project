package com.airline.dao;

import com.airline.model.Flight;
import com.airline.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FlightDAO {
    public static List<Flight> searchFlights(String origin, String destination) {
        List<Flight> flights = new ArrayList<>();
        try (Connection conn = DBUtil.getConnection()) {
            String sql = "SELECT * FROM Flights WHERE origin = ? AND destination = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, origin);
            stmt.setString(2, destination);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Flight flight = new Flight();
                flight.setFlightId(rs.getInt("flight_id"));
                flight.setAirline(rs.getString("airline"));
                flight.setFlightNumber(rs.getString("flight_number"));
                flight.setOrigin(rs.getString("origin"));
                flight.setDestination(rs.getString("destination"));
                flight.setDepartureTime(rs.getTime("departure_time").toLocalTime());
                flight.setArrivalTime(rs.getTime("arrival_time").toLocalTime());
                flight.setAvailableSeats(rs.getInt("available_seats"));
                flight.setPrice(rs.getBigDecimal("price"));
                flights.add(flight);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flights;
    }
}
