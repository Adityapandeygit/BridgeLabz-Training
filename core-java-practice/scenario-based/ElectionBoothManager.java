package senerio_based;

import java.util.Scanner;

public class ElectionBoothManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int candidate1 = 0;
		int candidate2 = 0;
		int candidate3 = 0;
		while(true) {
			System.out.println("Enter the age :");
			int age = sc.nextInt();
			if(age>=18) {
				System.out.println("You are elegible for vote .Kindly caste your vote");
				System.out.println("For candidate1:01, candidate2=02, candidate3=03");
				int vote = sc.nextInt();
				if(vote==01) {
					candidate1++;
				}
				else if(vote==02) {
					candidate2++;
				}
				else {
					candidate3++;
				}
			}
			else {
				System.out.println("Not elegible for vote");
				break;
			}
		}
		System.out.println("Election Results ");
        System.out.println("Candidate A: " + candidate1 + " votes");
        System.out.println("Candidate B: " + candidate2 + " votes");
        System.out.println("Candidate C: " + candidate3 + " votes");
	}
}
