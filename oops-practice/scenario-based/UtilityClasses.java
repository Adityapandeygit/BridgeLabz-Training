package oops_practice.scanrio_based;

public class UtilityClasses {
	static int factorial(int n) {
		if(n<0) {
			throw new IllegalArgumentException("Factorial is not defined for negative numbers");
		}
		if(n==0 || n==1) {
			return 1;
		}
		return n*factorial(n-1);
		
	}
	static boolean isPrime(int n) {
		if(n<0) {
			throw new IllegalArgumentException("Factorial is not defined for negative numbers");
		}
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	static int gcd(int n1 , int n2) {
		if (n1<0) {
			n1 = Math.abs(n1);
		} 
        if (n2<0) {
        	n2 = Math.abs(n2);
        } 
        while (n2!=0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
	}
	public static int fibonacci(int n) {
		if (n < 0) {
	        throw new IllegalArgumentException("Fibonacci not defined for negative numbers");
	    }
        if (n==0 || n==1) {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
	
	public static void main(String[] args) {
//		System.out.println("Factorial of 5: " + factorial(5));
//        System.out.println("Factorial of 0: " + factorial(-1));
        
//        System.out.println("Is 7 prime " + isPrime(7));
//        System.out.println("Is 1 prime " + isPrime(1));
//        System.out.println("Is -5 prime " + isPrime(-5));
		
//		 System.out.println("GCD of 48 and 18: " + gcd(48, 18));
//	     System.out.println("GCD of -20 and 10: " + gcd(-20, 10));
		
		   System.out.println("Fibonacci of 6: " + fibonacci(6));
	       System.out.println("Fibonacci of 0: " + fibonacci(0));
	       System.out.println("Fibonacci of 0: " + fibonacci(-5));
	}
}
