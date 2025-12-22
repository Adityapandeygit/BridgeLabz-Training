package strings;

import java.util.Scanner;

public class CharacterTypeTable {
	public static String checkCharacter(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >='a' && ch <='z') {
            if (ch =='a' || ch =='e' || ch =='i'
                    || ch =='o' || ch =='u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static String[][] findVowelsAndConsonants(String str) {

        String[][] result = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacter(ch);
        }

        return result;
    }

    public static void displayTable(String[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "  " + arr[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        String[][] result = findVowelsAndConsonants(str);
        displayTable(result);
    }
}
