package dsa_practice.scenario_based.onlineExamReviewSystem;

import java.util.HashMap;
import java.util.Stack;

public class ExamProctor {
	 Stack<Integer> navigationStack;
     HashMap<Integer, String> answers;
     HashMap<Integer, String> correctAnswers;
     public ExamProctor() {
         navigationStack = new Stack<>();
         answers = new HashMap<>();
         correctAnswers = new HashMap<>();

         correctAnswers.put(1, "A");
         correctAnswers.put(2, "B");
         correctAnswers.put(3, "C");
         correctAnswers.put(4, "D");
     }
     public void visitQuestion(int questionId) {
         navigationStack.push(questionId);
         System.out.println("Visited Question: " + questionId);
     }
     public void submitAnswer(int questionId, String answer) {
         answers.put(questionId, answer);
         System.out.println("Answer saved for Q" + questionId);
     }
     public void goBack() {
         if (!navigationStack.isEmpty()) {
             int last = navigationStack.pop();
             System.out.println("Returned from Question: " + last);
         } else {
             System.out.println("No previous question.");
         }
     }
     public int calculateScore() {
    	 int ans =0;
    	 for(int qId : answers.keySet()) {
    		 if(answers.get(qId).equalsIgnoreCase(correctAnswers.get(qId))) {
    			 ans++;
    		 }
    	 }
    	 return ans;
     }
}
