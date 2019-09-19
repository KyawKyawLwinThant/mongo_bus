package com.example.busticket_mongo.model;

public class Seats {

    private String seatsNumber;
    private SeatStaus seatStaus;

    public Seats(String seatsNumber, SeatStaus seatStaus) {
        this.seatsNumber = seatsNumber;
        this.seatStaus = seatStaus;
    }

    public String getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(String seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public SeatStaus getSeatStaus() {
        return seatStaus;
    }

    public void setSeatStaus(SeatStaus seatStaus) {
        this.seatStaus = seatStaus;
    }
}
