public class Seat {
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
    public void bookSeat(Seat seat) {
        if (seat.isBooked){
            System.out.println("Seat is already booked");
        }
        else {
            seat.isBooked = true;
            System.out.println("seat has been booked");
        }
    }
}
