package constructors;

public class Student {
	public int rollNumber;
    protected String name;
    private double cgpa;
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }
    // Public getter for CGPA
    public double getCgpa() {
        return cgpa;
    }
    // Public setter for CGPA
    public void setCgpa(double cgpa) {
        if (cgpa>=0 && cgpa<=20) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA");
        }
    }
    public void displayStudent() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name : " + name);
        System.out.println("CGPA : " + cgpa);
    }
    
    public static void main(String[] args) {
    	PostgraduateStudent pg = new PostgraduateStudent(101, "Aditya", 8.5, "Data Science");
    	pg.displayPostgraduateDetails();
    	pg.setCgpa(9.2);
    	System.out.println("Updated CGPA: " + pg.getCgpa());
	}
    
}

class PostgraduateStudent extends Student {
	String specialization;
	public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
        
    }
	void displayPostgraduateDetails() {
        System.out.println("Roll Number: " + rollNumber);   
        System.out.println("Name: " + name);                
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCgpa());           
    }
}
