package constructors;

public class Product {
	 String productName;
	 int price;
	 static int totalProducts ;
	
	Product(String productName,int price){
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	void displayProductDetails() {
		System.out.println("Name of product : "+productName);
		System.out.println("Price of products : "+price);
		
	}
	static void displayTotalProducts() {
		System.out.println("Total products : "+ totalProducts);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Product p1 = new Product("Toffee",10);
		p1.displayProductDetails();
		displayTotalProducts();
		Product p2 = new Product("Chocolate",20);
		p2.displayProductDetails();
		displayTotalProducts();
		Product p3 = new Product("Coldrink",40);
		p3.displayProductDetails();
		displayTotalProducts();
		
	}
}
