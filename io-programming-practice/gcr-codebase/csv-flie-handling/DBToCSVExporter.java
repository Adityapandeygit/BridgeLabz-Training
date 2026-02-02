package io_programing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBToCSVExporter {
	public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String password = "root";
        String outputFile = "employees_report.csv";
        String query = "SELECT emp_id, name, department, salary FROM employee";
        try (
                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            bw.write("Employee ID,Name,Department,Salary");
            bw.newLine();
            while (rs.next()) {

                String row = rs.getInt("emp_id") + "," +
                        rs.getString("name") + "," +
                        rs.getString("department") + "," +
                        rs.getDouble("salary");

                bw.write(row);
                bw.newLine();
            }

            System.out.println("CSV Report Generated Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
