package strings;

import java.util.Scanner;

public class WordsAndLengths {
    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // stop loop
        }
        return count;
    }

    // Method to split text into words using custom Split
    public static String[] customSplit(String str) {

        int len = findLength(str);

        // Count words
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndex = new int[wordCount - 1];
        int idx = 0;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i)==' ') {
                spaceIndex[idx++] = i;
            }
        }

        // Extract words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = str.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }

        words[wordCount - 1] = str.substring(start);
        return words;
    }

    // Method to create 2D array of words and their lengths
    public static String[][] wordLengthTable(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len); // convert int → String
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();

        String[] words = customSplit(str);
        String[][] table = wordLengthTable(words);

        for (int i = 0; i < table.length; i++) {
            int length = Integer.parseInt(table[i][1]); // String → int
            System.out.println(table[i][0] + "  " + length);
        }
    }
}
