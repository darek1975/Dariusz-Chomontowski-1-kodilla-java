package com.kodilla.good.patterns.flightsSearcher;

public class Flight {
    private String departureAirport;
    private String arrivalAirport;


    public Flight(String departureArport, String arrivalAirport) {
        this.departureAirport = departureArport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return "AirPortFrom='" + departureAirport + '\'' +
                ", AirPortTo='" + arrivalAirport + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!getDepartureAirport().equals(flight.getDepartureAirport())) return false;
        return getArrivalAirport().equals(flight.getArrivalAirport());
    }

    @Override
    public int hashCode() {
        int result = getDepartureAirport().hashCode();
        result = 31 * result + getArrivalAirport().hashCode();
        return result;
    }
}
