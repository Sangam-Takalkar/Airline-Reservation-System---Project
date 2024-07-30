package com.airline.servlet;

import com.airline.model.Flight;
import com.airline.dao.FlightDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/searchFlights")
public class FlightSearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String origin = request.getParameter("origin");
        String destination = request.getParameter("destination");

        List<Flight> flights = FlightDAO.searchFlights(origin, destination);

        request.setAttribute("flights", flights);
        request.getRequestDispatcher("showFlights.jsp").forward(request, response);
    }
}
