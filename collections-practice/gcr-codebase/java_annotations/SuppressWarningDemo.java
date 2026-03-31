package collections_practice.gcr_codebase.java_annotations;

import java.util.ArrayList;

public class SuppressWarningDemo {
	 public static void main(String[] args) {
		 @SuppressWarnings("unchecked")
	        ArrayList list = new ArrayList();

	        list.add("Java");
	        list.add("Annotations");
	        list.add(100);   // Allowed because no generics

	        // Type casting needed
	        String value = (String) list.get(0);

	        System.out.println(value);
	        System.out.println(list);
	 }
}
