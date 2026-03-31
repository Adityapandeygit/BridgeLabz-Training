package collections_practice.gcr_codebase.java_generics.smartWarehouseSystem;

public class Electronics extends WarehouseItem{
	int warrantyYears;
    public Electronics(String name, int warrantyYears) {
        super(name);
        this.warrantyYears = warrantyYears;
    }
    public void getDetails() {
        System.out.println("Electronics: " + name + ", Warranty: " + warrantyYears + " years");
    }
}
