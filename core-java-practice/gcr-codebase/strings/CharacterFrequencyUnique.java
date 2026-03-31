package strings;

import java.util.Scanner;

public class CharacterFrequencyUnique {

    // Method to find unique characters using nested loops
    public static char[] uniqueCharacters(String str) {

        char[] temp = new char[str.length()];
        int uniqueCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (ch == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }
        // Create exact size array
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }
    // Method to find frequency using ASCII and unique characters
    public static String[][] findFrequency(String str) {

        int[] freq = new int[256];

        // Count frequency using ASCII
        for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(str);

        // Create 2D result array
        String[][] result = new String[uniqueChars.length][2];

        // Store character and frequency
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

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
