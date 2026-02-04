package java_8_features.functionalInterface.definingandImplementingInterfaces;

interface RentableVehicle {
    void rent();
    void returnVehicle();
}
//Car Class
class Car implements RentableVehicle {

 @Override
 public void rent() {
     System.out.println("Car has been rented.");
 }

 @Override
 public void returnVehicle() {
     System.out.println("Car has been returned.");
 }
}

//Bike Class
class Bike implements RentableVehicle {

 @Override
 public void rent() {
     System.out.println("Bike has been rented.");
 }

 @Override
 public void returnVehicle() {
     System.out.println("Bike has been returned.");
 }
}

//Bus Class
class Bus implements RentableVehicle {

 @Override
 public void rent() {
     System.out.println("Bus has been rented.");
 }

 @Override
 public void returnVehicle() {
     System.out.println("Bus has been returned.");
 }
}

public class MultiVehicleRentalSystem {
	public static void main(String[] args) {
        RentableVehicle car = new Car();
        RentableVehicle bike = new Bike();
        RentableVehicle bus = new Bus();

        car.rent();
        bike.rent();
        bus.rent();

        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
