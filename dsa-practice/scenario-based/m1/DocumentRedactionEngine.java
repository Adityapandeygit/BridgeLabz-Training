package m1;

import java.util.Scanner;

public class DocumentRedactionEngine {
	public static String processLine(String line) {
		line = line.replaceAll("[A-Z]{3}[0-9]{6}", "ID:XXX******");
		line = line.replaceAll("ACCT-[0-9]{4}-[0-9]{4}-([0-9]{4})", "ACCT---$1");
		line = line.replaceAll("(?i)\\b(\\w+)\\s+\\1\\b", "$1");
		line = line.replaceAll("([!?.]){3,}$", "$1");
		return line;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			String line = sc.nextLine();
			System.out.println(processLine(line));;
		}
			
	}
}
