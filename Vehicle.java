public class Vehicle{
    private String id;
    private boolean isAC;
    private int capacity;
    private int BaseFare;
    private Driver driver;
    private Route route;
    protected Transporter transporter; //nadeem or zulfiqar
    protected Seat[] seats;

    public Vehicle(String id, boolean isAC, int capacity, int baseFare, Driver driver, Route route, Transporter transporter, Seat[] seats) {
        this.id = id;
        this.isAC = isAC;
        this.capacity = capacity;
        BaseFare = baseFare;
        this.driver = driver;
        this.route = route;
        this.transporter = transporter;
        this.seats = seats;
    }
    public void assignDriver(Driver driver) {
        if(this.driver != null){
            System.out.println("driver is busy");
        } else {
            this.driver = driver;
            driver.assignVehicle(this);
        }
    }
    public void assignRoute(Route route) {
        this.route = route;
        System.out.println(route + " has been assigned to "+this.driver);
    }
}
