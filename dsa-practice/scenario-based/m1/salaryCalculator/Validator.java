package m1.salaryCalculator;

public class Validator {
	public static  String validateSalaryData(SalaryData s) throws InvalidDayException,InvalidSalaryException{
		int day = s.daysInMonth;
		if(day!=28 && day!=30 && day!=31) {
			throw new InvalidDayException("Invalid Days");
		}
		double sal = s.salary;
		if(sal<0 || sal>1000000) {
			throw new InvalidSalaryException("Invalid Salary");
		}
		return "Valid data";
	}
	public Double getTotalSalary(SalaryData s) {
		try {
			validateSalaryData(s);
			return (double) s.daysInMonth*s.salary;
		}
		catch(InvalidDayException e){
			System.out.println(e.getMessage());
		}
		catch(InvalidSalaryException e){
			System.out.println(e.getMessage());
		}
		return 0.0;
	}
}
