package oops_practice.scanrio_based.OnlineExaminationSystem;

public class Question {
	private int questionNo;
	private String question;
	private String answer;
	Question(int questionNo,String question,String answer){
		this.questionNo = questionNo;
		this.question = question;
		this.answer = answer;
	}
	public int getquestionNo() {
		return questionNo;
	}
	public void setquestionNo(int newQuestionNo) {
		this.questionNo = newQuestionNo;
	}
	public String getquestion() {
		return question;
	}
	public void setquestion(String newQuestion) {
		this.question = newQuestion;
	}
	public String getanswer() {
		return answer;
	}
	public void setnaswer(String newAnswer) {
		this.answer = newAnswer;
	}
}
