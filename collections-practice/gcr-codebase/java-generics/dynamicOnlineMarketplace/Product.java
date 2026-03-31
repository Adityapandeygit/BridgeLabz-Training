package collections_practice.gcr_codebase.java_generics.dynamicOnlineMarketplace;

public class Product<T extends Category> {
	String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void display() {
        System.out.println(name + " | " + category + " | Price: " + price);
    }

}

