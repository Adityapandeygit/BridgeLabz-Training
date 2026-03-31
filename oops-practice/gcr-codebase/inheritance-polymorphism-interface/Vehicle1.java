package oops_practice.inheritance;

public class Vehicle1 {
	String model;
    int maxSpeed;
    Vehicle1(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
    
    public static void main(String[] args) {
        ElectricVehicle electricVehicle = new ElectricVehicle("Tesla Model S", 250);
        PetrolVehicle petrolVehicle = new PetrolVehicle("Honda City", 180);
        electricVehicle.displayDetails();
        electricVehicle.charge();
        System.out.println();
        petrolVehicle.displayDetails();
        petrolVehicle.refuel();
    }
}
interface Refuelable {
    void refuel();
}
class ElectricVehicle extends Vehicle1 {
    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
    void charge() {
        System.out.println("Electric vehicle is charging");
    }
}
class PetrolVehicle extends Vehicle1 implements Refuelable {

    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println("Petrol vehicle is being refueled.");
    }
}
