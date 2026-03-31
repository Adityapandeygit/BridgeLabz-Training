package dsa_practice.scenario_based.parcelTracker;

public class StageNode {
	String stage;
    StageNode next;

    StageNode(String stage) {
        this.stage = stage;
        this.next = null;
    }
}
