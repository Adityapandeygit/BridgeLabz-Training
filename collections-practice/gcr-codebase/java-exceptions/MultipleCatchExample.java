package collections_practice.gcr_codebase.java_exception;

public class MultipleCatchExample {
	public static void main(String[] args) {
		int[] arr = {1,2,4,5,6,7};
		int[] arr1 = null;
		int idx = 3;
		int idx1 = 6;
		try {
		    System.out.println(arr[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("Array Index Out of Bound");
		}

		try {
		    System.out.println(arr1.length);
		} catch (NullPointerException e) {
		    System.out.println("Array is null");
		}
	}
}
