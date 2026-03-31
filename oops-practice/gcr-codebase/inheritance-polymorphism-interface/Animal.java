package oops_practice.inheritance;

public class Animal {
	String name ;
	int age;
	Animal(){
		this.name = name;
		this.age = age;
	}
	void makeSound() {
		System.out.println("Animal makes sound");
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.makeSound();
		Animal animal = new Dog();
		dog.makeSound();
		animal.makeSound();
	}
}


class Dog extends Animal{
	Dog(){
		super();
	}
	void makeSound() {
		System.out.println("Dog makes sound");
	}
}
class Cat extends Animal{
	Cat(){
		super();
	}
	void makeSound() {
		System.out.println("Cat makes sound");
	}
}
class Bird extends Animal{
	Bird(){
		super();
	}
	void makeSound() {
		System.out.println("Bird makes sound");
	}
}
