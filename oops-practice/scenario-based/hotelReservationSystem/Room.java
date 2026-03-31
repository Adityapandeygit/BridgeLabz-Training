package oops_practice.scanrio_based.hotelReservationSystem;

public class Room {
	private int roomNumber;
    double pricePerDay;
    private boolean available = true;
    public Room(int roomNumber, double pricePerDay) {
        this.roomNumber = roomNumber;
        this.pricePerDay = pricePerDay;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable() {
        this.available =  available;
    }
    public void bookRoom() {
        available = false;
    }
    public void checkout() {
        available = true;
    }
}
