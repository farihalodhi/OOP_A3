public class Faculty extends User<Role>{
    public Faculty(String name, String id ,boolean Payment) {
        super(name, id,new Role("Faculty"), Payment);
    }
public double CalculateFare(Vehicle vehicle){
        double fare = vehicle.getBaseFare();
        if(vehicle.isAC){
            fare+=2000;
        }
        return fare;
    }

}

