package strings;

import java.util.Scanner;

public class FrequencyOfCharacters {
	public static String[] findFrequency(String str) {
		char[] chars = str.toCharArray();
        int len = chars.length;
        int[] freq = new int[len];
        for (int i = 0; i < len; i++) {
              freq[i] = 1;
        }
        for (int i = 0; i < len; i++) {

            // Skip already counted characters
            if (chars[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        // Count number of unique characters
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        // Create 1D String array for result
        String[] res = new String[count];
        int index = 0;

        // Store character and its frequency
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                res[index] = chars[i] + " : " + freq[i];
                index++;
            }
        }

        return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		String[] output = findFrequency(str);

	}
}
