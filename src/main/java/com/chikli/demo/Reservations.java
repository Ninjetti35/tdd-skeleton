package com.chikli.demo;

import java.util.ArrayList;
import java.util.List;

public class Reservations {

    List<Reservation> reservationList = new ArrayList<>();
    int reservationCounter = 0;

    public Reservation getReservationById(int reservationId) {
        for(Reservation reservation: reservationList) {
            if(reservation.getReservationId() == reservationId) {
                return reservation;
            }
        }
        return null;
    }

    public int addReservation(Reservation reservation) {
        reservationCounter++;
        reservation.setReservationId(reservationCounter);
        reservationList.add(reservation);
        return reservation.getReservationId();
    }
}
