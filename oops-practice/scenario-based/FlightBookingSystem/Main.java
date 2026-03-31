package oops_practice.scanrio_based.flightBookingSystem;

public class Main {
	public static void main(String[] args) {
		System.out.println("List of flights");
		System.out.println();
		Flight f1 = new Flight(101,"Delhi", "Banglore", 5000.0);
		Flight f2 = new Flight(102,"Delhi", "Mumbai", 4000.0);
		Flight f3 = new Flight(103,"Delhi", "Chennai", 10000.0);
		FlightManager mn = new FlightManager();
		mn.addFlights(f1,0);
		mn.addFlights(f2,1);
		mn.addFlights(f3,2);
		mn.displayFlights();
		mn.searchFlight(f1.getFlightId());
		System.out.println();
		
		Booking b1 = new Booking(1,"Aditya", f3);
		Booking b2 = new Booking(2,"Rahul", f3);
		BookingManager bmn = new BookingManager();
		bmn.addBooking(b1);
		bmn.addBooking(b2);
		bmn.display();
		
		bmn.searchBooking(b1.getBookingId());
		
	}
}
