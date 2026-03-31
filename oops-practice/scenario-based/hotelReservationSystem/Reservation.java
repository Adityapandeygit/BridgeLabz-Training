package oops_practice.scanrio_based.hotelReservationSystem;

public class Reservation {
	private Guest guest;
    private Room room;
    private int days;
    private PricingStrategy pricing;
    public Reservation(Guest guest, Room room, int days, PricingStrategy pricing)
             {
        this.guest = guest;
        this.room = room;
        this.days = days;
        this.pricing = pricing;
        
    }
    public void Book() throws RoomNotAvailableException{
    	if (!room.isAvailable()) {
            throw new RoomNotAvailableException("Room is not available!");
        }
    	room.bookRoom();
    }
    public double generateInvoice() {
        return pricing.calculatePrice(room.pricePerDay, days);
    }
    public void checkout() {
        room.checkout();
        System.out.println("Checked out successfully.");
    }
}
