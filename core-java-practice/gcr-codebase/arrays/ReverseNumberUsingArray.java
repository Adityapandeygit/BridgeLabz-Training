package arrays;
import java.util.*;
public class ReverseNumberUsingArray {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        while(temp>0){
            count++;
            temp = temp/10;
        }

        int[] digits = new int[count];
        temp = number;

        for (int i=0;i<count;i++) {
            digits[i] = temp%10;
            temp = temp/10;
        }
        System.out.print("Reversed number: ");
        System.out.println(Arrays.toString(digits));
	}

}
