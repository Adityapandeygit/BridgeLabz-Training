package dsa_practice.gcr_codebase.runtimeanalysisandbigonotation;

import java.util.HashSet;
import java.util.TreeSet;

public class SearchDataStructureComparison {
	public static void main(String[] args) {
        int size = 1000000; 
        int target = size - 1;

        int[] array = new int[size];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < size; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        long start, arrayTime, hashSetTime, treeSetTime;

        // Array search
        start = System.currentTimeMillis();
        searchArray(array, target);
        arrayTime = System.currentTimeMillis() - start;

        // HashSet search
        start = System.currentTimeMillis();
        hashSet.contains(target);
        hashSetTime = System.currentTimeMillis() - start;

        // TreeSet search
        start = System.currentTimeMillis();
        treeSet.contains(target);
        treeSetTime = System.currentTimeMillis() - start;

        // Results
        System.out.println("Dataset Size: " + size);
        System.out.println("Array Search Time   : " + arrayTime + " ms");
        System.out.println("HashSet Search Time : " + hashSetTime + " ms");
        System.out.println("TreeSet Search Time : " + treeSetTime + " ms");
    }
	public static boolean searchArray(int[] arr, int target) {
        for (int num : arr) {
            if (num == target)
                return true;
        }
        return false;
    }
}
