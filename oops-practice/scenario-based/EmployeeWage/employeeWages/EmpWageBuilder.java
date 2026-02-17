package employeeWages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class EmpWageBuilder {
	// UC3 Constants
    static final int PART_TIME = 1;
    static final int FULL_TIME = 2;

    List<CompanyEmpWage> companyList = new ArrayList<>();     // UC12
    Map<String, CompanyEmpWage> companyMap = new HashMap<>(); // UC13 Query

    Pattern companyPattern = Pattern.compile("^[A-Za-z]+$");

    // UC8 Add Multiple Companies
    public void addCompany(String company, int wagePerHour, int maxDays, int maxHours) {

        // Regex Validation
        if (!companyPattern.matcher(company).matches()) {
            System.out.println("Invalid Company Name (Only letters allowed)");
            return;
        }

        CompanyEmpWage comp = new CompanyEmpWage(company, wagePerHour, maxDays, maxHours);
        companyList.add(comp);
        companyMap.put(company, comp);
    }

    // UC1 → UC7 → UC10 → UC13
    public void computeWages() {

        for (CompanyEmpWage comp : companyList) {

            System.out.println("Welcome to Employee Wage Computation Program : " + comp.company);

            int totalHours = 0;
            int totalDays = 0;

            // UC6 Condition (Max Hours + Max Days)
            while (totalHours <= comp.maxHours && totalDays < comp.maxDays) {

                totalDays++;

                // UC1 Random Attendance
                int attendance = (int) (Math.random() * 3);

                int empHours = 0;

                // UC4 Switch Case
                switch (attendance) {
                    case PART_TIME:
                        empHours = 4;  // UC3 Part Time
                        break;

                    case FULL_TIME:
                        empHours = 8;  // UC2 Full Time
                        break;

                    default:
                        empHours = 0;  // Absent
                }

                totalHours += empHours;

                int dailyWage = empHours * comp.wagePerHour; // UC2 Daily Wage
                comp.dailyWages.add(dailyWage);              // UC13 Store Daily Wage
            }

            // Stream API → Calculate Total Wage
            comp.calculateTotalWageUsingStream();

            // Stream API → Display Daily Wages
            System.out.println("Daily Wages : ");
            comp.dailyWages.stream().forEach(w -> System.out.print(w + " "));

            System.out.println("\nTotal Wage : " + comp.totalWage);
        }
    }

    // UC13 Query Wage by Company
    public int getTotalWage(String company) {
        return companyMap.get(company).totalWage;
    }
}
