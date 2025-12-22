package strings;

import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit PCM scores for students
    public static int[][] generatePCMScores(int students) {

        int[][] scores = new int[students][3];

        for (int i = 0;i<students;i++) {
            scores[i][0] = (int)(Math.random() *51) + 50; // Physics
            scores[i][1] = (int)(Math.random() *51) + 50; // Chemistry
            scores[i][2] = (int)(Math.random() *51) + 50; // Maths
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total/3.0;
            double percentage = (total/300.0)*100;

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0)/100.0;
            stats[i][2] = Math.round(percentage * 100.0)/100.0;
        }
        return stats;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrade(double[][] stats) {

        String[] grades = new String[stats.length];

        for (int i = 0;i<stats.length;i++) {
            double percent = stats[i][2];

            if (percent >= 90)
                grades[i] = "A+";
            else if (percent >= 80)
                grades[i] = "A";
            else if (percent >= 70)
                grades[i] = "B";
            else if (percent >= 60)
                grades[i] = "C";
            else if (percent >= 50)
                grades[i] = "D";
            else
                grades[i] = "F";
        }
        return grades;
    }

    // Method to display scorecard in tabular format
    public static void displayScoreCard(int[][] scores, double[][] stats, String[] grades) {

        System.out.println("Phy\tChem\tMath\tTotal\tAverage\tPercentage\tGrade");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    (int) stats[i][0] + "\t" +
                    (int) stats[i][1] + "\t" +
                    (int) stats[i][2] + "\t\t" +
                    grades[i]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int students = sc.nextInt();

        int[][] pcmScores = generatePCMScores(students);
        double[][] stats = calculateStats(pcmScores);
        String[] grades = calculateGrade(stats);
        displayScoreCard(pcmScores, stats, grades);
    }
}
