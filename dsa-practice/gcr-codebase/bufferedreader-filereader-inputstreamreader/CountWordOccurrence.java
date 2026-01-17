package dsa_practice.gcr_codebase.BufferedReaderFileReaderInputStreamReader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class CountWordOccurrence {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\a\\Desktop\\text.txt";
		String targetWord = "Java";
		int count = 0;
		try {
			FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
            	String[] words = line.split(" ");
            	for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }
            bufferedReader.close();
            fileReader.close();
            System.out.println("Word \"" + targetWord + "\" occurs " + count + " times.");
		}
		catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
	}
}
