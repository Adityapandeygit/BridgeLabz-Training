package collections_practice.gcr_codebase.java_collections.insurancePolicyManagementSystem;

import java.time.LocalDate;

public class Policy {
	int policyNumber;
	String pilocyHolderName;
	LocalDate expiryDate;
    String coverageType;
    double premiumAmount;
    public Policy(int policyNumber, String policyHolderName,LocalDate expiryDate, String coverageType,double premiumAmount) {
    		this.policyNumber = policyNumber;
    		this.pilocyHolderName = policyHolderName;
    		this.expiryDate = expiryDate;
    		this.coverageType = coverageType;
    		this.premiumAmount = premiumAmount;
    }
    
    public String policyDetails() {
    	return "Policy{" +
                "policyNumber=" + policyNumber +
                ", name='" + pilocyHolderName + '\'' +
                ", expiryDate=" + expiryDate +
                ", coverageType='" + coverageType + '\'' +
                ", premium=" + premiumAmount +
                '}';
    }

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public String getCoverageType() {
		return coverageType;
	}

	public int getPolicyNumber() {
		return policyNumber;
	}
    
}
