package oops_practice.inheritance;

public class Course {
	String courseName ;
	int duration;
	Course(String courseName,int duration){
		this.courseName = courseName;
		this.duration = duration;
	}
	void displayDetails() {
	        System.out.println("Course Name: " + courseName);
	        System.out.println("Duration: " + duration + " months");
	}
	
	public static void main(String[] args) {
		 PaidOnlineCourse course = new PaidOnlineCourse("Java Full Stack",12,"Udemy",true,10000,20);
	        course.displayDetails();
	}
}
class OnlineCourse extends Course{
	String platform ;
	boolean isRecorded;
	OnlineCourse(String courseName, int duration,String platform,boolean isRecorded) {
		super(courseName, duration);
		this.platform = platform;
		this.isRecorded = isRecorded;
	}
	void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
	
}	
class PaidOnlineCourse extends OnlineCourse{
	int fee;
	int discount;
	PaidOnlineCourse(String courseName, int duration,String platform,Boolean isRecorded,int fee,int discount){
		super(courseName,duration,platform,isRecorded);
		this.fee = fee;
		this.discount = discount;
	}
	double calculateFinalFee() {
        return fee - (fee * discount/100);
    }
	void displayDetails() {
        super.displayDetails();
        System.out.println("Course Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: ₹" + calculateFinalFee());
    }
}
