package collections_practice.gcr_codebase.java_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("data.text"));
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		}
		catch(IOException e){
			System.out.println("File not found ");
			System.out.println(e.getMessage());
		}
	}
}
