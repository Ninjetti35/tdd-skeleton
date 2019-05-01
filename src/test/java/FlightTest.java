import com.chikli.demo.Flight;
import com.chikli.demo.Flights;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FlightTest {

    @Test
    public void testDestination() {
        Flight flight = new Flight();
        flight.setDestination("LAX");
        assertEquals(flight.getDestination(), "LAX");
    }

    @Test
    public void flightOriginDoesNotExist() {
        Flights flights = new Flights();
        List<Flight> listFlight = flights.findByOrigin("LAX");
        assertThat(listFlight.isEmpty(), is(true));
    }

    @Test
    public void testFindByOrigin() {
        Flight flight = new Flight();
        flight.setOrigin("LAX");
        Flights flights = new Flights();
        flights.addFlight(flight);
        assertNotNull(flights.findByOrigin("LAX"));
    }

    @Test
    public void testFindByDestination() {
        Flight flight = new Flight();
        flight.setDestination("LAX");
        Flights flights = new Flights();
        flights.addFlight(flight);
        assertNotNull(flights.findByDestination("LAX"));
    }


}
