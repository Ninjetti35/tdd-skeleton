package com.chikli.demo;

public class Reservation {

    private Flight flight;
    private String name;
    private String creditCard;
    private int numReservations;

    public void setFlight(Flight flight) {
    }

    public Flight getFlight() {
        return flight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public int getNumReservations() {
        return numReservations;
    }

    public void setNumReservations(int numReservations) {
        this.numReservations = numReservations;
    }
}
