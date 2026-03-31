package dsa_practice.gcr_codebase.BufferedReaderFileReaderInputStreamReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
public class WriteUserInputToFile {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\a\\Desktop\\output.txt";
		try {
            // Read input from console
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            // Write to file
            FileWriter fileWriter = new FileWriter(filePath);
            String input;
            System.out.println("Enter text (type 'exit' to stop):");
            while (true) {
                input = bufferedReader.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                fileWriter.write(input + System.lineSeparator());
            }
            // Close resources
            fileWriter.close();
            bufferedReader.close();
            inputStreamReader.close();

            System.out.println("Input successfully written to file.");

        }
		 catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	}
}
