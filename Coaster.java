public class Coaster extends Vehicle {
    public Coaster(String id, boolean isAC, Driver driver, Route route, Transporter transporter) {
        super(id, isAC, driver, route, transporter);
        this.capacity = 32;
    }
}
