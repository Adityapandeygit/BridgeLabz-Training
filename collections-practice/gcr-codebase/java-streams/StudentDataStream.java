package collections_practice.gcr_codebase.java_streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudentDataStream {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\a\\Desktop\\Source.txt";
		
		// Writing student data
		try {
			DataOutputStream dos =new DataOutputStream(new FileOutputStream(filePath));
	        int rollNo = 101;
	        String name = "Aditya";
	        double gpa = 8.6;

	        dos.writeInt(rollNo);
	        dos.writeUTF(name);
	        dos.writeDouble(gpa);

	        System.out.println("Student data written successfully.");

		}
		catch (IOException e) {
            System.out.println("Error while writing data:");
            e.printStackTrace();
        }
		
		// Reading student data
		try {
			DataInputStream  dis =new DataInputStream (new FileInputStream(filePath));
	        int rollNo = 101;
	        String name = "Aditya";
	        double gpa = 8.6;

	        int rollNo1 = dis.readInt();
            String name1 = dis.readUTF();
            double gpa1 = dis.readDouble();
	        System.out.println("Student data written successfully.");

		}
		catch (IOException e) {
            System.out.println("Error while writing data:");
            e.printStackTrace();
        }
		
		
	}
}
