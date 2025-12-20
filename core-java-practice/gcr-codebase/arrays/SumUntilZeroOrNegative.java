package arrays;
import java.util.*;
public class SumUntilZeroOrNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[10];
		System.out.println("Enter the element of array");
		double total = 0.0;
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextDouble();
		}
		
		int j=0;
		while(true) {
			double n = sc.nextDouble();
			if(n<=0) {
				break;
			}	
			if (j==10) {
                System.out.println("Maximum limit of 10 numbers reached");
                break;
            }
            arr[j] = n;
            j++;
		}
		for(int i=0;i<arr.length;i++) {
			total+=arr[i];
		}
		System.out.println(total);
		
		
	}
}
