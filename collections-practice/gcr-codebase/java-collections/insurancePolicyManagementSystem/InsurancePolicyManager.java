package collections_practice.gcr_codebase.java_collections.insurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class InsurancePolicyManager {
	private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();
    
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }
    
    public void displayAllPolicies() {
    	for(Policy p : hashSet) {
    		System.out.println(p.policyDetails());
    	}
    }
    
    public void policiesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        for (Policy p : hashSet) {
            if (!p.getExpiryDate().isAfter(limit)) {
                System.out.println(p);
            }
        }
    }
    
    public void policiesByCoverage(String type) {
        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }
    
    public void findDuplicatePolicies(List<Policy> policies) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Policy p : policies) {
            if (!seen.add(p.getPolicyNumber())) {
                duplicates.add(p.getPolicyNumber());
            }
        }

        System.out.println("Duplicate Policy Numbers: " + duplicates);
    }
}
