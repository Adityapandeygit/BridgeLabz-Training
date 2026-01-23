package collections_practice.gcr_codebase.java_collections.map_interface;

import java.util.HashMap;

public class KeywiththeHighestValue {
	public static void main(String[] args) {
		HashMap<String , Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 15);
		int max = Integer.MIN_VALUE;
		for(String key : map.keySet()) {
			if(map.get(key)>max) {
				max = map.get(key);
			}
		}
		System.out.println(max);
	}
}
