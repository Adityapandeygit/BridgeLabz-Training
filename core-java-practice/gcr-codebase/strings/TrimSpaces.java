package strings;

import java.util.Scanner;

public class TrimSpaces {
	public static int[] trimIndexes(String str) {

        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String customSubstring(String str, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + str.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int[] index = trimIndexes(str);
        String userTrim = customSubstring(str, index[0], index[1]);
        String builtInTrim = str.trim();
        System.out.println("User-defined trimmed string :" + userTrim );
        System.out.println("Built-in trimmed string :" + builtInTrim);
        System.out.println("Are both equal? " + compareStrings(userTrim, builtInTrim));
    }
}
