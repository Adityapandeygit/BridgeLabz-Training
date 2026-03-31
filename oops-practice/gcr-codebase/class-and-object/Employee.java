package classandobject;

public class Employee {
	String name;
    int id;
    double salary;
    
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee Salary: " + salary);
    }
    public static void main(String[] args) {
        // Creating an object of Employee class 
        Employee emp = new Employee();
        // Assigning values
        emp.name = "Rohan";
        emp.id = 1;
        emp.salary = 500000;
        emp.displayDetails();
    }
}
