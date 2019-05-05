package com.kodilla.exception.test;

public class FindFlightRunner {
    public static void main(String[] args){
        FindFightImitation findFightImitation = new FindFightImitation();
        Flight flight = new Flight("AAA", "KRK");
        try {
            findFightImitation.findFlight(flight);
        }
        catch (Exception e){

            System.out.println(e);
            System.out.println("Wybierz inne lotnisko.");

        }

        }
    }

