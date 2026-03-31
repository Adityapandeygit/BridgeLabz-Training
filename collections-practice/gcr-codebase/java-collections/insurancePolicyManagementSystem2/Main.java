package collections_practice.gcr_codebase.java_collections.insurancePolicyManagementSystem2;

public class Main {
    public static void main(String[] args) {

        PolicyManager pm = new PolicyManager();

        pm.addPolicies(new Policy(101, "Aditya", "12-09-2026"));
        pm.addPolicies(new Policy(102, "Pandey", "13-02-2026"));
        pm.addPolicies(new Policy(103, "Akash", "10-01-2025")); 

        System.out.println("Get Policy 101:");
        System.out.println(pm.getPolicyByNumber(101));

        System.out.println("Policies for Aditya:");
        pm.getPoliciesByHolder("Aditya").forEach(System.out::println);

        System.out.println("Policies expiring in next 30 days:");
        pm.getPoliciesExpiringInNext30Days().forEach(System.out::println);

        System.out.println("Removing expired policies.");
        pm.removeExpiredPolicies();

        System.out.println("All Policies (Insertion Order):");
        pm.displayAllPolicies();
    }
}
