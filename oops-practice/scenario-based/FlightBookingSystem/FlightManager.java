package oops_practice.scanrio_based.flightBookingSystem;

public class FlightManager {
	Flight[] arrOfFlights = new Flight[3];
	public void addFlights(Flight f,int i) {
		arrOfFlights[i] = f;
	}
	public void displayFlights() {
		for(int i=0;i<3;i++) {
			arrOfFlights[i].displayFlight();
			System.out.println();
		}
	}
	public void searchFlight(int id) {
		for(int i=0;i<3;i++) {
			if(arrOfFlights[i].getFlightId()==id) {
				System.out.println("Flight found");
				arrOfFlights[i].displayFlight();
				return ;
			}
		}
		System.out.println("No flight found with the given id");
	}
	
	
}
