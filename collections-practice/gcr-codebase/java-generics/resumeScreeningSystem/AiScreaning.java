package collections_practice.gcr_codebase.java_generics.resumeScreeningSystem;

import java.util.List;

public class AiScreaning {
	// Making Wild Card method
	public static void aiScreening(List<? extends JobRole> candidates) {
		for(JobRole roles : candidates) {
			if(roles.isQualified()) {
				System.out.println("Candidate passed Ai Screening test ");
			}
			else {
				System.out.println("Candidate failed Ai Screening test ");
			}
		}
	}
}
