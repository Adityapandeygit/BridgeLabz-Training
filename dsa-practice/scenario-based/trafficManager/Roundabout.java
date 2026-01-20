package dsa_practice.scenario_based.trafficManager;

public class Roundabout {
	VehicleNode tail;
	public void addVehicle(String vehicleNumber) {
		VehicleNode newNode = new VehicleNode(vehicleNumber);
		if(tail==null) {
			tail =newNode;
		}
		else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
		System.out.println("Vehicle entered roundabout: " + vehicleNumber);
	}
	public void removeVehicle() {
        if (tail == null) {
            System.out.println("Roundabout is empty");
            return;
        }
        VehicleNode head = tail.next;
        if (head == tail) {
            System.out.println("Vehicle exited: " + head.vehicleNumber);
            tail = null;
        } else {
            System.out.println("Vehicle exited: " + head.vehicleNumber);
            tail.next = head.next;
        }
    }
	public void printState() {
        if (tail == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        VehicleNode temp = tail.next;
        System.out.print("Roundabout: ");
        while (temp != tail.next) {
        	System.out.print(temp.vehicleNumber + " → ");
            temp = temp.next;
        }
        System.out.println("(back to start)");
	}
}
	
