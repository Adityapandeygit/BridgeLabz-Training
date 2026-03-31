package dsa_practice.scenario_based.parcelTracker;

public class ParcelTracker {
	StageNode head;
	public ParcelTracker() {
        head = new StageNode("Packed");
        head.next = new StageNode("Shipped");
        head.next.next = new StageNode("In Transit");
        head.next.next.next = new StageNode("Delivered");
    }
	
	public void trackParcel() {
        StageNode current = head;
        if (current == null) {
            System.out.println("Parcel lost. No tracking available.");
            return;
        }
        while (current != null) {
            System.out.print(current.stage);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }
	
	public void addCheckpoint(String afterStage, String newStage) {
        StageNode current = head;

        while (current != null && !current.stage.equals(afterStage)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Stage not found. Cannot add checkpoint.");
            return;
        }
        StageNode checkpoint = new StageNode(newStage);
        checkpoint.next = current.next;
        current.next = checkpoint;

        System.out.println("Checkpoint added: " + newStage);
    }
    // Simulate parcel loss
    public void markParcelLost() {
        head = null;
    }
}
