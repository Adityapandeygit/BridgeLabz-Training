package collections_practice.gcr_codebase.java_annotations;
class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("Old Feature - Do not use");
    }

    public void newFeature() {
        System.out.println("New Feature - Use this instead");
    }
}


public class LegacyDemo {
	public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();

        // Calling deprecated method
        api.oldFeature();

        // Calling new method
        api.newFeature();
    }
}
