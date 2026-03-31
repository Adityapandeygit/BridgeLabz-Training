package constructors;

public class Vehicle {
	 String ownerName;
	 String vehicleType;
	 static int registrationFee = 5000;
	Vehicle(String ownerName,String vehicleType){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	void displayVehicleDetails() {
		System.out.println("Name of Vehicle owner : "+ ownerName);
		System.out.println("Type of vehicle : " + vehicleType);
		System.out.println("Registration Fee : " + registrationFee);
		System.out.println();
	}
	static void updateRegistrationFee(int newFee) {
		registrationFee = newFee;
	}
	
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Aditya", "Car");
		v1.displayVehicleDetails();
        Vehicle v2 = new Vehicle("Rahul", "Bike");
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(6500);
        
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
	}
}
