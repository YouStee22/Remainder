package Flights;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearcher {

    public static void main(String[] args) {

    }
    private FlightDB flightDB;

    public FlightSearcher(FlightDB flightDB) {
        this.flightDB = flightDB;
    }

    public Set<Flights> availableFlightsFrom(String departureAirport) {
        return flightDB.getAvaliableFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(departureAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flights> availableFlightsTo(String arrivalAirports) {
        return flightDB.getAvaliableFlights().stream()
                .filter(flights -> flights.getArrivalAirport().equals(arrivalAirports))
                .collect(Collectors.toSet());
    }

    public Set<List<Flights>> availableConnectiongFlight (String departureAirport, String arrivalAirport) {
        Set<List<Flights>> setOfFlights = new HashSet<>();

        flightDB.getAvaliableFlights().stream()
                .filter(flights -> flights.getDepartureAirport().equals(departureAirport))
                .forEach(flights -> {
                    List<Flights> temp = flightDB.getAvaliableFlights().stream()
                            .filter(fl -> (flights.getArrivalAirport().equals(fl.getDepartureAirport()) && fl.getArrivalAirport().equals(arrivalAirport)))
                            .collect(Collectors.toList());

                    if (temp.size() > 0) {
                        List<Flights> flightRoute = new ArrayList<Flights>();
                        flightRoute.add(flights);
                        flightRoute.addAll(temp);
                        setOfFlights.add(flightRoute);
                    }
                });

        return setOfFlights;
    }


}
