package oops_practice.scanrio_based.flightBookingSystem;

public class Flight {
	private int flightId;
    private String source;
    private String destination;
    private double price;
    Flight(int flightId,String source,String destination,double price){
    	this.flightId = flightId;
    	this.source = source;
    	this.destination = destination;
    	this.price = price;
    }
    public int getFlightId() {
        return flightId;
    }
    public String getSource() {
        return source;
    }
    public String getDestination() {
        return destination;
    }
    public double getPrice() {
        return price;
    }
    public void displayFlight() {
    	System.out.println("Flight id : "+flightId);
    	System.out.println("Source : " + source);
    	System.out.println("Destination : "+destination);
    	System.out.println("Price of the flight : "+price);
    }
    
}
