package com.chikli.demo;

import java.math.BigDecimal;
import java.time.LocalTime;

public class Flight {

    private String origin;
    private String destination;
    private LocalTime takeoff;
    private LocalTime landing;
   // private Amenities amenities;
    private BigDecimal price;

    public Flight() {

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

    public LocalTime getTakeoff() {
        return takeoff;
    }

    public void setTakeoff(LocalTime takeoff) {
        this.takeoff = takeoff;
    }

    public LocalTime getLanding() {
        return landing;
    }

    public void setLanding(LocalTime landing) {
        this.landing = landing;
    }



    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
