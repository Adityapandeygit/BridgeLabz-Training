package oops_practice.scanrio_based.vehicleRentalApplication;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Vehicle rental System ");
		System.out.println();
		VehicleManager manager = new VehicleManager();
        Vehicle b1 = new Bike(101, "Hero", 300,"Splender");
        Vehicle c1 = new Car(102, "Honda", 1200,"Verna");
        Vehicle t1 = new Truck(103, "Tata", 2000,"Tata Signa");

        manager.addVehicle(b1);
        manager.addVehicle(c1);
        manager.addVehicle(t1);
        manager.displayVehicles();
        
        manager.updateRent(101, 350);
        manager.deleteVehicle(103);
        System.out.println();
        manager.displayVehicles();
        
        // Rent a vehicle and see details and bills
      Customer customer1 = new Customer(1,"Aditya",c1,5);
      customer1.displayCustomer();
        
	}
}
