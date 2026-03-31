package strings;

import java.util.Scanner;

public class VowelAndConsonant {
	public static boolean isVowel(char ch) {
		if(ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
		
		if (ch>='a' && ch<='z') {

            if (ch =='a' || ch =='e' || ch =='i'
                    || ch =='o' || ch =='u') {
                return true;
            } else {
                return false;
            }
		}
		return false;
	}

	
	public static int[] findVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (isVowel(ch)) {
                vowelCount++;
            } 
            else{
                consonantCount++;
            }
        }
        return new int[]{vowelCount, consonantCount};
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        int[] result = findVowelsAndConsonants(input);
        System.out.println("Vowels count : " + result[0]);
        System.out.println("Consonants count : " + result[1]);
	}
	
}
