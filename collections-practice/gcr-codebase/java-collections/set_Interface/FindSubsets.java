package collections_practice.gcr_codebase.java_collections.set_Interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSubsets {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        boolean isSubset = set2.containsAll(set1);

        System.out.println(isSubset);
	}
}
