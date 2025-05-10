public class Bus extends Vehicle {
    public Bus(String id, boolean isAC, Driver driver, Route route, Transporter transporter) {
        super(id, isAC, driver, route, transporter);
        this.capacity = 52;
    }
}
