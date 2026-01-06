package oops_practice.Encapsulation_Polymorphism_Interfaces_AbstractClasses;
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
abstract class Vehicles implements GPS {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;
    
    public Vehicles(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public String getDriverName() {
        return driverName;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    private String currentLocation = "Unknown";

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

class Cars extends Vehicles {
    public Cars(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

class Bikes extends Vehicles {
    public Bikes(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return (getRatePerKm() * distance) * 0.8; // cheaper
    }
}

class Auto extends Vehicles {
    public Auto(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return (getRatePerKm() * distance) + 30; 
    }
}
public class RideHailingApplication {
	public static void calculateRideFare(Vehicles vehicle, double distance) {
        vehicle.getVehicleDetails();
        System.out.println("Current Location: " + vehicle.getCurrentLocation());
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: ₹" + vehicle.calculateFare(distance));
    }
	
	public static void main(String[] args) {
		Vehicles v1 = new Cars(101, "Rahul", 15);
		calculateRideFare(v1, 10);
	}
}
