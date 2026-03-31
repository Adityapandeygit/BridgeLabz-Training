package dsa_practice.gcr_codebase.sorting;

import java.util.Scanner;

public class SortStudentMarks {
	public static int[] bubbleSort(int[] marks) {
		boolean swap;
		for(int i=0;i<marks.length;i++) {
			swap = false;
			for(int j=0;j<marks.length-i-1;j++) {
				if(marks[j]>marks[j+1]) {
					// do swapping
					int temp = marks[j];
					marks[j] = marks[j+1];
					marks[j+1] = temp;
					swap = true;
				}
				
			}
			if(!swap) {
				System.out.println("No swapping required");
				break;
			}
		}
		return marks;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sort student marks using bubble sort");
		System.out.println();
		System.out.println("Enter the marks of five subjects");
		int[] marks = new int[5];
		for(int i=0;i<5;i++) {
			marks[i] = sc.nextInt();
		}
		int sortedArr[] = bubbleSort(marks);
		for(int i=0;i<marks.length;i++) {
			System.out.println(sortedArr[i]+" ");
		}
	}
}
