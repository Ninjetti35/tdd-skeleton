package com.chikli.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {

    public static void main(final String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        mainUserInput(reader, System.out);
    }

    private static void mainUserInput(BufferedReader reader, PrintStream out) throws IOException {
        int input = 0;
        Flights flights = new Flights();
        Flight flight1 = new Flight(1,"CAK", "CLE", "05/01/2019", "8:00 AM", 99);
        Flight flight2 = new Flight(2,"CMH", "MIA", "05/01/2019", "9:00 AM", 149);
        Flight flight3 = new Flight(3,"PIT", "TPA", "05/01/2019", "2:15 PM", 99);
        Flight flight4 = new Flight(4,"PIT", "TPA", "05/01/2019", "2:15 PM", 99);

        flights.addFlight(flight1);
        flights.addFlight(flight2);
        flights.addFlight(flight3);
        flights.addFlight(flight4);

        Reservations reservations = new Reservations();
        boolean run = true;

        out.println("Welcome to Debbie's Better Unbelievable Hellicopters");
        out.println("=========================================================================");
        out.println();

        while (run == true) {
            out.println();
            out.println("Please select an option");
            out.println("1. Search flights");
            out.println("2. Add a flight");
            out.println("3. Add a reservation");
            out.println("0. Exit");
            try {
                 input = Integer.parseInt(reader.readLine());
            }
            catch (Exception e) {
                out.println("You broke stuff. Good work.");
            }

            if (input == 0){
                run = false;
            }

            else if (input == 1) {
                out.println("1. Search by origin");
                out.println("2. Search by destination");
                int input2 = Integer.parseInt(reader.readLine());

                if (input2 == 1) {
                    out.println("Enter a origin");
                    String input3 = reader.readLine();
                    out.println(flights.findByOrigin(input3).toString());
                }
                if (input2 == 2) {
                    out.println("Enter a destination");
                    String input4 = reader.readLine();
                    out.println(flights.findByDestination(input4).toString());
                }
            }

            else if (input == 2) {
                out.println("Enter a flight number");
                int flightNum = Integer.parseInt(reader.readLine());
                out.println("Enter a origin");
                String origin = reader.readLine();
                out.println("Enter a destination");
                String destination = reader.readLine();
                out.println("Enter a takeoff time");
                String takeoff = reader.readLine();
                out.println("Enter a landing time");
                String landing = reader.readLine();
                out.println("Enter a price");
                double price = Double.parseDouble(reader.readLine());
                Flight newFlight = new Flight(flightNum, origin, destination, takeoff, landing, price);
                flights.addFlight(newFlight);
            }

            else if (input == 3) {
                out.println("Enter a flight number");
                int flightNum = Integer.parseInt(reader.readLine());
                out.println("Enter a name");
                String name = reader.readLine();
                out.println("Enter a credit card number");
                String ccNum = reader.readLine();
                out.println("Enter a flight date");
                String flightDate = reader.readLine();
                Reservation reservation = new Reservation(flightNum, name, ccNum, flightDate);
                out.println("Your reservation id is "+ reservations.addReservation(reservation));
            }
        }
    }
}
