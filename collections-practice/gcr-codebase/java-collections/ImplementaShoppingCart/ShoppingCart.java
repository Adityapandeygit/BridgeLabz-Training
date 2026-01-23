package collections_practice.gcr_codebase.java_collections.ImplementaShoppingCart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

class ShoppingCartManagement{
	HashMap<String, Double> priceMap = new HashMap<>();
	LinkedHashMap<String, Integer> cartItems = new LinkedHashMap<>();
	
	public void addProduct(String product, double price) {
        priceMap.put(product, price);
    }
	
	public void addToCart(String product, int quantity) {
		cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
	}
	
	public void displayCart() {
        System.out.println("Cart Items (Insertion Order):");
        for (String product : cartItems.keySet()) {
            System.out.println(
                product +"  Qty: " + cartItems.get(product) +"  Price: ₹" + priceMap.get(product)
            );
        }
    }
	
	public void displaySortedByPrice() {
	    TreeMap<Double, List<String>> sortedMap = new TreeMap<>();
	    for (String product : cartItems.keySet()) {
	        double price = priceMap.get(product);
	        if (!sortedMap.containsKey(price)) {
	            sortedMap.put(price, new ArrayList<>());
	        }
	        sortedMap.get(price).add(product);
	    }
	    
	    System.out.println("Items Sorted By Price:");
	    for (Double price : sortedMap.keySet()) {
	        for (String product : sortedMap.get(price)) {
	            System.out.println(product + " -> " + price);
	        }
	    }
	}
}


public class ShoppingCart {
	public static void main(String[] args) {
		ShoppingCartManagement cart = new ShoppingCartManagement();
		cart.addProduct("Laptop", 60000.);
	    cart.addProduct("Mouse", 500);
	    cart.addProduct("Keyboard", 1500);
	    cart.addProduct("Headphones", 1500);
	    
	    cart.addToCart("Laptop", 1);
	    cart.addToCart("Mouse", 2);
	    cart.addToCart("Keyboard", 1);
	    cart.addToCart("Headphones", 1);
	    
	    cart.displayCart();
	    System.out.println();
	    cart.displaySortedByPrice();
	}
}
