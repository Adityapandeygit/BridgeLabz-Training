package arrays;
import java.util.*;
public class PositiveNegativeZeroCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter the element of the array");
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				if(arr[i]%2==0) {
					System.out.println("Even ");
				}
				else {
					System.out.println("Odd");
				}
			}
			else if(arr[i]==0) {
				System.out.println("Zero");
			}
			else {
				System.out.println("Negative");
			}
		}
		
		if(arr[0]==arr[arr.length-1]) {
			System.out.println("Equal");
		}
		else if(arr[0]>arr[arr.length-1]) {
			System.out.println("Greater");
		}
		else {
			System.out.println("Less");
		}
	}
}
