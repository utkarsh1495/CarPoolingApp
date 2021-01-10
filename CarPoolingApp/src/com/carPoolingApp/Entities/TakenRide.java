package com.carPoolingApp.Entities;

public class TakenRide {
    int rideId;
    String driverName;
    int offeredRideId;
    String passengerName;
    int duration;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRideId() {
        return rideId;
    }

    public void setRideId(int rideId) {
        this.rideId = rideId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getOfferedRideId() {
        return offeredRideId;
    }

    public void setOfferedRideId(int offeredRideId) {
        this.offeredRideId = offeredRideId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
}
