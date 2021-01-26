import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;

    @Before
    public void setUp(){
        bus = new Bus("McGills", "Glasgow", 0);
    }

    @Test
    public void busStartEmpty(){
        assertEquals(0, bus.getPassengerList());
    }

    @Test
    public void canPickup(){
        bus.pickPassengerUp(person);
        assertEquals(1, bus.getPassengerList());
    }



}
