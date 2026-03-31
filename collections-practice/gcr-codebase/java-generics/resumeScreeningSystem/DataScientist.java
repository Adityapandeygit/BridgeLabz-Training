package collections_practice.gcr_codebase.java_generics.resumeScreeningSystem;

public class DataScientist extends JobRole{
	private int mlScore;
    public DataScientist(String name, int exp, int mlScore) {
        super(name, exp);
        this.mlScore = mlScore;
    }
    boolean isQualified() {
        return experience >= 1 && mlScore >= 75;
    }
}
