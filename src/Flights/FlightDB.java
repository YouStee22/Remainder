package Flights;

import java.util.Set;

public class FlightDB {
    private Set<Flights> avaliableFlights;

    public FlightDB(Set<Flights> avaliableFlights) {
        this.avaliableFlights = avaliableFlights;
    }

    public Set<Flights> getAvaliableFlights() {
        return avaliableFlights;
    }
}

