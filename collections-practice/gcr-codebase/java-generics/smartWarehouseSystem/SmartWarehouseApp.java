package collections_practice.gcr_codebase.java_generics.smartWarehouseSystem;

public class SmartWarehouseApp {
	public static void main(String[] args) {
		 	Storage<Electronics> electronicsStorage = new Storage<>();
	        electronicsStorage.addItem(new Electronics("Laptop", 2));
	        electronicsStorage.addItem(new Electronics("Mobile", 1));

	        Storage<Groceries> groceryStorage = new Storage<>();
	        groceryStorage.addItem(new Groceries("Milk", "10-02-2026"));
	        groceryStorage.addItem(new Groceries("Rice", "15-08-2026"));

	        Storage<Furniture> furnitureStorage = new Storage<>();
	        furnitureStorage.addItem(new Furniture("Chair", "Wood"));
	        furnitureStorage.addItem(new Furniture("Table", "Metal"));

	        System.out.println("=== Electronics ===");
	        WarehouseUtil.displayItems(electronicsStorage.getItems());

	        System.out.println("\n=== Groceries ===");
	        WarehouseUtil.displayItems(groceryStorage.getItems());

	        System.out.println("\n=== Furniture ===");
	        WarehouseUtil.displayItems(furnitureStorage.getItems());
	}
}
