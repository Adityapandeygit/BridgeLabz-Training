package java_8_features.lambdaExpression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Product {
    String name;
    double price;
    double rating;
    double discount;
    public Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }
    @Override
    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount + "%";
    }
}

public class ECommerceSorting {
	 public static void main(String[] args) {
	        List<Product> products = new ArrayList<>();
	        products.add(new Product("Laptop", 50000, 4.5, 10));
	        products.add(new Product("Smartphone", 20000, 4.7, 5));
	        products.add(new Product("Headphones", 2000, 4.2, 20));
	        products.add(new Product("Smartwatch", 8000, 4.6, 15));
	        Comparator<Product> sortByPrice = (p1, p2) -> Double.compare(p1.price, p2.price);
	        // Lambda to sort by rating (descending)
	        Comparator<Product> sortByRating = (p1, p2) -> Double.compare(p2.rating, p1.rating);
	        // Lambda to sort by discount (descending)
	        Comparator<Product> sortByDiscount = (p1, p2) -> Double.compare(p2.discount, p1.discount);
	        // Sort by price
	        products.sort(sortByPrice);
	        System.out.println("Sorted by Price:");
	        products.forEach(System.out::println);
	        products.sort(sortByRating);
	        
	        System.out.println("\nSorted by Rating:");
	        products.forEach(System.out::println);

	        products.sort(sortByDiscount);
	        System.out.println("\nSorted by Discount:");
	        products.forEach(System.out::println);
	        
	 }
}
