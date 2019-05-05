package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Set;

public class FindFightImitation {
    private static boolean checkIfExistsOnMap (Set<String> airportSet, String chekingAirport) {
        boolean isOnMap = airportSet.stream()
                .anyMatch(n -> n.equals(chekingAirport));
        return isOnMap;
    }


    public final void findFlight(Flight flight) throws RouteNotFoundException {

        final HashMap<String, Boolean> availability = new HashMap<>();
        availability.put("BER", true);
        availability.put("WAW", true);
        availability.put("KRK", false);
        availability.put("HAN", true);
        availability.put("PAR", true);
        availability.put("MAD", true);
        availability.put("GDG", true);

        if (checkIfExistsOnMap(availability.keySet(), flight.arrivalAirport) == true && checkIfExistsOnMap(availability.keySet(), flight.departureAirport) == true) {
            System.out.println("Kontynuuję...");
        } else {
            throw new RouteNotFoundException("Nie ma takiego lotniska w bazie danych.");
        }
    }
}
