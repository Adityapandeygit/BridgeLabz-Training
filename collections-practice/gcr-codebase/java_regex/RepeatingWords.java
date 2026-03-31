package collections_practice.gcr_codebase.java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWords {
	public static void main(String[] args) {

        String text = "This is is a repeated repeated word test.";

        Pattern pattern = Pattern.compile("\\b(\\w+)\\s+\\1\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.print(matcher.group(1) + ", ");
        }
    }
}
