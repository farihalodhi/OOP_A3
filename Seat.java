import java.io.Serializable;
import java.sql.SQLException;

public class Seat implements Serializable {
    private int seatNo;
    private boolean isBooked;
    private String role;
    public Seat(int seatNo, boolean isBooked, String role) {
        this.seatNo = seatNo;
        this.role = role;
        this.isBooked = false;
    }
    public int getSeatNo() {
        return seatNo;
    }
    public boolean isBooked() {
        return isBooked;
    }
    public String getRole() {
        return role;
    }
    public void bookSeat() throws SeatUnavailableException {
        if(isBooked){
            throw new SeatUnavailableException("Seat is already booked");
        }
        this.isBooked = true;
    }
}
