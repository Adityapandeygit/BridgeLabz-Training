package dsa_practice.scenario_based.trafficManager;

public class VehicleNode {
	String vehicleNumber;
    VehicleNode next;

    VehicleNode(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        this.next = this; // giving reference of next node to current node only
    }
}
