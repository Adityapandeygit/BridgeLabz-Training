package Level_2_Practice_Programs;

import java.util.Scanner;

public class Basic_Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float m = sc.nextFloat();
		float n = sc.nextFloat();
		float a = m+n;
		float b = m-n;
		float c = m*n;
		float d = m/n;
		System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers"+m+" and "+n+" is "+a+" , "+b+" , "+c+" , "+d);
		
	}
}
