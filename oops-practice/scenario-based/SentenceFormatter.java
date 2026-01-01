package oops_practice.scanrio_based;
public class SentenceFormatter {

    public static String formatParagraph(String paragraph) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return "";
        }
        // 1. Trim leading/trailing spaces and reduce multiple spaces to one
        paragraph = paragraph.trim().replaceAll("\\s+", " ");

        // 2. Ensure exactly one space after punctuation (. ? !)
        paragraph = paragraph.replaceAll("\\s*([.!?])\\s*", "$1 ");

        // 3. Capitalize the first letter of each sentence
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;
        for (char ch : paragraph.toCharArray()) {
            if (capitalizeNext && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
            }

            if (ch=='.'||ch=='?'||ch=='!') {
                capitalizeNext = true;
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "   hello   world.this is a test!how are you?  i am fine.   ";
        System.out.println(formatParagraph(input));
    }
}
