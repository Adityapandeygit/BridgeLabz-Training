package dsa_practice.gcr_codebase.sorting;

import java.util.Scanner;

public class SortanArrayofBookPrices {
    public static void sortedPrice(int[] prices, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            sortedPrice(prices, left, mid);
            sortedPrice(prices, mid + 1, right);

            merge(prices, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books:");
        int n = sc.nextInt();
        int[] price = new int[n];
        System.out.println("Enter the price of each book:");
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        sortedPrice(price, 0, n - 1);
        System.out.println("Sorted book prices:");
        for (int p : price) {
            System.out.print(p + " ");
        }
    }
}
