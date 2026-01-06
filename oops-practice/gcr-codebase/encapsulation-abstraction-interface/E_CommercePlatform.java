package oops_practice.Encapsulation_Polymorphism_Interfaces_AbstractClasses;
import java.util.*;

interface Taxable {
	double  calculateTax();
	void getTaxDetails();	
}

abstract class Product{
	private int productId;
	private String name;
	private double price;
	Product(int productId,String name,double price){
		this.productId=productId;
		this.name = name;
		this.price = price;
	}
	// getter and setter for private variables
	public int getproductId() {
		return productId;
	}
	public void setproductId(int productId) {
		this.productId =  productId;
	}
	public String getName() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	abstract double calculateDiscount();
	
}
class Electronics extends Product implements Taxable {
	Electronics(int productId,String name,double price){
		super(productId,name,price);
	}
	@Override
	double calculateDiscount() {
		return getPrice()*0.20;
		
	}
	@Override
	public double calculateTax() {
		return getPrice()*0.18;
	}
	@Override
	public void getTaxDetails() {
		System.out.println("Electronics Tax: 18%");
		
	}
}
class Clothing extends Product implements Taxable {
	Clothing(int productId,String name,double price){
		super(productId,name,price);
	}

	@Override
	double calculateDiscount() {
		return getPrice()*0.10;
	}

	@Override
	public double calculateTax() {
		return getPrice() * 0.12;
	}

	@Override
	public void getTaxDetails() {
		System.out.println("Clothing Tax: 12%");
	}
}
class Groceries extends Product implements Taxable {
	Groceries(int productId,String name,double price){
		super(productId,name,price);
	}

	@Override
	double calculateDiscount() {
		return getPrice() * 0.05;	
	}

	@Override
	public double calculateTax() {
		return getPrice()*0.10;
	}

	@Override
	public void getTaxDetails() {
		System.out.println("Clothing Tax: 10%");
	}
}


public class E_CommercePlatform {
	public static void finalPrice(Product product) {
		double tax = 0;
		if (product instanceof Taxable) {
            Taxable t = (Taxable) product;
            tax = t.calculateTax();
            t.getTaxDetails();
        }
		double discount = product.calculateDiscount();
        double finalPrice = product.getPrice() + tax - discount;
        System.out.println("Product: " + product.getName());
        System.out.println("Base Price: " + product.getPrice());
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);
	}
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Electronics(101, "Laptop", 60000));
        products.add(new Clothing(102, "T-Shirt", 2000));
        products.add(new Groceries(103, "Rice", 1200));
        for (Product p : products) {
            finalPrice(p);
        }
		
	}
	
}
