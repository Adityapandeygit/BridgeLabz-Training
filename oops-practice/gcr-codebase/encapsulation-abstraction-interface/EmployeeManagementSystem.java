package oops_practice.Encapsulation_Polymorphism_Interfaces_AbstractClasses;

import java.util.ArrayList;
import java.util.List;

interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}
abstract class Employee implements Department {
    private int employeeId;
    String name;
    protected double baseSalary;
    private String department;
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public abstract double calculateSalary();
    public void displayDetails() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + calculateSalary());
    }
    // Interface methods
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }
    @Override
    public String getDepartmentDetails() {
        return department;
    }

    // Getters (Encapsulation)
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
}
class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary; 
    }
}

class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, int hoursWorked, double hourlyRate) {
        super(employeeId, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new FullTimeEmployee(101, "Rahul", 50000);
        emp1.assignDepartment("IT");
        Employee emp2 = new PartTimeEmployee(102, "Anita", 80, 500);
        emp2.assignDepartment("HR");

        employees.add(emp1);
        employees.add(emp2);

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
