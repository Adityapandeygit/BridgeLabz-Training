package oops_practice.scanrio_based.InventoryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<Product> products = new ArrayList<>();
    private AlertService alertService;
    public Inventory(AlertService alertService) {
        this.alertService = alertService;
    }
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }
    public void updateStock(int productId,int newQuantity) throws OutOfStockException {
    	for(Product p : products) {
    		if(p.getProductId() == productId) {
    			p.setQuantity(newQuantity);
    		}
    		if(newQuantity <= 2) {
    			alertService.sendLowStockAlert(p);
    		}
    		if (newQuantity == 0) {
                throw new OutOfStockException("Product is out of stock!");
            }

            System.out.println("Stock updated for " + p.getName());
    	}
    }
}
