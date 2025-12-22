package strings;
import java.util.*;
public class NumberFormatExceptions {
	public static void generateException(String s){
		System.out.println(Integer.parseInt(s));
	}
	
	public static void handleException(String s){
        try {
        	System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
        }
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		try {
            generateException(s);
        } catch (Exception e) {
            System.out.println("Exception occurred in main method");
        }
		
		handleException(s);
	}
	
}
