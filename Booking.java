import java.io.Serializable;
import java.util.List;

public class Booking implements Serializable {
    private User user;
    private Vehicle vehicle;
    private int seatNumber;

    public Booking(User user, Vehicle vehicle, int seatNumber) {
        this.user = user;
        this.vehicle = vehicle;
        this.seatNumber = seatNumber;
    }
//    public void booking(List<User> users, String Vehicleid, String Seatnumber) throws Exception {
//        User user = null;
//        for(User u : users){
//            if(u.getId().equals(user.getId())){ // iski logic dekh lena ismein thodi editing hogi
//                user = u;
//                break;
//            }
//        }
//        if(user == null){
//            throw new EntityNotFoundException("User not found");
//        }
//    }
    public String getDetails(){
        return user.name +" booked seat no: " + seatNumber + " on vehicle:  " + vehicle.getInfo();
    }
}
