package oops_practice.scanrio_based;

import java.util.ArrayList;
import java.util.List;

class InvalidQuizSubmissionException extends RuntimeException {
    public InvalidQuizSubmissionException(String message) {
        super(message);
    }
}

public class OnlineQuizPlatform {
	public static int calculateScore(String[] correctAnswers, String[] userAnswers) {
        if (correctAnswers.length != userAnswers.length) {
            throw new InvalidQuizSubmissionException(
                "Number of answers does not match the quiz questions."
            );
        }
        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;
            }
        }
        return score;
    }
	 public static String assignGrade(int score, int totalQuestions) {
	        double percentage = (score*100.0)/totalQuestions;
	        if (percentage >= 90) return "A";
	        else if (percentage >= 75) return "B";
	        else if (percentage >= 60) return "C";
	        else return "D";
	    }
	
	 public static void displayResult(int score, int totalQuestions) {
	        System.out.println("Score: " + score);
	        System.out.println("Grade: " + assignGrade(score, totalQuestions));
	 }

	public static void main(String[] args) {
		String[] correctAnswers = {"A", "B", "C", "D", "A"};
		List<Integer> userScores = new ArrayList<>();
		try {
            String[] user1 = {"A", "B", "A", "C", "B"};
            int score1 = calculateScore(correctAnswers, user1);
            userScores.add(score1);
            displayResult(score1, correctAnswers.length);

           
        } catch (InvalidQuizSubmissionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nAll User Scores: " + userScores);
	}
}
