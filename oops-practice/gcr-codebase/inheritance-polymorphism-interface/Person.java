package oops_practice.inheritance;

public class Person {
	String name;
	int age;
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	void displayRole() {
		System.out.println("Role of Everyone");
	}
	public static void main(String[] args) {
		Person p1 = new Teacher("Aditya Pandey" , 21,"Maths");
		p1.displayRole();
		System.out.println();
		Person p2 = new Student("Rahul Pandey" , 21,"A");
		p2.displayRole();
		System.out.println();
		Person p3 = new Staff("Rahul Pandey" , 21,"Electricity");
		p3.displayRole();
	}
	
}
class Teacher extends Person{
	String subject ;
	Teacher(String name,int age,String subject){
		super(name,age);
		this.subject = subject;
	}
	void displayRole(){
		super.displayRole();
		System.out.println("Subject of teacher"+subject);
	}
}

class Student extends Person{
	String grade ;
	Student(String name,int age,String grade){
		super(name,age);
		this.grade = grade;
	}
	void displayRole(){
		super.displayRole();
		System.out.println("Grade of student"+grade);
	}
}
class Staff extends Person{
	String sevice;
	Staff(String name,int age,String sevice){
		super(name,age);
		this.sevice = sevice;
	}
	void displayRole(){
		super.displayRole();
		System.out.println("Typer of service of Staff "+sevice);
	}
}
