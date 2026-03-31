package oops_practice.scanrio_based;

import java.util.Scanner;

public class ManageTestScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		int j=1;
		while(n-->0) {
			int highest = Integer.MIN_VALUE;
			int lowest = Integer.MAX_VALUE;
			System.out.println("Enter the score of 5 Subjects of student " + j++ +" : ");
			int[] score = new int[5];
			int sum=0;
			for(int i=0;i<5;i++) {
				int marks = sc.nextInt();
				if(marks<0) {
					System.out.println("Invalid Input . Reneter the marks");
					marks = sc.nextInt();
				}
				else {
					score[i] = marks;
					sum+=score[i];
				}
			}
			for(int i=0;i<5;i++) {
				if(score[i]>highest) {
					highest = score[i];
				}
				if(score[i]<lowest) {
					lowest = score[i];
				}
			}
			System.out.println("Average : " + sum/5);
			System.out.println("Highest Score : "+highest);
			System.out.println("Lowest Score : "+lowest);
			System.out.println("Score above average marks : ");
			for(int i:score) {
				if(i>sum/5) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
			
			
		}
		
	}
}
