package collections_practice.gcr_codebase.java_generics.resumeScreeningSystem;

public class SoftwareEngineer extends JobRole{
	private int codingScore;
    public SoftwareEngineer(String name, int exp, int codingScore) {
        super(name, exp);
        this.codingScore = codingScore;
    }
    boolean isQualified() {
        return experience >= 2 && codingScore >= 70;
    }
}