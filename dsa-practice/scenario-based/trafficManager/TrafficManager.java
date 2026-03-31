package dsa_practice.scenario_based.trafficManager;

public class TrafficManager {
	    Roundabout roundabout;
	    VehicleQueue waitingQueue;
	    TrafficManager(int queueCapacity) {
	        roundabout = new Roundabout();
	        waitingQueue = new VehicleQueue(queueCapacity);
	    }

	    public void vehicleArrives(String vehicleNumber) {
	        waitingQueue.enqueue(vehicleNumber);
	    }

	    public void allowEntry() {
	        String vehicle = waitingQueue.dequeue();
	        if (vehicle != null) {
	            roundabout.addVehicle(vehicle);
	        }
	    }

	    public void vehicleExits() {
	        roundabout.removeVehicle();
	    }

	    public void displayRoundabout() {
	        roundabout.printState();
	    }
}
