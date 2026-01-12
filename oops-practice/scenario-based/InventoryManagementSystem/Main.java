package oops_practice.scanrio_based.InventoryManagementSystem;

public class Main {
	public static void main(String[] args) {
		AlertService alertService = new EmailAlertService();
		Inventory inventory = new Inventory(alertService);
		Product p1 = new Product(101, "Keyboard", 5);
		Product p2 = new Product(102, "Mouse", 4);
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        try {
            inventory.updateStock(101, 2);  // Low stock alert
            inventory.updateStock(101, 0);  // Exception
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
	}
}
