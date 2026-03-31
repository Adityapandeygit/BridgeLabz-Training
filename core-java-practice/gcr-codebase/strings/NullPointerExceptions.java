package strings;
import java.util.*;
public class NullPointerExceptions {
	public static void generateException(String text) {
		System.out.println(text.length());
    }
	public static void handleException(String text) {
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
        }
    }

	public static void main(String[] args) {
		String text = null;
		try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception occurred in main method");
        }
		
		handleException(text);
	}

	
}
