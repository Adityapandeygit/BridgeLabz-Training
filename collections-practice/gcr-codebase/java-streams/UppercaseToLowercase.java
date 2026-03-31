package collections_practice.gcr_codebase.java_streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class UppercaseToLowercase {
	public static void main(String[] args) {
		String sourceFile = "C:\\Users\\a\\Desktop\\Source.txt";
	    String destinationFile = "C:\\Users\\a\\Desktop\\Destination.txt";
	    try {
	    	BufferedReader br = new BufferedReader(new FileReader(sourceFile));
	        BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile));
	    	String line;
	        while ((line = br.readLine()) != null) {
	            bw.write(line.toLowerCase());
	            bw.newLine();
	        }
	        System.out.println("File converted to lowercase successfully.");
	    }
	    catch (IOException e) {
	        System.out.println("Error while processing file:");
	        e.printStackTrace();
	    }
	}
    
}
