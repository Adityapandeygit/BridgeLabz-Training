package collections_practice.gcr_codebase.java_regex;

public class ReplaceMultipleSpaces {
	public static void main(String[] args) {

        String text = "This   is   an   example   with   multiple   spaces.";

        String result = text.replaceAll("\\s+", " ");

        System.out.println(result);
    }
}
