import javax.print.attribute.standard.Destination;
import java.util.ArrayList;

public class Bus {

    private String name;
    private ArrayList<Person> passengers;
    private String destination;
    private int capacity;

    public Bus(String name, String destination, int capacity) {
        this.name = name;
        this.passengers = new ArrayList<Person>();
        this.destination = destination;
        this.capacity = capacity;
    }

    public int getPassengerList() {
        return this.passengers.size();
    }

    public void pickPassengerUp(Person person) {
        if (capacity <= 50) {
            this.passengers.add(person);
        } else if (capacity == 0) {
            System.out.println("No Room!");
        }

    }
}
