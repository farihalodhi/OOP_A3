import java.util.ArrayList;
import java.util.List;

public class TransportSystem {
    private static final String FileName = "transportsData.ser";
    private List <User> users = new ArrayList<>();
    private List <Vehicle> vehicles = new ArrayList<>();
    private List <Booking> bookings = new ArrayList<>();
    public void registerUser(User user) {
        users.add(user);
    }
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

}
