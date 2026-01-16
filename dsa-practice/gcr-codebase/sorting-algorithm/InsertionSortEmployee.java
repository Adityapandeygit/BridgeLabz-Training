package dsa_practice.gcr_codebase.sorting;

public class InsertionSortEmployee {
	public static void insertionSort(int[] empIds) {
        int n = empIds.length;
        for (int i = 1; i < n; i++) {
            int key = empIds[i];  
            int j = i - 1;
            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }
            empIds[j + 1] = key;
        }
    }
	public static void main(String[] args) {
        int[] employeeIds = {105, 102, 110, 101, 108};

        insertionSort(employeeIds);

        System.out.println("Sorted Employee IDs:");
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
    }
}
