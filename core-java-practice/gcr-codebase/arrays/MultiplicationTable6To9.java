package arrays;

import java.util.*;

public class MultiplicationTable6To9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[4];
		for(int i=0;i<4;i++) {
			arr[i] = n*(i+6);
		}
		for(int i=0;i<4;i++) {
			System.out.println(n+" * "+(i+6)+" = "+arr[i]);
		}
	}
}
