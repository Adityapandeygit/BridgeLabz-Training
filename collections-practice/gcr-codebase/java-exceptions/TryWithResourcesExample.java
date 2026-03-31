package collections_practice.gcr_codebase.java_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
	public static void main(String[] args) {
		String source = "C:\\Users\\a\\Desktop\\Source.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(source));
			String line = br.readLine();
			if(line!=null) {
				System.out.println(line);
			}
		}
		catch(IOException e ) {
			System.out.println("Error in readig the file "+ e.getMessage());
		}
	}
}
