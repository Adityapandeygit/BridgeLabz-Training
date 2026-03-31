package collections_practice.gcr_codebase.java_generics.resumeScreeningSystem;

public abstract class JobRole {
	 String candidateName;
     int experience; 

    public JobRole(String candidateName, int experience) {
        this.candidateName = candidateName;
        this.experience = experience;
    }
    abstract boolean isQualified();
	
}
