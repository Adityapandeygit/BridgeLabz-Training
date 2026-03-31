package collections_practice.gcr_codebase.java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {
	public static void main(String[] args) {

        String validText = "My SSN is 123-45-6789.";
        String invalidText = "My SSN is 123456789.";

        validateSSN(validText);
        validateSSN(invalidText);
    }

    static void validateSSN(String text) {

        Pattern pattern = Pattern.compile("\\b\\d{3}-\\d{2}-\\d{4}\\b");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println(matcher.group() + "\" is valid");
        } else {
            System.out.println("SSN is invalid");
        }
    }
}
