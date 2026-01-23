package collections_practice.gcr_codebase.java_collections.insurancePolicyManagementSystem2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PolicyManager {
    Map<Integer, Policy> policyMap = new HashMap<>();
    Map<Integer, Policy> insertionOrderMap = new LinkedHashMap<>();
    TreeMap<String, List<Policy>> expiryDateMap = new TreeMap<>();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public void addPolicies(Policy p) {
        policyMap.put(p.getPolicyNumber(), p);
        insertionOrderMap.put(p.getPolicyNumber(), p);
        String expiryDate = p.getExpireDate();
        if (!expiryDateMap.containsKey(expiryDate)) {
            expiryDateMap.put(expiryDate, new ArrayList<>());
        }

        expiryDateMap.get(expiryDate).add(p);
    }

    public Policy getPolicyByNumber(int policyNumber) {
        return policyMap.get(policyNumber);
    }

    public List<Policy> getPoliciesByHolder(String name) {
        List<Policy> result = new ArrayList<>();

        for (Policy p : policyMap.values()) {
            if (p.getPolicyHolderName().equalsIgnoreCase(name)) {
                result.add(p);
            }
        }
        return result;
    }

    public List<Policy> getPoliciesExpiringInNext30Days() {
        List<Policy> result = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        for (List<Policy> list : expiryDateMap.values()) {
            for (Policy p : list) {
                LocalDate expiry = LocalDate.parse(p.getExpireDate(), formatter);

                if (!expiry.isBefore(today) && !expiry.isAfter(next30Days)) {
                    result.add(p);
                }
            }
        }
        return result;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        List<Integer> expiredPolicies = new ArrayList<>();

        // find expired policies
        for (Map.Entry<Integer, Policy> entry : policyMap.entrySet()) {
            Policy p = entry.getValue();
            LocalDate expiryDate = LocalDate.parse(p.getExpireDate(), formatter);

            if (expiryDate.isBefore(today)) {
                expiredPolicies.add(entry.getKey());
            }
        }

        // remove expired policies
        for (int policyNumber : expiredPolicies) {
            Policy p = policyMap.remove(policyNumber);
            insertionOrderMap.remove(policyNumber);

            List<Policy> list = expiryDateMap.get(p.getExpireDate());
            list.remove(p);

            if (list.isEmpty()) {
                expiryDateMap.remove(p.getExpireDate());
            }
        }
    }

    public void displayAllPolicies() {
        for (Policy p : insertionOrderMap.values()) {
            System.out.println(p);
        }
    }
}
