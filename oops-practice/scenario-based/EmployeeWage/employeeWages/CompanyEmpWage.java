package employeeWages;

import java.util.ArrayList;
import java.util.List;

public class CompanyEmpWage {
    String company;
    int wagePerHour;
    int maxDays;
    int maxHours;

    int totalWage;
    List<Integer> dailyWages = new ArrayList<>();

    CompanyEmpWage(String company, int wagePerHour, int maxDays, int maxHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxDays = maxDays;
        this.maxHours = maxHours;
    }

    // Stream API (UC13)
    void calculateTotalWageUsingStream() {
        totalWage = dailyWages.stream().mapToInt(Integer::intValue).sum();
    }
}
