package oops_practice.scanrio_based.OnlineExaminationSystem;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student(1,"Harsh");
		s1.enroll("MidTerm");
		
		Exam e1 = new Exam("MidTerm");
		Question q1 = new Question(1, "Capital of India?", "Delhi");
		Question q2 = new Question(2, "Largest planet?", "Jupiter");
		Question q3 = new Question(3, "Fastest land animal?", "Cheetah");
		Question q4 = new Question(4, "Programming language used for Android?", "Java");
		Question q5 = new Question(5, "National bird of India?", "Peacock");
		e1.addQuestions(q1);
		e1.addQuestions(q2);
		e1.addQuestions(q3);
		e1.addQuestions(q4);
		e1.addQuestions(q5);
		System.out.println("List of Question to answer");
		e1.displayQuestions();
		System.out.println();
		System.out.println("Now submit your answers");
		s1.submitAnswer("UP");
		s1.submitAnswer("Jupiter");
		s1.submitAnswer("Cheetah");
		s1.submitAnswer("Java");
		s1.submitAnswer("Donkey");
		s1.submitExam();
		
		EvaluationStrategy strategy = new ObjectiveEvaluation();
		try {
            int score = e1.evaluateExam(s1, strategy);
            System.out.println("Final Score = " + score);
        } catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }	
     }
}
