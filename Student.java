public class Student extends User{
    public Student(String name, String id, String role, boolean Payment) {
        super(name, id, role, Payment);
    }

    @Override
    public double CalculateFare(Vehicle vehicle) {
        double fare = vehicle.getRoute.getBaseFare();
        if(vehicle.isAC){
            fare += 2000;
        }
        return fare;
    }
    public String getRole(){
        return "Student";
    }
}
