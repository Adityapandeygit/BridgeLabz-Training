package oops_practice.Encapsulation_Polymorphism_Interfaces_AbstractClasses;
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    
    public abstract double calculateTotalPrice();
    
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getItemName() {
        return itemName;
    }

}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice() {
        return getPrice()*getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; 
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: 10%";
    }
}

class NonVegItem extends FoodItem implements Discountable{
	public static final int extraCharge = 50;
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice() {
        return getPrice()*getQuantity()*extraCharge;
    }
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }
    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5%";
    }
}

public class OnlineFoodDeliverySystem {
	public static void processOrder(FoodItem item1,Discountable d1) {
		item1.getItemDetails();

        double total = item1.calculateTotalPrice();
        double discount = d1.applyDiscount();

        System.out.println(d1.getDiscountDetails());
        System.out.println("Total Price: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + (total - discount));
	}
	public static void main(String[] args) {
		  FoodItem item1 = new VegItem("Paneer Burger", 120, 2);
		  Discountable d1 = new VegItem("Paneer Burger", 120, 2);
		  processOrder(item1,d1);
	}
}
