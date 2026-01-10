package oops_practice.scanrio_based.hospitalPatientManagementSystem;

public class Doctor {
	private int doctorId;
	private String dname;
	private double charges;
	Doctor(int doctorId,String name,double charges){
		this.doctorId = doctorId;
		this.dname = name;
		this.charges = charges;
	}
	public void displayDoctor() {
		System.out.println("Doctor name : "+dname);
		System.out.println("Doctor Id : "+doctorId);
		System.out.println("Doctor Charges : "+charges);
	}
	public int getdoctorId() {
		return doctorId;
	}
	public String getdoctorName() {
		return dname;
	}
}
