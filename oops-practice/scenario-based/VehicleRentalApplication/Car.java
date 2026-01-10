package oops_practice.scanrio_based.vehicleRentalApplication;

class Car extends Vehicle {
	String carName;
	Car(int vehicleNo, String brand, int rentPerDay,String carname) {
        super(vehicleNo, brand, rentPerDay);
        this.carName = carname;
    }
	public double calculateRent(int days) {
		return getRentPerDay()*days;
	}
	public void display() {
		System.out.println("Rented bike name : "+carName);
		System.out.println("Vehicle no : "+getVehicleNo());
		System.out.println("Vehicle brand : "+getBrand());
		System.out.println("Vehicle rent  per day : "+getRentPerDay());
	}
	public String getCarName() {
		return carName;
	}
}
