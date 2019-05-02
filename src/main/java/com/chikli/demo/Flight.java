package com.chikli.demo;

import java.math.BigDecimal;
import java.time.LocalTime;

public class Flight {

    private int flightNum;
    private String origin;
    private String destination;
    private String takeoff;
    private String landing;
   // private Amenities amenities;
    private double price;

    public Flight(int flightNum, String origin, String destination, String takeoff, String landing
    , double price) {
        this.flightNum = flightNum;
        this.origin = origin;
        this.destination = destination;
        this.takeoff = takeoff;
        this.landing = landing;
        this.price = price;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
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

    public String getTakeoff() {
        return takeoff;
    }

    public void setTakeoff(String takeoff) {
        this.takeoff = takeoff;
    }

    public String getLanding() {
        return landing;
    }

    public void setLanding(String landing) {
        this.landing = landing;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flight:" + "\r\n" +
                "Flight number: " + flightNum + "\r\n" +
                "Leaving: " + origin + "\r\n" +
                "Destination: " + destination + "\r\n" +
                "Takeoff Time: " + takeoff + "\r\n" +
                "Landing Time: " + landing + "\r\n" +
                "Cost: " + price;
    }
}
