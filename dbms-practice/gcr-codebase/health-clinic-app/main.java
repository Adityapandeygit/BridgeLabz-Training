package jdbc_dbms.healthclinic;

import service.ClinicService;
import model.*;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {

        ClinicService service = new ClinicService();
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n1. Register Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Book Appointment");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:
                    System.out.print("Name: ");
                    String pname = sc.nextLine();

                    System.out.print("DOB (YYYY-MM-DD): ");
                    String dob = sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Address: ");
                    String address = sc.nextLine();

                    System.out.print("Blood Group: ");
                    String bg = sc.nextLine();

                    service.registerPatient(new Patient(pname,dob,phone,address,bg));
                    break;

                case 2:
                    System.out.print("Doctor Name: ");
                    String dname = sc.nextLine();

                    System.out.print("Phone: ");
                    String dphone = sc.nextLine();

                    System.out.print("Fee: ");
                    double fee = sc.nextDouble();

                    System.out.print("Specialty ID: ");
                    int sid = sc.nextInt();

                    service.addDoctor(new Doctor(dname,dphone,fee,sid));
                    break;

                case 3:
                    System.out.print("Patient ID: ");
                    int pid = sc.nextInt();

                    System.out.print("Doctor ID: ");
                    int did = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Date (YYYY-MM-DD): ");
                    String date = sc.nextLine();

                    System.out.print("Time (HH:MM:SS): ");
                    String time = sc.nextLine();

                    service.bookAppointment(new Appointment(pid,did,date,time));
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}	
