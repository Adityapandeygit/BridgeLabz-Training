package dsa_practice.scenario_based.trafficManager;

public class Main {
	public static void main(String[] args) {
        TrafficManager manager = new TrafficManager(3);
        manager.vehicleArrives("DL-01");
        manager.vehicleArrives("DL-02");
        manager.vehicleArrives("DL-03");
        manager.vehicleArrives("DL-04");

        manager.allowEntry();
        manager.allowEntry();
        manager.displayRoundabout();

        manager.vehicleExits();
        manager.displayRoundabout();

        manager.allowEntry();
        manager.displayRoundabout();
    }
}
