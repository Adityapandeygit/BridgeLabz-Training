package classandobject;

public class PalindromeChecker {
	String text;
    boolean isPalindrome() {
        String cleantext = text.replace(" ","").toLowerCase();
        int start = 0;
        int end = cleantext.length()-1;
        while (start<=end) {
            if (cleantext.charAt(start) != cleantext.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not Palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker();
        p1.text = "A man a plan a canal Panama";
        PalindromeChecker p2 = new PalindromeChecker();
        p2.text = "Hello";
        p1.displayResult();
        p2.displayResult();
    }
}
