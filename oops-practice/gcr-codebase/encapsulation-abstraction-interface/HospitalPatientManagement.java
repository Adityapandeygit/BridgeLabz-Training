package oops_practice.Encapsulation_Polymorphism_Interfaces_AbstractClasses;

import java.util.ArrayList;
import java.util.List;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient implements MedicalRecord {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();
    
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History:");
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }
}

class InPatient extends Patient {
    private int numberOfDays;
    private double dailyCharge;

    public InPatient(int patientId, String name, int age,int numberOfDays, double dailyCharge) {
        super(patientId, name, age);
        this.numberOfDays = numberOfDays;
        this.dailyCharge = dailyCharge;
    }
    @Override
    public double calculateBill() {
        return numberOfDays * dailyCharge;
    }
}
class OutPatient extends Patient {
    private double consultationFee;
    public OutPatient(int patientId, String name, int age,
                      double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }
    @Override
    public double calculateBill() {
        return consultationFee;
    }
}
public class HospitalPatientManagement {
	public static void processPatient(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Bill Amount: ₹" + patient.calculateBill());
        patient.viewRecords();
    }
	public static void main(String[] args) {
		Patient p1 = new InPatient(101, "Aditya", 21, 5, 2000);
		p1.setDiagnosis("Viral Fever");
		p1.addRecord("Admitted on 10th Jan");
		p1.addRecord("Discharged on 15th Jan");
		processPatient(p1);
	}
}
