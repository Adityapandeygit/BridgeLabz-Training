package collections_practice.gcr_codebase.java_collections.set_Interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckifTwoSetsAreEqual {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
        if(set1.equals(set2)) {
        	System.out.println("True");
        }
        else {
        	System.out.println("False");
        }
	}
}
