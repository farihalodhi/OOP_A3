import java.io.Serializable;

public abstract class User<T> implements Serializable{
    protected String name,id;
    protected Role role;
    protected boolean Payment;
    public User(String name, String id, Role role, boolean Payment) {
        this.name = name;
        this.id = id;
        this.role = role;
        this.Payment = false;
    }
    public String getName() {
        return name;
    }
    public Role getRole() {
        return role;
    }
    public String getId() {
        return id;
    }
    public abstract double CalculateFare(Vehicle vehicle);

    public void makePayment(){
         Payment = true;
    }
    public boolean Paid(){
        return Payment;
    }
}

