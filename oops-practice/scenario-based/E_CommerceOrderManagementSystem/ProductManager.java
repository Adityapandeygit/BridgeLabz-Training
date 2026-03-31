package oops_practice.scanrio_based.E_CommerceOrderManagementSystem;

import java.util.*;

public class ProductManager {
    private List<Product> products = new ArrayList<>();
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added successfully");
    }
    public void viewAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available");
            return;
        }

        for (Product p : products) {
            System.out.println(
                "ID: " + p.getproductId() +
                ", Name: " + p.getproductName() +
                ", Price: ₹" + p.getproductPrice()
            );
        }
    }

    public Product getProductById(int id) {
        for (Product p : products) {
            if (p.getproductId() == id) {
                return p;
            }
        }
        System.out.println("Product not found: " + id);
        return null;
    }

    public void updateProduct(int id, String newName, double newPrice) {
        for (Product p : products) {
            if (p.getproductId() == id) {
                p.setproductName(newName);
                p.setproductPrice(newPrice);
                System.out.println("Product updated successfully");
                return;
            }
        }
        System.out.println("Product not found");
    }

    public void deleteProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getproductId() == id) {
                products.remove(i);
                System.out.println("Product deleted successfully");
                return;
            }
        }
        System.out.println("Product not found");
    }
}
