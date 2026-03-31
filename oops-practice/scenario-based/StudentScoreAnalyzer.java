package oops_practice.scanrio_based;

import java.util.Arrays;
import java.util.Scanner;

class InvalidScoreException extends RuntimeException {
    public InvalidScoreException(String message) {
        super(message);
    }
}

public class StudentScoreAnalyzer {
    public static int calculateAverage(int[] scores) {
        int sum = 0;
        for (int s : scores) {
            sum += s;
        }
        return sum/scores.length;
    }
    public static int findMax(int[] scores) {
        return scores[scores.length - 1];
    }
    public static int findMin(int[] scores) {
        return scores[0];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
            System.out.println("Enter the number of students:");
            int n = sc.nextInt();
            int[] score = new int[n];
            System.out.println("Enter student scores:");
            for (int i = 0; i < n; i++) {
                int marks = sc.nextInt();
                if (marks < 0 || marks > 100) {
                	throw new InvalidScoreException(
                	        "Invalid score: " + marks + " (Must be between 0 and 100)"
                	 );
                }
                score[i] = marks;
            }
            Arrays.sort(score);
            System.out.println("Average score : " + calculateAverage(score));
            System.out.println("Highest score : " + findMax(score));
            System.out.println("Lowest score  : " + findMin(score));
        
    }
}
