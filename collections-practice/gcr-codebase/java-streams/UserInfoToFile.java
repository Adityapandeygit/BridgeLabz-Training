package collections_practice.gcr_codebase.java_streams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class UserInfoToFile {
	public static void main(String[] args) throws IOException {
		String source = "C:\\Users\\a\\Desktop\\Source.txt";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = null;
		try {
			System.out.print("Enter your name: ");
            String name = br.readLine();
            System.out.print("Enter your age: ");
            String age = br.readLine();
            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();
            
            fw = new FileWriter(source);
            fw.write("Name: " + name + " ");
            fw.write("Age: " + age + " ");
            fw.write("Favorite Programming Language: " + language + " ");
            System.out.println("User information saved successfully.");
		}
		catch (IOException e) {
	          System.out.println("I/O Error occurred: " + e.getMessage());
		}
		catch (NumberFormatException e) {
            System.out.println("Invalid age format!");
        }
		finally {
			fw.close();
		}
		
	}
}
