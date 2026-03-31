package collections_practice.gcr_codebase.java_generics.dynamicOnlineMarketplace;

//Generic Discount class (NO wildcard)
class DiscountUtil {

 public static <T extends Category> void applyDiscount(
         Product<T> product, double percent) {

     product.price = product.price - (product.price * percent / 100);
 }
}
