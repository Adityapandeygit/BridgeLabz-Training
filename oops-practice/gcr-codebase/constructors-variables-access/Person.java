package constructors;

public class Person {
	String name;
	int age;
	// parameterised constructor
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	// creating copy constructor
	Person(Person other){
		this.name = other.name;
		this.age = other.age;
	}
	void display() {
		System.out.println("Name of person "+name);
		System.out.println("Age "+age);
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Aditya",21);
		p1.display();
		Person p2 = new Person(p1);
		p2.display();
	}
}
