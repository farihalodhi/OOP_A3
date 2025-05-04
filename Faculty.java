public class Faculty extends User{
    public Faculty(String name, String id, String role, boolean Payment) {
        super(name, id, role, Payment);
    }
public double CalculateFare(Vehicle vehicle){
        double fare = vehicle.getRoute().getBaseFare();
        if(vehicle.isAC){
            fare+=2000;
        }
        return fare;
    }
    public String getRole(){
        return "Faculty";
    }
}
