package com.chikli.demo;

import java.util.ArrayList;
import java.util.List;

public class Reservations {

    List<Reservation> reservationList = new ArrayList<>();

    public Reservations() {

    }

    public void addReservation(Reservation reservation) {
        reservationList.add(reservation);
    }
/*
    public List<Flight> findByOrigin(String origin) {
        List<Flight> tempFlight = new ArrayList<>();
        for(Flight flight : flightList) {
            if(flight.getOrigin().equals(origin)) {
                tempFlight.add(flight);
            }
        }
        return tempFlight;
    }

    public List<Flight> findByDestination(String destination) {
        List<Flight> tempFlight = new ArrayList<>();
        for(Flight flight : flightList) {
            if(flight.getDestination().equals(destination)) {
                tempFlight.add(flight);
            }
        }
        return tempFlight;
    }
*/
}
