package java_8_features.functionalInterface.staticMethodsinInterfaces;

import java.util.Scanner;

interface SecurityUtils{
	static boolean isStrongPassword(String password) {
		if (password.length() < 8) {
			return false;
		}
		return true;
	}
}
public class PasswordValidatorApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Password: ");
        String password = sc.nextLine();
        if(SecurityUtils.isStrongPassword(password)) {
        	System.out.println("Strong Password");
        }
        else {
        	System.out.println("Weak Passord");
        }
	}
}
