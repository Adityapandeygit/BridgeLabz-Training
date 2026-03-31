package collections_practice.gcr_codebase.java_generics.smartWarehouseSystem;

public abstract class WarehouseItem {
	String name;
    public WarehouseItem(String name) {
        this.name = name;
    }
	public abstract void getDetails();
}
