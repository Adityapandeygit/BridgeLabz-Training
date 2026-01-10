package oops_practice.scanrio_based.flightBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
	Booking booking;
	List<Booking> bookings = new ArrayList<>();
	public void addBooking(Booking booking) {
		bookings.add(booking);
	}
	public void display() {
		for(Booking b :bookings) {
			b.displayBooking();
		}
	}
	public void searchBooking(int id) {
		for(Booking b :bookings) {
			if(b.getBookingId()==id) {
				System.out.println("Booking found");
				b.displayBooking();
			}
		}
	}
	Flight[] arrOfFlights;
	public void bookFlight(int flightId, String passengerName) {
		for (Flight f : arrOfFlights) {
            if (f.getFlightId() == flightId) {
                bookings.add(new Booking(flightId, passengerName, f));
                System.out.println("Flight booked successfully!");
                return;
            }
        }
        System.out.println("Invalid Flight ID!");
    }
	
}





