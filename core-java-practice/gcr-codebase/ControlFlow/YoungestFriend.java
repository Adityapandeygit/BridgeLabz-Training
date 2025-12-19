package ControlFlow;

import java.util.Scanner;

public class YoungestFriend {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int amarAge = sc.nextInt();
        int akbarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();
        
        int amarHt = sc.nextInt();
        int akbarHt = sc.nextInt();
        int anthonyHt = sc.nextInt();

        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Amar is the youngest.");
        } 
        else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Akbar is the youngest.");
        } 
        else {
            System.out.println("Anthony is the youngest.");
        }

        if (amarHt > akbarHt && amarHt > anthonyHt) {
            System.out.println("Amar is the tallest.");
        } 
        else if (akbarHt > amarHt && akbarHt > anthonyHt) {
            System.out.println("Akbar is the tallest.");
        } 
        else {
            System.out.println("Anthony is the tallest.");
        }
	}
}
