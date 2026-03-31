package extras;

import java.util.Scanner;

public class MostFrequentCharacter {
	public static char mostFrequentChar(String s) {
        int[] freq = new int[256]; 
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        int maxFreq = 0;
        char result =' ';
        for (int i =0;i< s.length();i++) {
            if (freq[s.charAt(i)]>maxFreq) {
                maxFreq = freq[s.charAt(i)];
                result = s.charAt(i);
            }
        }
        return result;
    }
	 public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter string:");
	       String s = sc.nextLine();
	       System.out.println("Most Frequent Character: '" + mostFrequentChar(s) + "'");
	 }
}
