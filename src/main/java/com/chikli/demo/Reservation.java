package com.chikli.demo;

public class Reservation {

    private int flightNum;
    private int reservationId;
    private String name;
    private String creditCard;
    private int numReservations;
    private String flightDate;

    public Reservation(int flightNum, String name,
                       String creditCard, String flightDate) {
        this.flightNum = flightNum;

    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
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

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                "flightNum=" + flightNum +
                ", name='" + name + '\'' +
                ", creditCard='" + creditCard + '\'' +
                ", flightDate='" + flightDate + '\'' +
                '}';
    }
}
