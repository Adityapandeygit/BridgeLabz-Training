package collections_practice.gcr_codebase.java_regex;

public class SpaceNormalizer {
	public static void main(String[] args) {
        String input = "This   is   an    example   with   multiple    spaces.";

        String result = input.replaceAll("\\s+", " ");
        System.out.println(result);
    }
}
