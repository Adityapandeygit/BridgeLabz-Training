package constructors;

public class Course {
	private String courseName;
	private int duration;
	private double fee;
	private static String instituteName = "BridgeLabz" ;
	Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
	void displayCourseDetails() {
		System.out.println("Course name : "+ courseName);
		System.out.println("Course Duration : "+ duration);
		System.out.println("Course fees : "+ fee);
		System.out.println("Institute name : "+ instituteName);
		System.out.println();
	}
	static void updateInstituteName(String newname) {
		instituteName = newname;
	}
	
	public static void main(String[] args) {
		Course c1 = new Course("Java Full Stack", 6, 50000);
		Course c2 = new Course("Data Analytics", 4, 40000);
		c1.displayCourseDetails();
        c2.displayCourseDetails();
        
        Course.updateInstituteName("BridgeLabz Solutions");
        
        c1.displayCourseDetails();
        c2.displayCourseDetails();
	}
}
