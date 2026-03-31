package oops_practice.scanrio_based.OnlineExaminationSystem;

import java.util.ArrayList;
import java.util.List;

public class Exam {
	private String examName;
	private Question question;
	Exam(String examName){
		this.examName = examName;
	}
	List<Question> q = new ArrayList<>();
	public void addQuestions(Question questions) {
		q.add(questions);
	}
	public void displayQuestions() {
		for(Question que :q) {
			System.out.println(que.getquestion());
		}
	}
	
	public int evaluateExam(Student student,EvaluationStrategy strategy) 
			throws ExamTimeExpiredException{
		int score =0;
		if (!student.hasSubmitted()) {
            throw new ExamTimeExpiredException("Exam time expired!");
        }
		if(student.hasSubmitted()) {
			 for(int i=0;i<q.size();i++) {
				 score += strategy.eveluate(q.get(i), student.getAnswer(i));
			 }
		}
		return score;
	}
}
