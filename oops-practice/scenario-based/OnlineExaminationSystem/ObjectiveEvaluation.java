package oops_practice.scanrio_based.OnlineExaminationSystem;

public class ObjectiveEvaluation implements EvaluationStrategy{
	public int eveluate(Question question,String answer) {
		if(question.getanswer().equalsIgnoreCase(answer)) {
			return 1;
		}
		return 0;
	}
}
