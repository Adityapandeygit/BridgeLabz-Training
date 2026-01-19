package dsa_practice.gcr_codebase.runtimeanalysisandbigonotation;

public class StringConcatenationComparison {
	public static void usingString(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + "a";
        }
    }
	public static void usingStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
    }
	public static void usingStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
    }
	
	public static void main(String[] args) {
        int n = 10_000; 
        long start, timeString, timeBuilder, timeBuffer;
        // String
        start = System.currentTimeMillis();
        usingString(n);
        timeString = System.currentTimeMillis() - start;
        // StringBuilder
        start = System.currentTimeMillis();
        usingStringBuilder(n);
        timeBuilder = System.currentTimeMillis() - start;
        // StringBuffer
        start = System.currentTimeMillis();
        usingStringBuffer(n);
        timeBuffer = System.currentTimeMillis() - start;
        // Results
        System.out.println("Operations Count: " + n);
        System.out.println("String Time        : " + timeString + " ms");
        System.out.println("StringBuilder Time: " + timeBuilder + " ms");
        System.out.println("StringBuffer Time : " + timeBuffer + " ms");
    }
}
