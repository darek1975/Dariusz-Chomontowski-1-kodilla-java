package com.kodilla.good.patterns.flightsSearcher;

import java.util.Set;

public class Application {
    public static void main(String[] args) {
        ListOfFlight listOfFight = new ListOfFlight();
        Set<Flight> list = listOfFight.getTheList();

        Search search1 = new Search();
        search1.searchFrom(list, "WAW");
        System.out.println();
        Search search2 = new Search();
        search2.searchTo(list, "POZ");
        System.out.println();
        Search search3 = new Search();
        search3.searchThrough(list, "WRO", "POZ");
        System.out.println();
    }
}
