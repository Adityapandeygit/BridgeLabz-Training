package core_java_practice.scanrio_based;

import java.util.Scanner;

public class LexicalTwist {

    public static boolean reverseWord(String w1, String w2) {
        StringBuilder sb = new StringBuilder(w1);
        return w2.equals(sb.reverse().toString());
    }

    public static String replaceAllVowel(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sb.append('@');
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static int countConsonants(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                count++;
            }
        }
        return count;
    }

    public static String printFirstTwoVowels(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length() && count < 2; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (ans.indexOf(String.valueOf(ch)) == -1) {
                    ans.append(ch);
                    count++;
                }
            }
        }
        return ans.toString();
    }

    public static String printFirstTwoConsonants(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length() && count < 2; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z' &&
                ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                if (ans.indexOf(String.valueOf(ch)) == -1) {
                    ans.append(ch);
                    count++;
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        boolean isReverse = reverseWord(word1, word2);

        if (isReverse) {
            String transformed = new StringBuilder(word1).reverse().toString().toLowerCase();

            System.out.println("Transformed Word : " + replaceAllVowel(transformed));
        } else {
            String combinedWord = (word1 + word2).toLowerCase();

            int vowels = countVowels(combinedWord);
            int consonants = countConsonants(combinedWord);

            if (vowels > consonants) {
                System.out.println(printFirstTwoVowels(combinedWord));
            } else if (consonants > vowels) {
                System.out.println(printFirstTwoConsonants(combinedWord));
            } else {
                System.out.println("Vowel and Consonant are equal");
            }
        }

    }
}
