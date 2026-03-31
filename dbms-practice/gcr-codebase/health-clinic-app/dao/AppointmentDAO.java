package jdbc_dbms.healthclinic.dao;
import config.DBConnection;
import model.Appointment;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AppointmentDAO {
	public void bookAppointment(Appointment a) {
        try (Connection con = DBConnection.getConnection()) {

            String sql = "INSERT INTO appointments(patient_id,doctor_id,appointment_date,appointment_time,status) VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, a.getPatientId());
            ps.setInt(2, a.getDoctorId());
            ps.setString(3, a.getDate());
            ps.setString(4, a.getTime());
            ps.setString(5, "SCHEDULED");

            ps.executeUpdate();
            System.out.println("Appointment Booked");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
