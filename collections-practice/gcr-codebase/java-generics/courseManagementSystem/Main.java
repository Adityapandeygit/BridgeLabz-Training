package collections_practice.gcr_codebase.java_generics.courseManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Course<ExamCourse> javaCourse =
                new Course<>("Java Programming", new ExamCourse());

        Course<AssignmentCourse> aiCourse =
                new Course<>("Artificial Intelligence", new AssignmentCourse());

        Course<ResearchCourse> phdCourse =
                new Course<>("PhD Research", new ResearchCourse());
        javaCourse.displayCourseDetails();
        System.out.println();
        aiCourse.displayCourseDetails();
        System.out.println();
        phdCourse.displayCourseDetails();
        System.out.println();
        
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(new ExamCourse());
        allCourses.add(new AssignmentCourse());
        allCourses.add(new ResearchCourse());
        
        System.out.println("University Evaluation System");
        University.showAllCourses(allCourses);
	}
}
