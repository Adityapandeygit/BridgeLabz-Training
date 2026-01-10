package oops_practice.scanrio_based.vehicleRentalApplication;

import java.util.ArrayList;
import java.util.List;

class VehicleManager {
	List<Vehicle> vehicles = new ArrayList<>();
	// Create
    public void addVehicle(Vehicle v) {
        vehicles.add(v);
        System.out.println("Vehicle added successfully");
    }
    // display
    public void displayVehicles() {
        for (Vehicle v : vehicles) {
            v.display();
            System.out.println();
        
        }
    }
    // update
    public void updateRent(int vehicleNo,int updatedRent) {
    	for(Vehicle v :vehicles) {
    		if(v.getVehicleNo()==vehicleNo) {
    			v.setRentPerDay(updatedRent);
    			System.out.println("Rent updated");
    			return;
    		}
    	}
    	System.out.println("Vehicle not found");
    }
    public void deleteVehicle(int vehicleNo) {
    	for(Vehicle v :vehicles) {
    		if(v.getVehicleNo()==vehicleNo) {
    			vehicles.remove(v);
    			System.out.println("Vehicle Deleted ");
    			return;
    		}
    	}
    	System.out.println("Vehicle not found");
    }
}
