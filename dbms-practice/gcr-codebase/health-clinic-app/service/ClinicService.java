package jdbc_dbms.healthclinic.service;

import jdbc_dbms.healthclinic.dao.AppointmentDAO;
import jdbc_dbms.healthclinic.dao.DoctorDAO;
import jdbc_dbms.healthclinic.dao.PatientDAO;
import jdbc_dbms.healthclinic.model.Appointment;
import jdbc_dbms.healthclinic.model.Doctor;
import jdbc_dbms.healthclinic.model.Patient;

public class ClinicService {
	PatientDAO patientDAO = new PatientDAO();
    DoctorDAO doctorDAO = new DoctorDAO();
    AppointmentDAO appointmentDAO = new AppointmentDAO();

    public void registerPatient(Patient p) {
        patientDAO.addPatient(p);
    }

    public void addDoctor(Doctor d) {
        doctorDAO.addDoctor(d);
    }

    public void bookAppointment(Appointment a) {
        appointmentDAO.bookAppointment(a);
    }
}
