package collections_practice.gcr_codebase.java_streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\a\\Desktop\\Source.txt");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\a\\Desktop\\Destination.txt");
			int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File copied successfully.");
		}
		catch (FileNotFoundException e) {
            System.out.println("Source file does not exist!");
		} catch (IOException e) {
            System.out.println("Error while reading or writing file.");
        }
	}
}
