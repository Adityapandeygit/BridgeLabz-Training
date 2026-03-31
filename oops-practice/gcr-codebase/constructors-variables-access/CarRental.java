package constructors;

public class CarRental {
	String customerName;
	String carModel;
	int rentalDays;
	int totalCost;
	CarRental(String customerName,String carModel,int rentalDays){
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
		this.totalCost = calculatetotalCost(carModel);
		
	}
	int calculatetotalCost(String carModel) {
		if(carModel.equals("Swift")) {
			return 100*rentalDays;
		}
		else if(carModel.equals("Scorpio")) {
			return 400*rentalDays;
		}
		else if(carModel.equals("Fortuner")) {
			return 1000*rentalDays;
		}
		else {
			return 0;
		}
	}
	
	void display() {
		System.out.println("Customer name is :"+customerName);
		System.out.println("Carmodel for rent :"+carModel);
		System.out.println("For how many days car is rented :"+rentalDays);
		System.out.println("Total cost for the rented car :"+totalCost);
	}
	
	
	public static void main(String[] args) {
		CarRental rent1 = new CarRental("Aditya","Fortuner",20);
		rent1.display();
	}
}
