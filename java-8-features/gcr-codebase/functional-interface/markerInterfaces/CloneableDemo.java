package java_8_features.functionalInterface.markerInterfaces;

class Employee implements Cloneable {
 int id;
 String name;
 Employee(int id, String name) {
     this.id = id;
     this.name = name;
 }

 protected Object clone() throws CloneNotSupportedException {
     return super.clone();
 }

 void display() {
     System.out.println("ID: " + id + ", Name: " + name);
 }
}

public class CloneableDemo {
	public static void main(String[] args) {

        try {
            Employee emp1 = new Employee(101, "Aditya");
            Employee emp2 = (Employee) emp1.clone();

            System.out.println("Original Object:");
            emp1.display();

            System.out.println("Cloned Object:");
            emp2.display();

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
        }
    }
}
