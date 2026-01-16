package dsa_practice.gcr_codebase.sorting;

public class HeapSortSalaries {
	public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Heapify reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Heapify subtree rooted at index i
    public static void heapify(int[] salaries, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = swap;
            heapify(salaries, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] expectedSalaries = {45000, 60000, 35000, 80000, 50000};
        heapSort(expectedSalaries);
        System.out.println("Sorted Salary Demands:");
        for (int salary : expectedSalaries) {
            System.out.print(salary + " ");
        }
    }
}
