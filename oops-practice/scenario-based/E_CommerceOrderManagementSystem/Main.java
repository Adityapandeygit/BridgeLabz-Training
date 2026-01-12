package oops_practice.scanrio_based.E_CommerceOrderManagementSystem;

public class Main {
	public static void main(String[] args) {
		   ProductManager pm = new ProductManager();
	        // CRUD TEST
	        pm.addProduct(new Product(1, "Laptop", 50000));
	        pm.addProduct(new Product(2, "Mobile", 20000));

	        pm.viewAllProducts();

	        pm.updateProduct(2, "Smartphone", 22000);
	        pm.viewAllProducts();

	        Product selectedProduct = pm.getProductById(1);

	        // ORDER + PAYMENT TEST
	        Customer customer = new Customer(101, "Aditya");
	        Payment payment = new CardPayment();

	        Order order = customer.placeOrder(1001, selectedProduct, 1, payment);
	        order.trackOrder();
    }
}
