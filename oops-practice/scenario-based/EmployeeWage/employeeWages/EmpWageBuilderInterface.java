package employeeWages;

public interface EmpWageBuilderInterface {
	void addCompany(String company, int wagePerHour, int maxDays, int maxHours);
    void computeWages();
    int getTotalWage(String company);
}
