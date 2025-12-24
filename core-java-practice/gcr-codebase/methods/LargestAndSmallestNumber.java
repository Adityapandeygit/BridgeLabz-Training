package methods;

import java.util.Scanner;

public class LargestAndSmallestNumber {
	public static int[] smallestandlargest(int n1,int n2,int n3) {
		int smallest = Math.min(n1, Math.min(n2, n3));
        int largest = Math.max(n1, Math.max(n2, n3));
        return new int[]{smallest,largest};
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int[] ans = smallestandlargest(n1,n2,n3);
		System.out.println("Smallest number :"+ans[0]+" Largest Number :"+ans[1]);
	}
}
