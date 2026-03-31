package dsa_practice.gcr_codebase.BufferedReaderFileReaderInputStreamReader;
import java.io.*;

public class FileReadComparison {
	public static void main(String[] args) throws IOException {
		String filePath = "largefile.txt"; // 100MB file
        // FileReader
        long startFR = System.currentTimeMillis();
        int wordCountFR = countWordsUsingFileReader(filePath);
        long endFR = System.currentTimeMillis();

        System.out.println("FileReader Word Count: " + wordCountFR);
        System.out.println("FileReader Time: " + (endFR - startFR) + " ms");

        // InputStreamReader
        long startISR = System.currentTimeMillis();
        int wordCountISR = countWordsUsingInputStreamReader(filePath);
        long endISR = System.currentTimeMillis();

        System.out.println("InputStreamReader Word Count: " + wordCountISR);
        System.out.println("InputStreamReader Time: " + (endISR - startISR) + " ms");
    }

    // FileReader
    public static int countWordsUsingFileReader(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        int count = 0;
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.trim().split(" ");
            if (!line.isEmpty()) {
                count += words.length;
            }
        }
        br.close();
        return count;
    }

    // InputStreamReader
    public static int countWordsUsingInputStreamReader(String path) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(path))
        );

        int count = 0;
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.trim().split("\\s+");
            if (!line.isEmpty()) {
                count += words.length;
            }
        }
        br.close();
        return count;

	}
}
