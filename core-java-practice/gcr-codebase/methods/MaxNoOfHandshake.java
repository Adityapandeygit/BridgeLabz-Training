package methods;

import java.util.Scanner;

public class MaxNoOfHandshake {
	public static int handshake(int n) {
		return (n * (n - 1)) / 2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students :");
		int numberOfStudents = sc.nextInt();
		System.out.println("Number of possible handshake :"+handshake(numberOfStudents));
	}

}
