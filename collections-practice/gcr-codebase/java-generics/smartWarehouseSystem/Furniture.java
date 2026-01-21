package collections_practice.gcr_codebase.java_generics.smartWarehouseSystem;

public class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, String material) {
        super(name);
        this.material = material;
    }

    @Override
    public void getDetails() {
        System.out.println("Furniture: " + name + ", Material: " + material);
    }

}
