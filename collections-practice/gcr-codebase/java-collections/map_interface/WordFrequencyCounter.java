package collections_practice.gcr_codebase.java_collections.map_interface;

import java.util.HashMap;

public class WordFrequencyCounter {
	public static void main(String[] args) {
		String s = "hello world , hello java";
		String[] arr = s.split("[ ,]+");
		HashMap<String ,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
		}
		System.out.println(map);
		
	}
}
