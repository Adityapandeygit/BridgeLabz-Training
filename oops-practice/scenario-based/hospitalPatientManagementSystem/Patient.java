package oops_practice.scanrio_based.hospitalPatientManagementSystem;

abstract class Patient{
	private Doctor doctor;
	private int patientId;
	private String pname;
	private int age;
	private String disease;
	Patient(int patientId,String name,int age,String disease,Doctor doctor){
		this.patientId = patientId;
		this.pname = name;
		this.age = age;
		this.disease = disease;
		this.doctor = doctor;
	}
	// getter and setters
	public int getpatientId() {
		return patientId;
	}
	public String getpatientName() {
		return pname;
	}
	public void setpatientName(String updatename) {
		this.pname = updatename;
	}
	
	public int getpatientAge() {
		return age;
	}
	public String getdisease() {
		return disease;
	}
	public Doctor getDoctor() {
	    return doctor;
	}

	public void setDoctor(Doctor doctor) {
	    this.doctor = doctor;
	}
	public void displayPatient() {
		System.out.println("Patient name : "+pname);
		System.out.println("Patient id : "+patientId);
		System.out.println("Patient age : "+age);
		System.out.println("Patient disease : " + disease);
		System.out.println("Patient doctor : " + doctor.getdoctorName());
	}
	
	public abstract void displayInfo();
	
}