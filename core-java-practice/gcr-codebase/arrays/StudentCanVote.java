package arrays;
import java.util.*;
public class StudentCanVote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		System.out.println("Enter the ages");
		for(int i=0;i<10;i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i=0;i<10;i++) {
			if(array[i]<0) {
				System.out.println("Invalid Age");
			}
			else if(array[i]>=18) {
				System.out.println("The student with the age :"+array[i]+" can vote .");
			}
			else {
				System.out.println("The student with the age :"+array[i]+" cannot vote .");
			}
		}
	}
}
