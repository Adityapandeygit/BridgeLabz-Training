package oops_practice.scanrio_based.vehicleRentalApplication;

public class Truck extends Vehicle {
	String truckName;
	Truck(int vehicleNo, String brand, int rentPerDay,String truckname) {
        super(vehicleNo, brand, rentPerDay);
        this.truckName = truckname;
    }
	public double calculateRent(int days) {
		return getRentPerDay()*days;
	}
	public void display() {
		System.out.println("Rented bike name : "+truckName);
		System.out.println("Vehicle no : "+getVehicleNo());
		System.out.println("Vehicle brand : "+getBrand());
		System.out.println("Vehicle rent  per day : "+getRentPerDay());
	}
	public String getTruckName() {
		return truckName;
	}
}
