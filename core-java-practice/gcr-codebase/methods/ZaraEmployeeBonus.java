package methods;

public class ZaraEmployeeBonus {
	public static double[][] generateEmployeeData(int employees) {
        double[][] data = new double[employees][2];
        for (int i = 0; i < employees; i++) {       
            data[i][0] = 10000 + Math.random() * 90000;         
            data[i][1] = 1 + (int) (Math.random() * 10);
        }
        return data;
    }
    public static double[][] calculateBonus(double[][] employeeData) {
        double[][] result = new double[employeeData.length][2];
        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;
            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }
   // Method to calculate totals and display table
    public static void displayReport(double[][] employeeData, double[][] bonusData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        System.out.println("Emp | Old Salary | Years | Bonus % | Bonus Amt | New Salary");
        for (int i = 0; i < employeeData.length; i++) {

            double oldSalary = employeeData[i][0];
            int years = (int) employeeData[i][1];
            double bonus = bonusData[i][1];
            double newSalary = bonusData[i][0];
            double bonusPercent = (years > 5) ? 5 : 2;
            totalBonus += bonus;
            totalNewSalary += newSalary;
            totalOldSalary += oldSalary;
          
            System.out.printf(
                    "%3d | %10.2f | %5d | %7.0f%% | %9.2f | %10.2f%n",
                    (i + 1), oldSalary, years, bonusPercent, bonus, newSalary
            );
        }
        System.out.printf("TOTAL OLD SALARY  : %.2f%n", totalOldSalary);
        System.out.printf("TOTAL BONUS PAID : %.2f%n", totalBonus);
        System.out.printf("TOTAL NEW SALARY : %.2f%n", totalNewSalary);
    }

    public static void main(String[] args) {
        int employees = 10;
        double[][] employeeData = generateEmployeeData(employees);
        double[][] bonusData = calculateBonus(employeeData);

        displayReport(employeeData, bonusData);
    }
}
