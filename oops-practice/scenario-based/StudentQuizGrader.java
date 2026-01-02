package oops_practice.scanrio_based;

import java.util.Scanner;

public class StudentQuizGrader {
	public static int calculateScore(String[] correct, String[] student) {
		int score = 0;
		int j=1;
		for(int i=0;i<correct.length;i++) {
			if(correct[i].equalsIgnoreCase(student[i])) {
				System.out.println("Question "+(j++)+": Correct");
				score++;
			}
			else {
				System.out.println("Question "+ (j++) +": InCorrect");
			}
		}
		return score;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] correctAnswers = {"A", "C", "B", "D", "A","B", "C", "D", "A", "C"};
		String[] studentAnswers = new String[10];
		System.out.println("Enter the options in the form of a,b,c,d or A,B,C,D");
		for(int i=0;i<10;i++) {
			studentAnswers[i] = sc.nextLine();
		}
		int score = calculateScore(correctAnswers,studentAnswers);
		System.out.println("Total score : " + score);
		System.out.println("Percentage : "+ (score*100)/10);
		if(score<33) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Pass");
		}
	}
}
