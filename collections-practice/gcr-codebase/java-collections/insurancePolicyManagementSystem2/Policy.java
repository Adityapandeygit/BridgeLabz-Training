package collections_practice.gcr_codebase.java_collections.insurancePolicyManagementSystem2;

public class Policy {
    private int policyNumber;
    private String policyHolderName;
    private String expireDate; 

    public Policy(int policyNumber, String policyHolderName, String expireDate) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expireDate = expireDate;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }
    
    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public String getExpireDate() {
        return expireDate;
    }

    @Override
    public String toString() {
        return "PolicyNumber: " + policyNumber +", Name: " + policyHolderName +", Expire Date: " + expireDate;
    }
}
