import com.chikli.demo.Flight;
import com.chikli.demo.Flights;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FlightTest {

    @Test
    public void testDestination() {
        Flight flight = new Flight("CAK Akron, OH", "CLE Cleveland, OH", "05/01/2019", "8:00 AM", 99);
        assertEquals(flight.getDestination(), "CLE Cleveland, OH");
    }

    @Test
    public void flightOriginDoesNotExist() {
        Flights flights = new Flights();
        List<Flight> listFlight = flights.findByOrigin("LAX");
        assertThat(listFlight.isEmpty(), is(true));
    }

    @Test
    public void testFindByOrigin() {
        Flight flight = new Flight("CAK Akron, OH", "CLE Cleveland, OH", "05/01/2019", "8:00 AM", 99);
        flight.setOrigin("CLE Cleveland, OH");
        Flights flights = new Flights();
        flights.addFlight(flight);
        assertNotNull(flights.findByOrigin("CLE Cleveland, OH"));
    }

    @Test
    public void testFindByDestination() {
        Flight flight = new Flight("CAK Akron, OH", "CLE Cleveland, OH", "05/01/2019", "8:00 AM", 99);
        flight.setDestination("CLE Cleveland, OH");
        Flights flights = new Flights();
        flights.addFlight(flight);
        assertNotNull(flights.findByDestination("CLE Cleveland, OH"));
    }

    @Test
    public void testAddFlight() {
        Flight flight = new Flight("CAK Akron, OH", "CLE Cleveland, OH", "05/01/2019", "8:00 AM", 99);
        Flights flights = new Flights();
        flights.addFlight(flight);
        assertNotNull(flights);
    }


}
