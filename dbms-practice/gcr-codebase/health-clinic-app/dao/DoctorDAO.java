package jdbc_dbms.healthclinic.dao;

import config.DBConnection;
import model.Doctor;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DoctorDAO {
	public void addDoctor(Doctor d) {
        try (Connection con = DBConnection.getConnection()) {

            String sql = "INSERT INTO doctors(name,phone,consultation_fee,specialty_id) VALUES(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, d.getName());
            ps.setString(2, d.getPhone());
            ps.setDouble(3, d.getFee());
            ps.setInt(4, d.getSpecialtyId());

            ps.executeUpdate();
            System.out.println("Doctor Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
