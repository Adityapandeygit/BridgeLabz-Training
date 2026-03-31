package Level_1_Practice_Programs;

import java.util.Scanner;

public class MaximumHandshake {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("the number of possible handshakes "+(n * (n - 1)) / 2);
		
	}
}
