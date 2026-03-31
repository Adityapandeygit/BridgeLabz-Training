package oops_practice.scanrio_based.hospitalPatientManagementSystem;

public class Main {
	public static void main(String[] args) {
		HospitalManager manager = new HospitalManager();
		System.out.println("Welcome to Hospital Managemant System");
		System.out.println();
		
		// Adding  doctors
		Doctor d1 = new Doctor(1, "Dr. Sharma", 2000);
		Doctor d2 = new Doctor(2, "Dr. Pandey", 1500);
		manager.addDoctors(d1);
		manager.addDoctors(d1);
		
        System.out.println();
        
        // Adding patients
        InPatient ip1 = new InPatient(101,"Rahul",45,"Fever",d1,"AC",5,2000);
        InPatient ip2 = new InPatient(102,"Prashant",35,"Cough",d2,"Normal",3,500);
        manager.addInPatient(ip1);
        manager.addInPatient(ip2);
        System.out.println();
        System.out.println("Display InPatients ");
        
        
        manager.updateInPatientName(101, "Rahul Kumar");
        manager.displayInPatients();
        
        OutPatient op1 = new OutPatient(201, "Amit", 30, "Headache", d1, 600);
        OutPatient op2 = new OutPatient(202, "Neha", 28, "Cold", d2, 400);
        manager.addOutPatient(op1);
        manager.addOutPatient(op2);
        
        System.out.println(" Display OutPatients");
        manager.displayOutPatients();
		
	}
}
