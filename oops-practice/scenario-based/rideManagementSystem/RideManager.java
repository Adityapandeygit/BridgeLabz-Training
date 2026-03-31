package oops_practice.scanrio_based.rideManagementSystem;

import java.util.ArrayList;



class NoDriverAvailableException extends Exception {
    NoDriverAvailableException(String message) {
        super(message);
    }
}

class RideManager {
    private ArrayList<Driver> drivers = new ArrayList<>();
    void addDriver(Driver d) {
        drivers.add(d);
    }
    void bookRide(User user, double distance, String time)
            throws NoDriverAvailableException {
        Driver selectedDriver = null;
        for (Driver d : drivers) {
            if (d.isAvailable()) {
                selectedDriver = d;
                d.setAvailable(false);
                break;
            }
        }
        if (selectedDriver == null) {
            throw new NoDriverAvailableException("No driver available!");
        }
        
        double fare=0.0;
        if (time.equalsIgnoreCase("PEAK")) {
        	FareCalculator calculatorfare = new PeakFare();
        	 fare = calculatorfare.calculate(distance);
        }else {
        	FareCalculator calculatorfare = new NormalFare();
        	 fare = calculatorfare.calculate(distance);
        }
        
        Ride ride = new Ride(user, selectedDriver, distance, fare);

        System.out.println("Ride Booked Successfully");
        ride.showRide();
    }
}
