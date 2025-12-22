package strings;
import java.util.Scanner;

public class SplitTextWithoutSplit {

    // Method to find length of string without using length()
    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            
        }
        return count;
    }

    public static String[] customSplit(String text) {
        int len = findLength(text);

        // Count words
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        //  Store space indexes
        int[] spaceIndex = new int[wordCount - 1];
        int idx = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }

        // Extract words using indexes
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = text.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }

        // last word
        words[wordCount - 1] = text.substring(start);

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i]!=(b[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String text = sc.nextLine();

        String[] userSplit = customSplit(text);
        String[] builtInSplit = text.split(" ");

        System.out.println("User-defined split result:");
        for (String word : userSplit) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in split result:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nAre both results equal? "+ compareArrays(userSplit, builtInSplit));
    }
}
