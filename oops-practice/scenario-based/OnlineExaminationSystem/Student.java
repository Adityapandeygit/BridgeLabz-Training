package oops_practice.scanrio_based.OnlineExaminationSystem;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int rollNo;
	private String name;
	Student(int rollNo,String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getrollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public void enroll(String examName) {
		System.out.println("Student = "+name +" enrolled in = "+ examName);
	}
	private List<String> ans = new ArrayList<>();
	boolean submitted = false;
	public void submitAnswer(String answer) {
		ans.add(answer);
	}
	public String getAnswer(int index) {
		return ans.get(index);
	}
	public void submitExam() {
		submitted=true;
	}
	public boolean hasSubmitted() {
        return submitted;
    }
	
}
