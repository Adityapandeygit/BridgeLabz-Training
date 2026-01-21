package collections_practice.gcr_codebase.java_generics.dynamicOnlineMarketplace;

public class Main {
	public static void main(String[] args) {

        Product<BookCategory> book =
                new Product<>("Java Book", 500, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("Shirt", 1000, new ClothingCategory());

        Product<GadgetCategory> phone =
                new Product<>("Phone", 20000, new GadgetCategory());

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 20);
        DiscountUtil.applyDiscount(phone, 5);

        book.display();
        shirt.display();
        phone.display();
	}
}
