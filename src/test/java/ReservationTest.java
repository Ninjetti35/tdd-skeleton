import com.chikli.demo.Flight;
import com.chikli.demo.Reservation;
import com.chikli.demo.Reservations;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;

public class ReservationTest {

    @Test
    public void addReservations() {
        Reservation reservation = new Reservation(1, "John Doe", "1234 5678 9876 5432", "05/02/2019");
        Reservations reservations = new Reservations();

        assertEquals(reservations.addReservation(reservation), 1);
    }
}
