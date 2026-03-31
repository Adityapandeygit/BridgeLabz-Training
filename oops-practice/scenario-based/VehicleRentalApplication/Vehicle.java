package oops_practice.scanrio_based.vehicleRentalApplication;

abstract class Vehicle implements IRentable{
	private int vehicleNo;
	private String brand;
	private int rent_per_day;
	Vehicle(int vehicleNo,String brand,int rent_per_day){
		this.vehicleNo = vehicleNo;
		this.brand = brand;
		this.rent_per_day = rent_per_day;
	}
	// Getter and Setter
	public int getVehicleNo() {
        return vehicleNo;
    }
	public String getBrand() {
		return brand;
	}
	public int getRentPerDay() {
		return rent_per_day;
	}
	public void setRentPerDay(int updatedRent) {
		this.rent_per_day = updatedRent;
	}
	public abstract void display();
	public abstract double calculateRent(int days);
}
