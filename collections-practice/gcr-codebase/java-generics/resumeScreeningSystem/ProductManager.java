package collections_practice.gcr_codebase.java_generics.resumeScreeningSystem;

public class ProductManager extends JobRole{
	private int communicationScore;
    public ProductManager(String name, int exp, int communicationScore) {
        super(name, exp);
        this.communicationScore = communicationScore;
    }
    boolean isQualified() {
        return experience >= 3 && communicationScore >= 80;
    }
}
