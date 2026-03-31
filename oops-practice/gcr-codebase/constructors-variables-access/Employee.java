package constructors;

public class Employee {
	public int employeeID;  
    protected String department;  
    private double salary;
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    // getter and setter for private variable
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void incrementSalary(double increasedamount) {
        this.salary += increasedamount;
    }
    
    public static void main(String[] args) {
    	Manager m1 = new Manager(1001,"It",100000);
    	m1.displayManagerDetails();
    	m1.incrementSalary(10000.0);
    	m1.displayManagerDetails();
	}
}

class Manager extends Employee {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID : " + employeeID);   
        System.out.println("Department  : " + department);   
        System.out.println("Salary      : " + getSalary());  
    }
}
