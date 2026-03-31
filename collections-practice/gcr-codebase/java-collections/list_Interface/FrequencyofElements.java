package collections_practice.gcr_codebase.java_collections.list_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyofElements {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
		Map<String,Integer> map = new HashMap<>();
		for(String s : list) {
			if(map.containsKey(s)) {
				map.put(s,map.get(s)+1);
			}
			else {
				map.put(s, 1);
			}
		}
		System.out.println(map);
	}
}
