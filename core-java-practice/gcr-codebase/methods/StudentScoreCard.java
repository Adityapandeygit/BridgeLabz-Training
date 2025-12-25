package methods;

import java.util.Scanner;

public class StudentScoreCard {
	public static int[][] generatePCMScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                // Generate 2-digit marks (10 to 99)
                scores[i][j] = 10 + (int) (Math.random() * 90);
            }
        }
        return scores;
    }
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] result = new double[students][3];
        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            // Round off to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] scores, double[][] result) {
        System.out.println("Stu\tPhysics\tChemistry\tMaths\tTotal\tAvg\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                    scores[i][0] + "\t\t" +
                    scores[i][1] + "\t\t" +
                    scores[i][2] + "\t" +
                    (int) result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        int[][] pcmScores = generatePCMScores(students);
        double[][] results = calculateResults(pcmScores);
        displayScoreCard(pcmScores, results);
    }
}
