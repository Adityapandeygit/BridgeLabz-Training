package collections_practice.gcr_codebase.java_streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLargeFile {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\a\\Desktop\\Source.txt"; 
        String keyword = "error";
        try {
        	BufferedReader br = new BufferedReader(new FileReader(filePath));
        	String line;
        	while ((line = br.readLine()) != null) {
        		if (line.contains(keyword)) {
                    System.out.println(line);
                }
        	}
        }
        catch (IOException e) {
            e.printStackTrace();
        }
	}
}
