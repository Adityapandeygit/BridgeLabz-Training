package dsa_practice.gcr_codebase.runtimeanalysisandbigonotation;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargeFileReadComparison {
	static void readUsingFileReader(String filePath) throws IOException {
        FileReader reader = new FileReader(filePath);
        int ch;
        while ((ch = reader.read()) != -1) {
            // reading character by character
        }
        reader.close();
    }

    public static void readUsingInputStreamReader(String filePath) throws IOException {
        InputStreamReader reader =
                new InputStreamReader(new FileInputStream(filePath), "UTF-8");
        int ch;
        while ((ch = reader.read()) != -1) {
            // reading byte stream converted to characters
        }
        reader.close();
    }
	public static void main(String[] args) {
        String filePath = "largefile.txt"; // path to large file

        try {
            long start, timeFileReader, timeInputStreamReader;

            // FileReader timing
            start = System.currentTimeMillis();
            readUsingFileReader(filePath);
            timeFileReader = System.currentTimeMillis() - start;

            // InputStreamReader timing
            start = System.currentTimeMillis();
            readUsingInputStreamReader(filePath);
            timeInputStreamReader = System.currentTimeMillis() - start;

            // Results
            System.out.println("File Size: Large File");
            System.out.println("FileReader Time       : " + timeFileReader + " ms");
            System.out.println("InputStreamReader Time: " + timeInputStreamReader + " ms");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

	
}
