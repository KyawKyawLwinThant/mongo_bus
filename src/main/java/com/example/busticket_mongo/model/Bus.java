package com.example.busticket_mongo.model;

import java.util.List;

public class Bus {

    private String name;
    private BusStatus busStatus;
    private List<Seats> seats;

    public Bus(String name, BusStatus busStatus, List<Seats> seats) {
        this.name = name;
        this.busStatus = busStatus;
        this.seats = seats;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BusStatus getBusStatus() {
        return busStatus;
    }

    public void setBusStatus(BusStatus busStatus) {
        this.busStatus = busStatus;
    }

    public List<Seats> getSeats() {
        return seats;
    }

    public void setSeats(List<Seats> seats) {
        this.seats = seats;
    }
}
