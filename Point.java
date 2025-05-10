import java.io.Serializable;

public class Point <T extends Vehicle> implements Serializable {
    private String pointType; //coater, vehicle
    private T vehicle;

    public Point(String pointName, T vehicle) {
        this.pointType = pointName;
        this.vehicle = vehicle;
    }

    public String getPointType() {
        return pointType;
    }

    public T getVehicle() {
        return vehicle;
    }
    public void assignDriver(Driver driver) {
        vehicle.assignDriver(driver);
    }
    public void displayInfo(){
        System.out.println("point type: " + pointType + " Vehicle info: " + vehicle.getInfo());
    }
}
