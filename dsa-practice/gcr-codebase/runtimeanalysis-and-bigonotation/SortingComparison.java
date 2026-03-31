package dsa_practice.gcr_codebase.runtimeanalysisandbigonotation;

import java.util.Arrays;
import java.util.Random;

public class SortingComparison {
	public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
	
	public static void mergeSort(int[] a) {
        if (a.length <= 1) return;
        int mid = a.length / 2;
        int[] left  = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);
        mergeSort(left);
        mergeSort(right);
        merge(a, left, right);
    }
	public static void merge(int[] a, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j])
                a[k++] = left[i++];
            else
                a[k++] = right[j++];
        }

        while (i < left.length)
            a[k++] = left[i++];

        while (j < right.length)
            a[k++] = right[j++];
    }
	
	public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    
    public static void main(String[] args) {
        int size = 10000; 
        int[] original = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            original[i] = rand.nextInt(size);
        }

        // Clone arrays for fair comparison
        int[] bubbleArr = original.clone();
        int[] mergeArr = original.clone();
        int[] quickArr = original.clone();

        // Bubble Sort Timing
        long start = System.currentTimeMillis();
        bubbleSort(bubbleArr);
        long bubbleTime = System.currentTimeMillis() - start;

        // Merge Sort Timing
        start = System.currentTimeMillis();
        mergeSort(mergeArr);
        long mergeTime = System.currentTimeMillis() - start;

        // Quick Sort Timing
        start = System.currentTimeMillis();
        quickSort(quickArr, 0, quickArr.length - 1);
        long quickTime = System.currentTimeMillis() - start;

        System.out.println("Dataset Size: " + size);
        System.out.println("Bubble Sort Time: " + bubbleTime + " ms");
        System.out.println("Merge Sort Time : " + mergeTime + " ms");
        System.out.println("Quick Sort Time : " + quickTime + " ms");
    }
}
