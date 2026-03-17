package m1;

class Employee{
	String name;
	String projectName;
	int workingHours;
	int bonus;
	public Employee(String name,String projectName,int working) {
		this.name = name;
		this.projectName = projectName;
		this.workingHours = working;
		this.bonus = 0;
	}
	public String setBonus() {
		if((projectName.equals("web")||projectName.equals("tech")||projectName.equals("hack")||
				projectName.equals("SD")||projectName.equals("PD")) && workingHours>=30) {
			bonus = workingHours/10;
			return "Congrats";
		}
		return "Work Hard";
	}
public String checkName() {
		StringBuilder sb = new StringBuilder();
		if(name.equals("doselect")) {
			sb.append(projectName+workingHours);
		}
		else {
			sb.append(projectName);
		}
		return sb.toString();
	}
}
public class HardWorkMain {
	public static void main(String[] args) {
		Employee e = new Employee("doselect","hack",45);
		System.out.println(e.setBonus());
		System.out.println(e.checkName());
	}
}
