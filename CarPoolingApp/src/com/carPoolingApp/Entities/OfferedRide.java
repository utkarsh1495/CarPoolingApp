package com.carPoolingApp.Entities;

import java.time.LocalDateTime;

public class OfferedRide {
    int offeredRideId;
    String name;
    String origin;
    String destination;
    int seats;
    Vehicle vehicle;
    LocalDateTime startDateTime;
    int duration;

    public int getOfferedRideId() {
        return offeredRideId;
    }

    public void setOfferedRideId(int offeredRideId) {
        this.offeredRideId = offeredRideId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
