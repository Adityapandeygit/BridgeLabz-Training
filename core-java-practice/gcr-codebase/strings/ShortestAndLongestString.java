package strings;

import java.util.Scanner;

public class ShortestAndLongestString {
	// Method to find string length without using length()
    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // stop loop
        }
        return count;
    }

    // Method to split text into words without using split()
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
            if (str.charAt(i) == ' ') {
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
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    // Find shortest & longest word indexes
    public static int[] findShortestAndLongest(String[][] table) {

        int shortestIndex = 0;
        int longestIndex = 0;

        int minLen = Integer.parseInt(table[0][1]);
        int maxLen = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {
            int currLen = Integer.parseInt(table[i][1]);
            if (currLen < minLen){
                minLen = currLen;
                shortestIndex = i;
            }
            if (currLen > maxLen){
                maxLen = currLen;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();

        String[] words = customSplit(str);
        String[][] table = wordLengthTable(words);

        for (int i = 0; i < table.length; i++) {
            int length = Integer.parseInt(table[i][1]);
            System.out.println(table[i][0] + " " + length);
        }

        int[] result = findShortestAndLongest(table);
        System.out.println("\nShortest Word : " + table[result[0]][0]);
        System.out.println("Longest Word  : " + table[result[1]][0]);
    }
}
