package oops_practice.inheritance;

public class Employee {
	String name;
	int id;
	double salary;
	Employee(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	void displayDetails() {
		System.out.println("Name of employee : " + this.name);
		System.out.println("Id : "+ this.id);;
		System.out.println("Salary : "+this.salary);
	}
	public static void main(String[] args) {
		Employee e1 = new Manager("Aditya", 101, 100000, 10);
		Employee e2 = new Developer("Rahul", 102, 80000, "Java");
		Employee e3 = new Intern("Aman", 103, 15000, "B.Tech");

		e1.displayDetails();
		e2.displayDetails();
		e3.displayDetails();
	}
}

class Manager extends Employee{
	int teamSize;
	Manager(String name,int id,double salary,int teamSize){
		super(name,id,salary);
		this.teamSize = teamSize;
	}
	void displayDetails() {
		super.displayDetails();
		System.out.println("Team size : "+teamSize);
	}
}

class Developer extends Employee{
	String programmingLanguage ;
	Developer(String name,int id,double salary,String programmingLanguage){
		super(name,id,salary);
		this.programmingLanguage = programmingLanguage;
	}
	void displayDetails() {
		super.displayDetails();
		System.out.println("Programing Language : "+programmingLanguage);
	}
}

class Intern extends Employee{
	String courseName;
	Intern(String name,int id,double salary,String courseName){
		super(name,id,salary);
		this.courseName = courseName;
	}
	void displayDetails() {
		super.displayDetails();
		System.out.println("Course Name : "+courseName);
	}
}
