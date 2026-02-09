package jdbc_dbms.healthclinic.dao;

import config.DBConnection;
import model.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class PatientDAO {
	public void addPatient(Patient p) {
        try (Connection con = DBConnection.getConnection()) {

            String sql = "INSERT INTO patients(name,dob,phone,address,blood_group) VALUES(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, p.getName());
            ps.setString(2, p.getDob());
            ps.setString(3, p.getPhone());
            ps.setString(4, p.getAddress());
            ps.setString(5, p.getBloodGroup());

            ps.executeUpdate();
            System.out.println("Patient Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
