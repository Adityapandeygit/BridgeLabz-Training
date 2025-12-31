package constructors;

public class HotelBooking {
	String guestName;
	String roomType;
	int nights;
	// Default constructor
	HotelBooking(){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	// Parameterised Constructor
	HotelBooking(String guestName,String roomType,int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	// Copy Cnstructor
	HotelBooking(HotelBooking other){
		this.guestName = other.guestName;
		this.roomType = other.roomType;
		this.nights = other.nights;
	}
	void display() {
		System.out.println("Guest Name :"+guestName);
		System.out.println("Room type :"+roomType);
		System.out.println("Number of nights :"+nights);
		System.out.println();
	}
	
	public static void main(String[] args) {
		HotelBooking hb1 = new HotelBooking();
		hb1.guestName = "Aditya";
		hb1.roomType = "King";
		hb1.nights = 2;
		hb1.display();
		HotelBooking hb2 = new HotelBooking("Prashant","Medium",2);
		hb2.display();
		HotelBooking hb3 = new HotelBooking(hb2);
		hb3.display();
	}
}
