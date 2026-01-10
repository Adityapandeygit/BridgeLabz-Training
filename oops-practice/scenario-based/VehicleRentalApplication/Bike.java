package oops_practice.scanrio_based.vehicleRentalApplication;

public class Bike extends Vehicle {
	String bikeName;
	Bike(int vehicleNo, String brand, int rentPerDay,String bikename) {
        super(vehicleNo, brand, rentPerDay);
        this.bikeName = bikename;
    }
	public double calculateRent(int days) {
		return getRentPerDay()*days;
	}
	public void display() {
		System.out.println("Rented bike name : "+bikeName);
		System.out.println("Vehicle no : "+getVehicleNo());
		System.out.println("Vehicle brand : "+getBrand());
		System.out.println("Vehicle rent  per day : "+getRentPerDay());
	}
	public String getBikeName() {
		return bikeName;
	}
	
	
	
}
