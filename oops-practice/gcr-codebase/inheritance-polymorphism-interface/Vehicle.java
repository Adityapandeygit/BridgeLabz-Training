package oops_practice.inheritance;

public class Vehicle {
	int maxSpeed ;
	String fuelType ;
	Vehicle(int maxSpeed,String fuelType){
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	void displayInfo() {
		System.out.println("Max Speed : "+maxSpeed);
		System.out.println("Feul type : "+ fuelType);
	}
	public static void main(String[] args) {
		Vehicle v1 = new Car(180,"Petrol",7);
		v1.displayInfo();
		Vehicle v2 = new Truck(180,"Diesel",18);
		v2.displayInfo();
		Vehicle v3 = new Motorcycle(180,"Petrol","Bullet");
		v3.displayInfo();
	}
}

class Car extends Vehicle{
	int seatCapacity ;
	Car(int maxSpeed,String fuelType,int seatCapacity){
		super(maxSpeed,fuelType);
		this.seatCapacity = seatCapacity;
	}
	void displayInfo() {
		super.displayInfo();
		System.out.println("Seat Capacity of car :"+ seatCapacity);
	}
}
class Truck extends Vehicle{
	int noOfTyres;
	Truck(int maxSpeed,String fuelType,int noOfTyres){
		super(maxSpeed,fuelType);
		this.noOfTyres = noOfTyres;
	}
	void displayInfo() {
		super.displayInfo();
		System.out.println("No of tyres in truck :"+ noOfTyres);
	}
}
class Motorcycle extends Vehicle{
	String name;
	Motorcycle(int maxSpeed,String fuelType,String name){
		super(maxSpeed,fuelType);
		this.name = name;
	}
	void displayInfo() {
		super.displayInfo();
		System.out.println("Name of motorcycle :"+ name);
	}
}
