package strings;
import java.util.Scanner;

public class CharacterFrequency2D {

    // Method to find frequency of characters and return 2D array
    public static String[][] findFrequency(String str) {

        int[] freq = new int[256];
        for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        //Count unique characters
        int count = 0;
        for (int i=0;i<256;i++) {
            if (freq[i] > 0) {
                count++;
            }
        }

        //Create 2D String array
        String[][] result = new String[count][2];

        // Step 5: Store character and frequency
        int index = 0;
        for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);

            if (freq[ch]>0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0; // Avoid duplicate entries
                index++;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[][] frequencyArray = findFrequency(str);

        for (int i = 0; i < frequencyArray.length; i++) {
            System.out.println(frequencyArray[i][0] + "\t\t" + frequencyArray[i][1]);
        }
    }
}
