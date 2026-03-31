package staticfinalinstanceOf;

public class Vehicle {
	static double registrationFee = 0.0;
    String ownerName;
    String vehicleType;
    final String registrationNumber;
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
    void displayVehicleDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            System.out.println("Owner Name: " + v.ownerName);
            System.out.println("Vehicle Type: " + v.vehicleType);
            System.out.println("Registration Number: " + v.registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Object is not a Vehicle");
        }
    }
    
    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(150.0);
        Vehicle v1 = new Vehicle("Honest raj", "Sedan", "ABC123");
        Vehicle v2 = new Vehicle("Price danish", "SUV", "XYZ789");
        v1.displayVehicleDetails(v1);
        System.out.println();
        v2.displayVehicleDetails(v2);
    }
}
