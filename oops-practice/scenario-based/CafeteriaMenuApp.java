package oops_practice.scanrio_based;

import java.util.Scanner;

public class CafeteriaMenuApp {
	public static void displayMenu(String[] menu) {
		for(int i=0;i<10;i++) {
			System.out.println((i+1) + " - " +menu[i]);
		}
	}
	public static String GetItemByIndex(String[] menu,int idx) {
		return menu[idx-1];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the menu items : ");
		String[] menu = new String[10];
		for(int i=0;i<10;i++) {
			menu[i] = sc.next();
		}
		System.out.println();
		System.out.println("Menu Items are ");
		displayMenu(menu);
		System.out.println("Enter the index number of food : ");
		int idx = sc.nextInt();
		System.out.println(GetItemByIndex(menu,idx));;
	}
}
