package strings;

import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {
	public static int[] generateAges(int n) {
        int[] ages = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + rand.nextInt(100) ; // generates age between 10 and 100
        }
        return ages;
        
    }
	
	public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i]<0) {
                result[i][1] = "false";  
            } else if (ages[i]>=18) {
                result[i][1]="true";   
            } else {
                result[i][1] = "false"; 
            }
        }
        return result;
    }
	
	public static void displayTable(String[][] table) {

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "  " + table[i][1]);
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        int[] ages = generateAges(n);
        String[][] result = checkVotingEligibility(ages);
        displayTable(result);

	}

}
