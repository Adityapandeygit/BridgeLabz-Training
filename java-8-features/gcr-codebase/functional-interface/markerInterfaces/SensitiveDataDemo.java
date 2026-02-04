package java_8_features.functionalInterface.markerInterfaces;

interface SensitiveData {
}
class UserData implements SensitiveData {
    String username;
    String password;

    UserData(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class ProductData {
    String productName;
    double price;

    ProductData(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
}
class EncryptionProcessor {
    public static void encrypt(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive object: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("No encryption needed for: " + obj.getClass().getSimpleName());
        }
    }
}
public class SensitiveDataDemo {
	 public static void main(String[] args) {
	        UserData user = new UserData("Aditya", "MyPassword123");
	        ProductData product = new ProductData("Laptop", 45000.0);
	        EncryptionProcessor.encrypt(user);      // Marker present → Encrypt
	        EncryptionProcessor.encrypt(product);   // Marker absent → Skip
	    }
}
