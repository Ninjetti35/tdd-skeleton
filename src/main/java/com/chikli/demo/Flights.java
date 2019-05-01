package com.chikli.demo;

import java.util.ArrayList;
import java.util.List;

public class Flights {

    List<Flight> flightList = new ArrayList<>();

    public Flights() {

    }

    public void addFlight(Flight flight) {
        flightList.add(flight);
    }

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

}
