package m1.salaryCalculator;

public class Source {
	public static void main(String[] args) {
		SalaryData s = new SalaryData("Steve",30,10000);
		Validator v = new Validator();
		try {
			String ans = v.validateSalaryData(s);
			System.out.println(ans);
			System.out.println(v.getTotalSalary(s));
		} catch (InvalidDayException | InvalidSalaryException e) {
			
			System.out.println(e.getMessage());
		}
	}

	
}
