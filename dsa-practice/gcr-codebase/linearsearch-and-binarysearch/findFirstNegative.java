package dsa_practice.gcr_codebase.linearandbinarysearch;

public class findFirstNegative {
	public static int firstNegativeNumber(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {5, 10, 3, -4, 9, -2};
		int res = firstNegativeNumber(arr);
		if(res==-1) {
			System.out.println("No neagative number present");
		}
		else {
			System.out.println("The index of first negative number is : "+res);
		}
	}
}
