package oops_practice.scanrio_based.trafficManager;

public class TrafficManager {
	public static void main(String[] args) {
        Roundabout roundabout = new Roundabout();
        VehicleQueue waitingQueue = new VehicleQueue(3);

        // Vehicles arrive
        waitingQueue.enqueue("CAR-101");
        waitingQueue.enqueue("CAR-102");
        waitingQueue.enqueue("CAR-103");
        waitingQueue.enqueue("CAR-104"); // Overflow

        // Move vehicles into roundabout
        while (!waitingQueue.isEmpty()) {
            roundabout.addVehicle(waitingQueue.dequeue());
        }

        roundabout.printRoundabout();

        // Vehicles exit
        roundabout.removeVehicle();
        roundabout.printRoundabout();

        roundabout.removeVehicle();
        roundabout.removeVehicle();
        roundabout.removeVehicle(); // Underflow
    }
}
