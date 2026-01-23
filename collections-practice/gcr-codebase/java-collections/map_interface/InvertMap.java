package collections_practice.gcr_codebase.java_collections.map_interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);
        Map<Integer, List<String>> invertedMap = new HashMap<>();
        for(String key : map.keySet()) {
        	int value = map.get(key);
        	if(!invertedMap.containsKey(value)) {
        		invertedMap.put(value, new ArrayList<>());
        	}
        	invertedMap.get(value).add(key);
        }
        System.out.println(invertedMap);
	}
}
