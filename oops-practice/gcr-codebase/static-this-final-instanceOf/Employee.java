package staticfinalinstanceOf;

public class Employee {
	static String companyName = "Tech Solutions Inc.";
    static int totalEmployees = 0;
    String name;
    String designation;
    final int id;	
    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++; 
    }
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    void displayEmployeeDetails(Object obj) {
        if (obj instanceof Employee) {	
        	Employee e = (Employee) obj;
        	displayTotalEmployees();
        	System.out.println("Company Name: "+ companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Object is not an Employee");
        }
    }
    
    
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Thamarai", "Software Engineer");
        Employee e2 = new Employee(102, "Rohan", "Project Manager");
        e1.displayEmployeeDetails(e1);
        System.out.println();
        System.out.println("Company Name: " + Employee.companyName);
        e2.displayEmployeeDetails(e2);
        
    }
}
