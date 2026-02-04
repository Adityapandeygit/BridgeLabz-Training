package java_8_features.functionalInterface.defaultMethodsinInterfaces;

interface Vehicle {
    void displaySpeed();
    default void displayBattery() {
        System.out.println("Battery Info Not Available (Non-Electric Vehicle)");
    }
}
class PetrolCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Petrol Car Speed: 80 km/h");
    }
}
class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Electric Car Speed: 70 km/h");
    }
    public void displayBattery() {
        System.out.println("Battery: 85%");
    }
}

public class SmartVehicleDashboard {
	public static void main(String[] args) {
        Vehicle petrol = new PetrolCar();
        Vehicle electric = new ElectricCar();
        petrol.displaySpeed();
        petrol.displayBattery();   
        electric.displaySpeed();
        electric.displayBattery(); 
    }
}
