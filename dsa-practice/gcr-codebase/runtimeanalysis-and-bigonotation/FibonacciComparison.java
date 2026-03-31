package dsa_practice.gcr_codebase.runtimeanalysisandbigonotation;

public class FibonacciComparison {
	public static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    public static int fibonacciIterative(int n) {
        if (n <= 1)
            return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 30; 
        long start, recursiveTime, iterativeTime;
        // Recursive approach
        start = System.currentTimeMillis();
        fibonacciRecursive(n);
        recursiveTime = System.currentTimeMillis() - start;

        // Iterative approach
        start = System.currentTimeMillis();
        fibonacciIterative(n);
        iterativeTime = System.currentTimeMillis() - start;
        System.out.println("Fibonacci Number: " + n);
        System.out.println("Recursive Time : " + recursiveTime + " ms");
        System.out.println("Iterative Time : " + iterativeTime + " ms");
    }
}








