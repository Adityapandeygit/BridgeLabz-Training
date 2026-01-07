package oops_practice.scanrio_based.rideManagementSystem;

public class Driver {
	 private int id;
	    private String name;
	    private boolean available = true;

	    Driver(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    String getName() {
	        return name;
	    }

	    boolean isAvailable() {
	        return available;
	    }

	    void setAvailable(boolean available) {
	        this.available = available;
	    }
}
