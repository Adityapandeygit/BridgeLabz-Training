package dsa_practice.gcr_codebase.BufferedReaderFileReaderInputStreamReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
public class ReadFileUsingInputStreamReader {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\a\\Desktop\\text.txt";
		try {
			// Byte stream
            FileInputStream fileInputStream = new FileInputStream(filePath);

            // Convert byte stream to character stream using UTF-8
            InputStreamReader inputStreamReader =
                    new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);

            // Buffered reader for efficient reading
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;

            // Read file line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close resources
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();

		}
		catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	    }
	}
}
