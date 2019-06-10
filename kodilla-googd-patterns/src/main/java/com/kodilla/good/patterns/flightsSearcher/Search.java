package com.kodilla.good.patterns.flightsSearcher;

import java.util.Set;
import java.util.stream.Collectors;

public class Search {
    public void searchTo(Set<Flight> theList, String AirPort) {

        theList.stream()
                .filter(l-> l.getArrivalAirport().equals(AirPort))
                .forEach(System.out::println);
    }

    public void searchFrom(Set<Flight> theList, String AirPort) {

        theList.stream()
                .filter(l-> l.getDepartureAirport().equals(AirPort))
                .forEach(System.out::println);
    }

    public void searchThrough(Set<Flight> theList, String AirPort1, String AirPort2) {
        Set<Flight> list1 = theList.stream()
                .filter(l -> l.getDepartureAirport().equals(AirPort1))
                .collect(Collectors.toSet());
        Set<Flight> list2 = theList.stream()
                .filter(l -> l.getArrivalAirport().equals(AirPort2))
                .collect(Collectors.toSet());
        for(Flight flight1 : list1){
            for(Flight flight2 : list2){
                if(flight1.getArrivalAirport().equals(flight2.getDepartureAirport())) {
                    System.out.println(flight1);
                    System.out.println(flight2);
                }
            }
        }
    }
}
