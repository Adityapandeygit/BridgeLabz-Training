package oops_practice.scanrio_based.E_CommerceOrderManagementSystem;

public class Product {
    private int productId;
    private String productName;
    private double productPrice;

    Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getproductId() {
        return productId;
    }

    public String getproductName() {
        return productName;
    }

    public double getproductPrice() {
        return productPrice;
    }

    public void setproductName(String newName) {
        this.productName = newName;
    }

    public void setproductPrice(double newPrice) {
        this.productPrice = newPrice;
    }
}
