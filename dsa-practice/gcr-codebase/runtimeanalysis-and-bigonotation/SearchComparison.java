package dsa_practice.gcr_codebase.runtimeanalysisandbigonotation;

import java.util.Arrays;

public class SearchComparison {
	public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
	public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
	public static void main(String[] args) {
		int size = 1_000_000;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
        int target = size;
        // Linear Search
        long start = System.nanoTime();
        linearSearch(arr, target);
        long linearTime = System.nanoTime() - start;

        // Binary Search
        Arrays.sort(arr); 
        start = System.nanoTime();
        binarySearch(arr, target);
        long binaryTime = System.nanoTime() - start;

        System.out.println("Linear Search Time: " + linearTime + " ns");
        System.out.println("Binary Search Time: " + binaryTime + " ns");
	}
}
