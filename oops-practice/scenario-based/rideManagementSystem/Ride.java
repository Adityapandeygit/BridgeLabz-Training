package oops_practice.scanrio_based.rideManagementSystem;


public class Ride {
	private User user;
    private Driver driver;
    private double distance;
    private double fare;

    Ride(User user, Driver driver, double distance, double fare) {
        this.user = user;
        this.driver = driver;
        this.distance = distance;
        this.fare = fare;
    }

    void showRide() {
        System.out.println("User Name      : " + user.getName());
        System.out.println("Driver Name    : " + driver.getName());
        System.out.println("Total Distance : " + distance + " km");
        System.out.println("Total Fare     : " + fare);
    }
}
