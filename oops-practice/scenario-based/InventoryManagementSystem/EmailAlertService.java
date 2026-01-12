package oops_practice.scanrio_based.InventoryManagementSystem;

public class EmailAlertService implements  AlertService{
	public void sendLowStockAlert(Product product) {
        System.out.println("Low stock alert for product: " + product.getName());
    }
}
