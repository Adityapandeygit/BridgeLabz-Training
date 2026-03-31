package collections_practice.gcr_codebase.java_collections.map_interface;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> result = new HashMap<>();
        
        for(String key:map1.keySet()) {
        	result.put(key,map1.get(key));
        }
        
        for(String key:map2.keySet()) {
        	if(result.containsKey(key)) {
        		result.put(key, result.get(key) + map2.get(key));
        	}
        	else {
                result.put(key, map2.get(key));
            }
        }
        System.out.println(result);
	}
}
