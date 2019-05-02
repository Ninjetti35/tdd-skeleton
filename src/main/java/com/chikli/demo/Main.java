package com.chikli.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(final String[] args) throws IOException {
        Flights flights = new Flights();
        Flight flight1 = new Flight("CAK", "CLE", "05/01/2019", "8:00 AM", 99);
        Flight flight2 = new Flight("CMH", "MIA", "05/01/2019", "9:00 AM", 149);
        Flight flight3 = new Flight("PIT", "TPA", "05/01/2019", "2:15 PM", 99);
        Flight flight4 = new Flight("PIT", "TPA", "05/01/2019", "2:15 PM", 99);

        flights.addFlight(flight1);
        flights.addFlight(flight2);
        flights.addFlight(flight3);
        flights.addFlight(flight4);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean run = true;

        System.out.println("Welcome to Debbie's Better Unbelievable Hellicopters");
        System.out.println("=========================================================================");
        System.out.println();

        while (run == true) {
            System.out.println();
            System.out.println("Please select an option");
            System.out.println("1. Search flights");
            System.out.println("2. Add a flight");
            System.out.println("0. Exit");

            int input = Integer.parseInt(reader.readLine());

            if (input == 0){
                run = false;
            }

            else if (input == 1) {
                System.out.println("1. Search by origin");
                System.out.println("2. Search by destination");
                int input2 = Integer.parseInt(reader.readLine());

                if (input2 == 1) {
                    System.out.println("Enter a origin");
                    String input3 = reader.readLine();
                    System.out.println(flights.findByOrigin(input3).toString());
                }
                if (input2 == 2) {
                    System.out.println("Enter a destination");
                    String input4 = reader.readLine();
                    System.out.println(flights.findByDestination(input4).toString());
                }
            }

            else if (input == 2) {
                System.out.println("Enter a origin");
                String origin = reader.readLine();
                System.out.println("Enter a destination");
                String destination = reader.readLine();
                System.out.println("Enter a takeoff time");
                String takeoff = reader.readLine();
                System.out.println("Enter a landing time");
                String landing = reader.readLine();
                System.out.println("Enter a price");
                double price = Double.parseDouble(reader.readLine());
                Flight newFlight = new Flight(origin, destination, takeoff, landing, price);
                flights.addFlight(newFlight);
            }
        }
    }
}
