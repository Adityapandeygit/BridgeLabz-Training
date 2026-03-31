package collections_practice.gcr_codebase.java_generics.resumeScreeningSystem;

import java.util.List;

public class Resume<T extends JobRole> {
	T jobRole;
	public Resume(T jobRole) {
		this.jobRole = jobRole;
	}
	public void resumeScreaning() {
		if(jobRole.isQualified()) {
			System.out.println("Resume selected");
		}
		else {
			System.out.println("Resume rejected");
		}
	}
}
