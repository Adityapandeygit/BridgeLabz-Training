package dsa_practice.gcr_codebase.stringBuilderandstringBuffer;

import java.util.Scanner;

public class StringBufferConcat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[5];
		System.out.println("Enter strings ");
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextLine();
		}
		StringBuffer sb = new StringBuffer();
		for(String s : arr) {
			sb.append(s);
		}
		System.out.println(sb.toString());
	}
}
