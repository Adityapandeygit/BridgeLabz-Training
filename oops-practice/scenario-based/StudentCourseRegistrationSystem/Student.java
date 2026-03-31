package oops_practice.scanrio_based.StudentCourseRegistrationSystem;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
	private ArrayList<String> courses = new ArrayList<>();

    Student(int id, String name) {
        super(id, name);
    }

    public ArrayList<String> getCourses() {
        return courses;
    }	
}
