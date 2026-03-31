package m1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Word {
    String s;

    public Word(String s) {
        this.s = s;
    }
    public String reverse() {
        String[] str = s.split(" ");
        int n = str.length;
        if (n % 2 == 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = n - 1; i >= 0; i--) {
                sb.append(str[i]+" ");
            }

            return sb.toString();
        } 
        else {
        	String s = "";
        	for(int i=0;i<n;i++) {
        		StringBuilder sb1 = new StringBuilder();
        		sb1.append(str[i]).reverse();
        		sb1.append(" ");
        		s+=sb1.toString();
        	}
        	return s;
        }
    }
}

public class WordWand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String regex = "[a-zA-Z ]+";
        if (!s.matches(regex)) {
            System.out.println("Invalid input");
        }  
        else {
        Word w = new Word(s);
        System.out.println(w.reverse());
        }
    }
}