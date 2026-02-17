package employeeWages;

public class EmployeeWageMain {
	public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        EmpWageBuilder builder = new EmpWageBuilder();

        // UC8 Multiple Companies
        builder.addCompany("TCS", 20, 20, 100);
        builder.addCompany("Infosys", 25, 22, 110);
        builder.addCompany("Wipro", 18, 20, 100);

        builder.computeWages();

        // UC13 Query Example
        System.out.println("Queried Total Wage for TCS : " +
                builder.getTotalWage("TCS"));
    }
}
