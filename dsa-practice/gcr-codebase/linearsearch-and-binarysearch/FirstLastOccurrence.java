package dsa_practice.gcr_codebase.linearandbinarysearch;

public class FirstLastOccurrence {
	public static int findFirst(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int res = 0;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target) {
				res = arr[mid];
				right = mid - 1;
			}
			else if (target < arr[mid]) {
				right = mid - 1;
			}
			else {
				left = mid+1;
			}
		}
		return res;
	}
	public static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;      // store index
                left = mid + 1;    // move right
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
	public static void main(String[] args) {
		int[] arr = {2, 4, 4, 4, 6, 8, 10};
        int target = 4;
        int first = findFirst(arr, target);
        int last = findLast(arr, target);
        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
	}
}
