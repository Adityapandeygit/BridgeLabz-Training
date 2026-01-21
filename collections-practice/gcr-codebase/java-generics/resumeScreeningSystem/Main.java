package collections_practice.gcr_codebase.java_generics.resumeScreeningSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Resume<SoftwareEngineer> seResume =new Resume<>(new SoftwareEngineer("Aditya", 2, 85));
		Resume<DataScientist> dsResume =new Resume<>(new DataScientist("Rahul", 1, 72));
        Resume<ProductManager> pmResume =new Resume<>(new ProductManager("Neha", 4, 90));
        seResume.resumeScreaning();
        dsResume.resumeScreaning();
        pmResume.resumeScreaning();
        
        
        List<JobRole> allCandidates = new ArrayList<>();

        allCandidates.add(new SoftwareEngineer("Aman", 3, 60));
        allCandidates.add(new DataScientist("Pooja", 2, 88));
        allCandidates.add(new ProductManager("Riya", 5, 85));
        
        AiScreaning.aiScreening(allCandidates);
	}
}
