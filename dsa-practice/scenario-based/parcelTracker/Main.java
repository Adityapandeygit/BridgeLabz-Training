package dsa_practice.scenario_based.parcelTracker;

public class Main {
	public static void main(String[] args) {
		ParcelTracker tracker = new ParcelTracker();

        tracker.trackParcel();
        // Packed -> Shipped -> In Transit -> Delivered
        tracker.addCheckpoint("Shipped", "Customs Check");
        tracker.trackParcel();
        // Packed -> Shipped -> Customs Check -> In Transit -> Delivered
        tracker.markParcelLost();
        tracker.trackParcel();
	}
}
