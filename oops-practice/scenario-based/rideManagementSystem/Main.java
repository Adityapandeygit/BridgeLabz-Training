package oops_practice.scanrio_based.rideManagementSystem;

public class Main {
    public static void main(String[] args) {
    	System.out.println("Ride Mangement System");
        RideManager manager = new RideManager();
        manager.addDriver(new Driver(1, "Ramesh"));
        manager.addDriver(new Driver(2, "Suresh"));
        
        User user = new User(101, "Aditya");
        try {
            manager.bookRide(user, 10, "PEAK");
        } catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}

