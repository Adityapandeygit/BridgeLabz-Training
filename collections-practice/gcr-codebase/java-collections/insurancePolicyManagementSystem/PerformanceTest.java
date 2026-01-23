package collections_practice.gcr_codebase.java_collections.insurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PerformanceTest {
	public static void main(String[] args) {
        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedHashSet = new LinkedHashSet<>();
        Set<Policy> treeSet = new TreeSet<>();

        Policy p = new Policy(101, "Aditya",LocalDate.now().plusDays(40),"Health", 5000);

        long start, end;

        // HashSet
        start = System.nanoTime();
        hashSet.add(p);
        hashSet.contains(p);
        hashSet.remove(p);
        end = System.nanoTime();
        System.out.println("HashSet Time: " + (end - start));

        // LinkedHashSet
        start = System.nanoTime();
        linkedHashSet.add(p);
        linkedHashSet.contains(p);
        linkedHashSet.remove(p);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Time: " + (end - start));

        // TreeSet
        start = System.nanoTime();
        treeSet.add(p);
        treeSet.contains(p);
        treeSet.remove(p);
        end = System.nanoTime();
        System.out.println("TreeSet Time: " + (end - start));
    }
}
