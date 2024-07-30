package com.airline.model;

import java.util.Date;

public class Booking {
    private int bookingId;
    private int userId;
    private int flightId;
    private Date bookingDate;
    private String seatClass; // Economy, Business, First, etc.
    private int seatNumber;

    // Constructors
    public Booking() {}

    public Booking(int bookingId, int userId, int flightId, Date bookingDate, String seatClass, int seatNumber) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.flightId = flightId;
        this.bookingDate = bookingDate;
        this.seatClass = seatClass;
        this.seatNumber = seatNumber;
    }

    // Getters and Setters
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    // toString method
    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", userId=" + userId +
                ", flightId=" + flightId +
                ", bookingDate=" + bookingDate +
                ", seatClass='" + seatClass + '\'' +
                ", seatNumber=" + seatNumber +
                '}';
    }
}
