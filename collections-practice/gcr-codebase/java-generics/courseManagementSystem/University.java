package collections_practice.gcr_codebase.java_generics.courseManagementSystem;

import java.util.List;

public class University {
	public static void showAllCourses(List<? extends CourseType> courses) {
		for(CourseType course : courses) {
			course.evaluate();
		}
	}
}
