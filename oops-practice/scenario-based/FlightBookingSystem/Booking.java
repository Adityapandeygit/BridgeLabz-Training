package oops_practice.scanrio_based.flightBookingSystem;

public class Booking {
	private int bookingId;
	private String BookingPassangerName;
	Flight flights;
	Booking(int bookingId,String BookingPassangerName,Flight flights){
		this.bookingId = bookingId;
		this.BookingPassangerName = BookingPassangerName;
		this.flights = flights;
	}
	public void displayBooking() {
		System.out.println("Booking id : "+bookingId);
        System.out.println("Passenger name : " + BookingPassangerName);
    }
	public int getBookingId() {
		return bookingId;
	}
}
