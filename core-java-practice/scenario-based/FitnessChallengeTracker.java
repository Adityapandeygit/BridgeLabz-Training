package senerio_based;

import java.util.Scanner;

public class FitnessChallengeTracker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] pushups = new int[7];
		for(int i=0;i<7;i++) {
			System.out.println("Enter the number of push-ups done today :");
			pushups[i] = sc.nextInt();
		}
		int total=0;
		
		int activedays = 0;
		for(int i : pushups) {
			if(i==0) {
				// skip day
				continue;
			}
			total+=i;
			activedays++;
		}
		double avg = total/activedays;
		System.out.println("Total Push-ups in the week: "+total);
		System.out.println("Average Push-ups per active day: "+avg);
	}
}
