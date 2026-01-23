package collections_practice.gcr_codebase.java_collections.set_Interface;

import java.util.HashSet;
import java.util.Set;

public class UnionandIntersectionofTwoSets {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(3);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		Set<Integer> union = new HashSet<>();
		union.addAll(set1);
		union.addAll(set2);
		System.out.println(union);
		
		
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);
	}
}
