import com.chikli.demo.Flight;
import com.chikli.demo.Reservation;
import com.chikli.demo.Reservations;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class ReservationTest {

    @Test
    public void createReservation() {
        Reservations reservations = new Reservations();
        Reservation reservation = new Reservation();
        Flight flight = new Flight("CAK Akron, OH", "CLE Cleveland, OH", "05/01/2019", "8:00 AM", 99);

        flight.setDestination("LAX");
        flight.setOrigin("ABC");
        flight.setTakeoff("1700");
        flight.setLanding("1800");
        flight.setPrice(19.95);

        reservation.setFlight(flight);
        reservation.setName("John Doe");
        reservation.setCreditCard("1234 5678 9876 5432");
        reservation.setNumReservations(1);

        reservations.addReservation(reservation);
        assertThat(reservation.getNumReservations(), is(1));
    }
}
