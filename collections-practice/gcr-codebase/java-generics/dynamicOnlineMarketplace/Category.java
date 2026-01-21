package collections_practice.gcr_codebase.java_generics.dynamicOnlineMarketplace;

public interface Category {
	 String getCategoryName();
}
class BookCategory implements Category{
	public String getCategoryName() {
        return "Books";
    }
	public String toString() {
        return getCategoryName();
    }
}
class ClothingCategory implements Category {
    public String getCategoryName() {
        return "Clothing";
    }
    public String toString() {
        return getCategoryName();
    }
}

class GadgetCategory implements Category {
    public String getCategoryName() {
        return "Gadgets";
    }
    public String toString() {
        return getCategoryName();
    }
}
