package Flights;

import java.util.ArrayList;
import java.util.List;

public class Flights {
    private String departureAirport;
    private String arrivalAirport;

    public Flights(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
