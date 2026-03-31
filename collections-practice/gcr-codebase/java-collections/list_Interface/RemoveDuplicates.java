package collections_practice.gcr_codebase.java_collections.list_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();;
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(5);
		
		for(int i=0;i<list.size();i++) {
			int check = list.get(i);
			for(int j=i+1;j<list.size();j++) {
				if(list.get(j)==check) {
					list.remove(i);
				}
			}
		}
		System.out.println("List after removing duplicates : "+list);
	}
}
