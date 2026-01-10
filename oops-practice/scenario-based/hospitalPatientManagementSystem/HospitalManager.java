package oops_practice.scanrio_based.hospitalPatientManagementSystem;

import java.util.ArrayList;

public class HospitalManager {
	ArrayList<Doctor> doctor = new ArrayList<>();
	public void addDoctors(Doctor d1) {
		doctor.add(d1);
        System.out.println("Doctor added successfully");
    }
	
	// InpatientList
	ArrayList<InPatient> inpatients = new ArrayList<>();
	public void addInPatient(InPatient ip) {
        inpatients.add(ip);
        System.out.println("InPatient added successfully");
    }
	public void updateInPatientName(int pateintId,String updatename) {
		for(InPatient p :  inpatients) {
			if(p.getpatientId()==pateintId) {
				p.setpatientName(updatename);
			}
		}
	}
	public void deleteInPatientName(int pateintId) {
		for (int i =0; i<inpatients.size();i++) {
		    if (inpatients.get(i).getpatientId() == pateintId) {
		        inpatients.remove(i);
		        System.out.println("InPatient deleted successfully");
		        return;
		    }
		}
	}
	
	public void displayInPatients() {
		for(InPatient in :inpatients) {
			in.displayInfo();
		}
	}
	// OutPatient List
	ArrayList<OutPatient> outpatients = new ArrayList<>();
	public void addOutPatient(OutPatient op) {
        outpatients.add(op);
        System.out.println("OutPatient added successfully");
    }
	public void displayOutPatients() {
		for(OutPatient out :outpatients) {
			out.displayPatient();
		}
	}
	
}
