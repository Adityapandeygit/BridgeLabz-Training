package data_handling.json_handler;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

class Car1{
	public String brand;
    public String model;
    public int year;

    public Car1(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}
public class ListToJsonArray {
	public static void main(String[] args) {
		try {
            ObjectMapper mapper = new ObjectMapper();

            // Create List of Objects
            List<Car1> cars = new ArrayList<>();
            cars.add(new Car1("Toyota", "Fortuner", 2023));
            cars.add(new Car1("Hyundai", "Creta", 2022));
            cars.add(new Car1("Honda", "City", 2021));

            // Convert List → JSON Array
            String jsonArray = mapper.writeValueAsString(cars);

            System.out.println(jsonArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
