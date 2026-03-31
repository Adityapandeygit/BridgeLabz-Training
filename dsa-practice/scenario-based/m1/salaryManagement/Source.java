package m1.salaryManagement;

public class Source {
	public static void main(String[] args) {
		Salary obj = new Salary();
		obj.empList.put("CEO", 20000);
		obj.empList.put("Developer", 5000);
		System.out.println(obj.totalSalary());
		obj.updateSalary("Doveloper", 6000);
		System.out.println(obj.getSalary("Doveloper"));
		
	}
}
