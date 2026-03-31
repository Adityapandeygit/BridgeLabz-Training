package strings;

import java.util.Scanner;

public class UniqueCharacters {

    public static int lenght(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int len = lenght(str);
        char[] chr = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char curr = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < index; j++) {
                if (chr[j] == curr) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                chr[index] = curr;
                index++;
            }
        }

        System.out.print("Unique characters: ");
        for (int i=0;i<index;i++) {
            System.out.print(chr[i] + " ");
        }
    }
}
