package collections_practice.gcr_codebase.java_generics.smartWarehouseSystem;

public class Groceries extends WarehouseItem {
    String expiryDate;
    public Groceries(String name, String expiryDate) {
        super(name);
        this.expiryDate = expiryDate;
    }

    @Override
    public void getDetails() {
        System.out.println("Groceries: " + expiryDate + ", Expiry: " + expiryDate);
    }

}
