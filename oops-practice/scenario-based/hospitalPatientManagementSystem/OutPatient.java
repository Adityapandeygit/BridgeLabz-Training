package oops_practice.scanrio_based.hospitalPatientManagementSystem;

public class OutPatient extends Patient implements Payable{
	private int consultantFee;
	public OutPatient(int patientId,String name,int age,String disease,Doctor doctorname, int consultationFee) {
        super(patientId, name, age, disease,doctorname); 
        this.consultantFee = consultationFee;
    }
	public double calculateBill() {
        return consultantFee;
    }
	public void displayInfo() {
        super.displayPatient();
        System.out.println("Patient Type: Out Patient");
        System.out.println("Consultation Fee: " + consultantFee);
        System.out.println("Total Bill: " + calculateBill());
    }
}
