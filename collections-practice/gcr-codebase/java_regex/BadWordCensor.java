package collections_practice.gcr_codebase.java_regex;

public class BadWordCensor {
	public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";

        String regex = "\\b(damn|stupid)\\b";
        String result = input.replaceAll("(?i)" + regex, "****");

        System.out.println(result);
    }
}
