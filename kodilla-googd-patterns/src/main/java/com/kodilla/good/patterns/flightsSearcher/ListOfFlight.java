package com.kodilla.good.patterns.flightsSearcher;

import java.util.HashSet;
import java.util.Set;

public class ListOfFlight {
    private Set<Flight> theList = new HashSet<>();

    public ListOfFlight() {
        theList.add(new Flight("GDN", "WAW"));
        theList.add(new Flight("WAW", "GDN"));
        theList.add(new Flight("KRK", "POZ"));
        theList.add(new Flight("POZ", "KRA"));
        theList.add(new Flight("GDN", "WRO"));
        theList.add(new Flight("POZ", "WAW"));
        theList.add(new Flight("WRO", "POZ"));
        theList.add(new Flight("GDN", "WAW"));
        theList.add(new Flight("WRO", "GDN"));
        theList.add(new Flight("GDN", "POZ"));
    }

    public Set<Flight> getTheList() {
        return new HashSet<> (theList);
    }
}
