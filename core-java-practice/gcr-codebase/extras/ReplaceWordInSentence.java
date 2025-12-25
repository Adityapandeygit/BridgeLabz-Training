package extras;

import java.util.Scanner;

public class ReplaceWordInSentence {
	public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                result.append(newWord);
            } else {
                result.append(words[i] + " ");
            }
        }
        return result.toString();
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String sentence = sc.nextLine();
        
        System.out.println("Enter word to replace:");
        String oldWord = sc.next();
        
        System.out.println("Enter new word:");
        String newWord = sc.next();

        System.out.println("Modified sentence:");
        System.out.println(replaceWord(sentence, oldWord, newWord));
    }
}
