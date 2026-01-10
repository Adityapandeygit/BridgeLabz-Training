package oops_practice.scanrio_based.hospitalPatientManagementSystem;

public class InPatient extends Patient implements Payable {
    private String roomType;
    private int no_of_days;
    private double roomCharges;

    InPatient(int patientId,String name, int age, String disease, Doctor doctor,
              String roomType, int no_of_days, double roomCharges) {
        super(patientId,name, age, disease, doctor); 
        this.roomType = roomType;
        this.no_of_days = no_of_days;
        this.roomCharges = roomCharges;
    }
    public double calculateBill() {
    	return no_of_days*roomCharges;
    }
    public void displayInfo() {
        super.displayPatient();
        System.out.println("Patient Type: In Patient");
        System.out.println("Total Bill: " + calculateBill());
    }
}
