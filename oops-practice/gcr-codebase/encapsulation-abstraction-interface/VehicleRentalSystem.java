package oops_practice.Encapsulation_Polymorphism_Interfaces_AbstractClasses;
import java.util.*;

interface Insurable {
    double calculateInsurance(int days);
    String getInsuranceDetails();
}
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    double rentalRate;
    private String insurancePolicyNumber;
    
    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public String getType() {
        return type;
    }
    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }
    
    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
    }
}
class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber,String type, double rentalRate, String policyNumber) {
        super(vehicleNumber,type,rentalRate, policyNumber);
    }
    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
    @Override
    public double calculateInsurance(int days) {
        return 200*days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insaurance details : " + getInsurancePolicyNumber();
    }
}
class Bike extends Vehicle implements Insurable {
	public Bike(String vehicleNumber,String type, double rentalRate, String policyNumber) {
        super(vehicleNumber,type,rentalRate, policyNumber);
    }
	public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
	public double calculateInsurance(int days) {
		return 300*days;
	}
	public String getInsuranceDetails() {
        return "Bike Insaurance details : " + getInsurancePolicyNumber();
    }
	
}
class Truck extends Vehicle implements Insurable {
	public Truck(String vehicleNumber,String type, double rentalRate, String policyNumber) {
        super(vehicleNumber,type,rentalRate, policyNumber);
    }
	public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
	public double calculateInsurance(int days) {
		return 400*days;
	}
	public String getInsuranceDetails() {
        return "Truck Insaurance details : " + getInsurancePolicyNumber();
    }
	
}	
public class VehicleRentalSystem {
	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new Car("CAR101","Car", 1500, "CAR-INS-001"));
        vehicles.add(new Bike("BIKE202","Bike", 500, "BIKE-INS-002"));
        vehicles.add(new Truck("TRUCK303","Truck", 3000, "TRUCK-INS-003"));
        int days = 3;
        for(Vehicle v :vehicles) {
        	v.displayDetails();
        	double rentalCost = v.calculateRentalCost(days);
        	if(v instanceof Insurable) {
        		Insurable ins = (Insurable) v;
        		System.out.println("Insurance Cost : " + ins.calculateInsurance(days));
                System.out.println(ins.getInsuranceDetails());
        	}
        	System.out.println();
        }
	}
}
