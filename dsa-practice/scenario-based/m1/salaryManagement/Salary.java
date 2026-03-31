package m1.salaryManagement;

import java.util.HashMap;

class Salary {
	HashMap<String , Integer> empList = new HashMap<>();
	
	
	public int totalSalary(){
		int total = 0;
		for(String e : empList.keySet()) {
			total += empList.get(e);
		}
		return total;
	}
	public String  getSalary(String designation) {
		for(String e : empList.keySet()) {
			if(e.equals(designation)) {
				return "Salary is "+ empList.get(e);
			}
		}
		return "No designation match";
	}
	public void updateSalary(String designation , int newSalary) {
		empList.put(designation, newSalary);
	}
}
