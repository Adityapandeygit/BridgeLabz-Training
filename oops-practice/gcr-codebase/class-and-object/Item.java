package classandobject;

import java.util.Scanner;

public class Item {
	String itemCode;
    String itemName;
    double price;
    
    void displayItem() {
        System.out.println("itemCode : " + itemCode);
        System.out.println("itemPrice : " + price);
        System.out.println("itemName : " + itemName);
        System.out.println("----------------------------");
        
    }
    double calculateTotalCost(int quantity) {
        return price*quantity;
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Item item = new Item();
    	item.itemCode = "01AA";
    	item.price = 500.0;
    	item.itemName = "Water bottle";
    	item.displayItem();
    	
    	item.itemCode = "01BB";
    	item.price = 700.0;
    	item.itemName = "Rice";
    	item.displayItem();
    	
    	item.itemCode = "02AA";
    	item.price = 400.0;
    	item.itemName = "blackboard";
    	item.displayItem();
    	
    	System.out.println("Enter the item name and Quantity");
    	item.itemName = sc.next();
    	int quantity = sc.nextInt();
    	System.out.println("Total cost of "+item.itemName+ " of quantity 2 is " +  item.calculateTotalCost(quantity));
	}
}
