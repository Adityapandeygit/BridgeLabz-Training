package collections_practice.gcr_codebase.java_collections.list_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateElementsinaList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		System.out.println("List before rotation");
		System.out.println(list);
		
		int rotate = 2;
		int k = rotate%list.size();
		
		List<Integer> rotated = new ArrayList<>();
		for(int i=k;i<list.size();i++) {
			rotated.add(list.get(i));
		}
		for (int i = 0; i < k; i++) {
            rotated.add(list.get(i));
        }
		System.out.println("List after rotation");
		System.out.println(rotated);
		
	}
}
