package data_handling.json_handler;

import com.fasterxml.jackson.databind.ObjectMapper;

class Car {
	private String brand;
    private String model;
    private int year;
    private double price;

    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getPrice() { return price; }

}
public class CarJsonExample {
	public static void main(String[] args) {
		Car car = new Car("Toyota", "Fortuner", 2023, 4200000);
		try {
			ObjectMapper mapper = new ObjectMapper();
	        String json = mapper.writeValueAsString(car);
		    System.out.println(json);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
        
		
	}
}
