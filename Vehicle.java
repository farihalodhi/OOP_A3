import java.io.Serializable;

public  abstract class Vehicle implements Serializable {
    protected String id;
    protected boolean isAC;
    protected int capacity;
   protected int BaseFare;
    protected Driver driver;
    protected Route route;
    protected Transporter transporter; //nadeem or zulfiqar
    protected Seat[] seats;

    public int getBaseFare() {
        return BaseFare;
    }

    public Vehicle(String id, boolean isAC, Driver driver, Route route, Transporter transporter) {
        this.id = id;
        this.isAC = isAC;
//        this.capacity = capacity;
        this.driver = driver;
        this.route = route;
        this.transporter = transporter;

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
    public void assignSeats(Role role) {
        seats= new Seat[capacity+1];

        for(int i = 0; i <= capacity; i++){
            seats[i] = new Seat(i,false,role.getType());
        }
    }
    public void bookSeat(User user,int seatNo) throws Exception{
        if(!user.Paid()) throw new PaymentNotCompletedException("payment is not completed");
        if(seatNo < 1 || seatNo > seats.length) throw new IllegalArgumentException("invalid seat number");
        Seat seat = seats[seatNo];
        if(!seat.getRole().equals(user.getRole().getType())) {
            throw new RoleSeatViolationException("role is not matched");
        }
        seat.bookSeat();
    }
    public double CalculateFare(User user){
       int baseFare= user.getRole().getType().equals("Student") ? 5000 : 7000;
       return isAC ? baseFare+2000 : baseFare;
    }
    public String getInfo(){
        return transporter + " | " + route.toString() + " | " + (driver != null ? driver.getDriverName() : "not assigned")  + " | " + seats[0].toString();
    }
}

