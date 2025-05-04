public abstract class User {
    protected String name,id,role;
    protected boolean Payment;
    public User(String name, String id, String role, boolean Payment) {
        this.name = name;
        this.id = id;
        this.role = role;
        this.Payment = false;
    }
    public String getName() {
        return name;
    }
    public abstract String getRole();

    public abstract double CalculateFare(Vehicle vehicle);

    public void makePayment(){
         Payment = true;
    }
    public boolean Paid(){
        return Payment;
    }
}
