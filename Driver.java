import java.io.Serializable;

public class Driver implements Serializable {
    protected String DriverName;
    protected String license;
    private Vehicle assignedVehicle;

    public Driver(String driverName, String license) {
        this.DriverName = driverName;
        this.license = license;
    }
    public String getDriverName() {
        return DriverName;
    }
    public String getLicense() {
        return license;
    }
    public void assignVehicle(Vehicle vehicle) {
        if(this.assignedVehicle != null) {
            System.out.println("driver is already assigned to this vehicle");
        }
        this.assignedVehicle = vehicle;
    }
}
