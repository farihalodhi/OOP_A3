public class Student extends User<Role> {
    public Student(String name, String id, boolean Payment) {
        super(name, id, new Role("Student"), Payment);
    }

    @Override
    public double CalculateFare(Vehicle vehicle) {
        double fare = vehicle.getBaseFare();
        if (vehicle.isAC) {
            fare += 2000;
        }
        return fare;
    }
}
