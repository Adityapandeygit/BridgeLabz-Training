package oops_practice.scanrio_based.OnlineExaminationSystem;

public class DescriptiveEvaluation {
	public int evaluate(Question question, String studentAnswer) {
        if(studentAnswer.length()>10) {
        	return 10;
        }
        if(studentAnswer.length()<=1) {
        	return 2;
        }
        return 5;
    }
}
