package arrays;
import java.util.*;
public class LargestAndSecondLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number  = sc.nextInt();
		int maxDigit  = 10;
		int[] arr = new int[maxDigit];
		int i=0;
		while(i<arr.length) {
			int rem = number%10;
			arr[i] = rem;
			number/=10;
			i++;
		}
		int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
		for(int j=0;j<arr.length;j++){
			if(arr[j]>largest){
				largest = arr[j];
                secondLargest = largest;
            } 
			else if(arr[j]>secondLargest && arr[j]!=largest) {
                secondLargest=arr[j];
            }
		}
	}
}
